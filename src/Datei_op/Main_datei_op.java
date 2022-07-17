package Datei_op;

import java.io.*;

public class Main_datei_op {

    public static void main(String[] args) {

        //Read text in file
        String str = read();

        //Output text in Console
        System.out.println(str);

        //Write "Hallo Huaba" to the file
        write("Hallo Huaba");

    }

    public static String read() {

        String string = "";
        try {
            // Create new Reader
            BufferedReader reader = new BufferedReader(new FileReader("src/Datei_op/test.txt"));

            // Read with your reader
            string = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return string;
    }


    private static void write(String s) {

        try {
            // Create new Writer
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/Datei_op/test.txt"));

            // Write with your writer
            writer.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
