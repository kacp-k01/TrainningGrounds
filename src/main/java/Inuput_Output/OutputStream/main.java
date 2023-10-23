package Inuput_Output.OutputStream;

import java.io.IOException;

public class main {
    public static void main(String[] args) {

        //only ASCII characters this way
        System.out.write(75);


        String tekst = "hahahahahhah";
        byte[] data = tekst.getBytes();

        try {
            System.out.write(data);

        }
        catch (IOException e){
            System.err.println(e);
        }
        finally {
            System.out.close();
        }

        System.out.flush();






    }
}
