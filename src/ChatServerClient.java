import java.io.*;
import java.net.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChatServerClient {

    public static void main(String[] args) {
        // Start the server in a separate thread
        new Thread(() -> startServer()).start();

        // Start the client
        startClient();
    }

    private static void startServer() {
        final int PORT = 12345;
        Set<PrintWriter> clientWriters = new HashSet<>();

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Chat server started...");
            while (true) {
                new ClientHandler(serverSocket.accept(), clientWriters).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler extends Thread {
        private Socket socket;
        private PrintWriter out;
        private BufferedReader in;
        private Set<PrintWriter> clientWriters;

        public ClientHandler(Socket socket, Set<PrintWriter> clientWriters) {
            this.socket = socket;
            this.clientWriters = clientWriters;
        }

        public void run() {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

                this.out = out;
                synchronized (clientWriters) {
                    clientWriters.add(out);
                }

                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("Received: " + message);
                    synchronized (clientWriters) {
                        for (PrintWriter writer : clientWriters) {
                            writer.println(message); // Broadcast to all clients
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    System.err.println("Error closing socket: " + e.getMessage());
                }
                synchronized (clientWriters) {
                    clientWriters.remove(out);
                }
            }
        }
    }

    private static void startClient() {
        String SERVER_ADDRESS = "localhost";
        int PORT = 12345;

        try (Socket socket = new Socket(SERVER_ADDRESS, PORT);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             Scanner scanner = new Scanner(System.in)) {

            new Thread(() -> {
                try {
                    String message;
                    while ((message = in.readLine()) != null) {
                        System.out.println("Server: " + message); // Display server messages
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            String userInput;
            while (scanner.hasNextLine()) {
                userInput = scanner.nextLine();
                System.out.println("You: " + userInput);  // Display input before sending
                out.println(userInput);  // Send message to server
                out.flush();  // Explicit flush to ensure message is sent
            }
        } catch (IOException e) {
            e.printStackTrace();
}
}
}