package Inuput_Output.InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class main {
    public static void main(String[] args) throws IOException {

    //        try {
    //            int[] data = new int[10];
    //            for(int i=0;i< data.length;i++){
    //                data[i] = System.in.read();
    //            }
    //            System.out.println("Input collection");
    //            for (int i = 0; i< data.length; i++){
    //                System.out.write(data[i]);
    //            }
    //            System.out.flush();
    //        }
    //
    //
    //        catch (IOException e){
    //            System.err.println(e);
    //        }


//        -1 means end of input

    //        try{
    //            InputStream input = new FileInputStream("ttt.txt");
    //
    //            while (true){
    //                int data = input.read();
    //                if(data==-1){
    //                    System.out.println("End of stream");
    //                    break;
    //                }
    //                else {
    //                    System.out.write(data);
    //                }
    //            }
    //            System.out.flush();
    //        }
    //        catch (IOException e){
    //            System.err.println(e);
    //        }
//    chunk of data
        try{
            byte[] input = new byte[50];

            System.in.read(input, 25, 50);
            for (int i = 0; i < input.length; i++) {
                System.out.write(input[i]);
            }
            System.out.flush();


        }
        catch (IOException e){
            System.err.println(e);
        }



    }
}
