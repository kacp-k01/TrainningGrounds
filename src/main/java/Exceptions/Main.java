package Exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UbeSoLow {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a > 3){
            throw new UbeSoLow("u be so low");
        }

    }
}

class UbeSoLow extends Throwable{
    public UbeSoLow(String x) {
        System.err.println(x);
    }
}


class normie {
    private String name;
    private int age;

    public normie(String name, int age){
        this.name=name;
        this.age=age;
    }
}

class kajto extends normie{
    private String hobby;

    public kajto(String name, int age, String hobby) {
        super(name, age);
        this.hobby=hobby;
    }
}