package Inuput_Output.FilterStreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileOutputStream fout;
        CustomOutputFilter output = null;
        try {
            fout = new FileOutputStream("src/MyFrame/resources/output.txt");
            output = new CustomOutputFilter(fout);

            for (int i = System.in.read(); i != 'X'; i = System.in.read()) {
                output.write(i);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                assert output != null;
                output.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }

    }
}
