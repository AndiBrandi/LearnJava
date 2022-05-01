package Sockets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {


    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = null;
            serverSocket = new ServerSocket(12001);
            while (true) {

                try (Socket s = serverSocket.accept()) {

                    Scanner scanner = new Scanner(s.getInputStream());

                    StringBuilder sb = new StringBuilder(scanner.next());
                    String string = sb.reverse().toString();

                    PrintWriter printWriter = new PrintWriter(s.getOutputStream(), true);
                    printWriter.println(string);

                } catch (Exception e) {
                    e.printStackTrace();

                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
