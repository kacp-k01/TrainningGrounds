package Networks_Sockets;

import java.io.IOException;
import java.util.Scanner;

import static Networks_Sockets.Client.createClient;
import static Networks_Sockets.Server.createServer;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Choose: Client or Server");
        Scanner scanner = new Scanner(System.in);

        if (scanner.nextLine().equals("Client"))
            createClient();
        else if (scanner.nextLine().equals("Server"))
            createServer();

        else System.err.println("Wrong command");

    }
}
