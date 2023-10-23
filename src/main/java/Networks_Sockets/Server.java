package Networks_Sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    private static final String[] names = {"Soyak", "Normie", "Kajto", "Jimbo"};
    private static final String[] adjs = {"the kajto", "the stupid", "the worthless", "the useless"};
    private static final int PORT = 9090;

    private static final ArrayList<ClientHandler> clients = new ArrayList<>();

    private static final ExecutorService pool = Executors.newFixedThreadPool(4);

    public static void createServer() {
        try {
            ServerSocket listener = new ServerSocket(PORT);

            while (true) {
                System.out.println("[SERVER] Waiting for client connection...");
                Socket client = listener.accept();
                System.out.println("[SERVER] Connected to client!");
                ClientHandler clientThread = new ClientHandler(client, clients);
                clients.add(clientThread);

                pool.execute(clientThread);
            }
        } catch (IOException | SecurityException | IllegalArgumentException exception) {
            exception.printStackTrace();
        }
    }


    public static String getRandomName() {
        String name = names[(int) (Math.random() * names.length)];
        String adj = adjs[(int) (Math.random() * adjs.length)];
        return name + " " + adj;
    }

}
