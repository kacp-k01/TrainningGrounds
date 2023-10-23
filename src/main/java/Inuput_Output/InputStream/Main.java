package Inuput_Output.InputStream;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//    chunk of data
        try {
            byte[] input = new byte[50];

            System.in.read(input, 25, 50);
            for (byte b : input) {
                System.out.write(b);
            }
            System.out.flush();


        } catch (IOException e) {
            System.err.println(e.getMessage());
        }


    }
}
