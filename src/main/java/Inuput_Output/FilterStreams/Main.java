package Inuput_Output.FilterStreans;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileOutputStream fout = null;
        CustomOutputFilter output = null;
        try {
            fout = new FileOutputStream();//sdasasd
            output = new CustomOutputFilter(fout);

            for (int i = System.in.read(); i != 'X'; i = System.in.read()) {
                output.write(i);
            }
        }
        catch (IOException e){
            System.err.println(e);
        }
        finally {
            try{
                output.close();
            }
            catch (IOException e){
                System.err.println(e);
            }
        }

    }
}
