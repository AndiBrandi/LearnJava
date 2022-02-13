package File_operations;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
            // Create new Reader

            String string = reader.readLine();
            // do something with your String
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
