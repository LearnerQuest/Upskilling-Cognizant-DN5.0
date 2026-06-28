import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server started. Waiting for client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader keyboard = new BufferedReader(
                    new InputStreamReader(System.in));

            String clientMessage;
            while (true) {
                clientMessage = input.readLine();
                if (clientMessage == null || clientMessage.equalsIgnoreCase("bye")) {
                    break;
                }

                System.out.println("Client: " + clientMessage);

                System.out.print("Server: ");
                String serverMessage = keyboard.readLine();
                output.println(serverMessage);
            }

            socket.close();
            System.out.println("Connection closed.");

        } catch (Exception e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}