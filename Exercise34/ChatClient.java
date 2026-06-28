import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader keyboard = new BufferedReader(
                    new InputStreamReader(System.in));

            String message;
            while (true) {
                System.out.print("Client: ");
                message = keyboard.readLine();
                output.println(message);

                if (message.equalsIgnoreCase("bye")) {
                    break;
                }

                String serverMessage = input.readLine();
                System.out.println("Server: " + serverMessage);
            }

        } catch (Exception e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}