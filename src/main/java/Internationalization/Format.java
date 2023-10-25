package Internationalization;

import java.text.*;
import java.math.*;
import java.util.Locale;

public class Format {

    public static void show(double n1, Double n2, BigDecimal n3,
                            String format) {
        DecimalFormat df = new DecimalFormat(format);
        System.out.println("Format " + format);
        System.out.println("Liczba: " + n1 + " wygląda tak: " + df.format(n1));
        System.out.println("Liczba: " + n2 + " wygląda tak: " + df.format(n2));
        System.out.println("Liczba: " + n3 + " wygląda tak: " + df.format(n3));
    }


    public static void main(String[] args) {
        Locale locale = new Locale("de", "Germany");
        Locale.setDefault(locale);
        double num1 = 1.346;
        double num2 = 0.765474;
        BigDecimal num3 = new BigDecimal("100.2189091");

        show(num1, num2, num3, "#.##");
        show(num1, num2, num3, "#.## %");
        show(num1, num2, num3, "#.0000");
        show(num1, num2, num3, "#.00 ¤");
        show(num1, num2, num3, "#.00 ¤¤");
        show(num1, num2, num3, "[ 000.0 ]");

    }

}