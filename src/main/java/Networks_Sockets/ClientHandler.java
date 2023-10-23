package Networks_Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler implements Runnable {

    private final BufferedReader in;
    private final PrintWriter out;
    private final ArrayList<ClientHandler> clients;

    public ClientHandler(Socket clientSocket, ArrayList<ClientHandler> clients) throws IOException {
        this.clients = clients;
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        out = new PrintWriter(clientSocket.getOutputStream(), true);
    }


    @Override
    public void run() {
        try {
            while (true) {
                String request = in.readLine();
                if (request == null) break;
                if (request.contains("name")) {
                    out.println(Server.getRandomName());
                } else if (request.startsWith("say")) {
                    int firstSpace = request.indexOf(" ");
                    if (firstSpace != -1) {
                        outToAll(request.substring(firstSpace + 1));
                    }
                } else {
                    out.println("Type, tell me a name to get a random name");
                }
            }

        } catch (IOException e) {
            System.err.println("IO exception in client handler");
            System.err.println(e.getMessage());
        } finally {
            out.close();
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private void outToAll(String msg) {
        for (ClientHandler aClient : clients) {
            aClient.out.println(msg);
        }
    }
}
