package Internationalization;

import java.util.*;

public class MyResourceBundle {

    static void sayHello() {

        int[] tab = {1, 22, 3, 52, 6};

        for (int i = 0; i < tab.length; i++) {
            for (int j = 1; j < tab.length - 1; j++) {
                if (tab[j - 1] > tab[j]) {
                    int temp = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = temp;
                }


            }
        }
        System.out.println(Arrays.toString(tab));
    }


    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        int x = 3;
        System.out.println(++x * 7);
        sayHello();
        sayHello();
    }

}