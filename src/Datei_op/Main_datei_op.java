package Datei_op;

import java.io.*;

public class Main_datei_op {

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
            // Create new Reader

            String string = reader.readLine();
            System.out.println(string);
            // do something with your String
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
