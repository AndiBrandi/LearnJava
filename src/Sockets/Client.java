package Sockets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 12001);
            Scanner scanner = new Scanner(socket.getInputStream());


            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);

            printWriter.println("Hallo");

            System.out.println(scanner.next());


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
