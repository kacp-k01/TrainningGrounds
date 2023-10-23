package Jar;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\Foxrabbit\\Desktop\\IT\\Java\\Programes\\testJar\\out\\artifacts\\testJar_jar\\testJar.jar";

        byte[] bytes = Files.readAllBytes(Paths.get(filePath));


//        or

        File file = new File(filePath);
        byte[] bytes2 = Files.readAllBytes(file.toPath());

        System.out.println(Arrays.toString(bytes2));




    }
}
