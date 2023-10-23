package Jar;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        String filePath = "Write/your/Path";

        File file = new File(filePath);
        byte[] bytes2 = Files.readAllBytes(file.toPath());
        System.out.println(Arrays.toString(bytes2));
    }
}
