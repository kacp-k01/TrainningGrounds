package Exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CustomException {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 3) {
            throw new CustomException("error");
        }
    }
}