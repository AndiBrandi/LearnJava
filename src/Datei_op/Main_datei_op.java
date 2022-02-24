package Datei_op;

import java.io.*;

public class Main_datei_op {

    public static void main(String[] args) {

        String str = read();
        System.out.println(str);

        write("Kersan");

    }

    public static String read() {

        String string = "";
        try {
            // Create new Reader
            BufferedReader reader = new BufferedReader(new FileReader("src/Datei_op/test.txt"));

            // Read with your reader
            string = reader.readLine();
            // Do something with your String

        } catch (IOException e) {
            e.printStackTrace();
        }
        return string;
    }


    private static void write(String s) {

        try {
            // Create new Reader
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/Datei_op/test.txt"));

            // Write with your writer
            writer.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
