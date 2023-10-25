package Internationalization;

import javax.swing.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws ParseException {
        SwingUtilities.invokeLater(Msg1::new);


        report();
        Locale.setDefault(new Locale("es"));

        double d = 10 / 3.0;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(3);
        String wynik = nf.format(d);
        System.out.println(wynik);


        Calendar c = Calendar.getInstance();
        System.out.println(c.getTimeZone());
    }

    static public void report() {
        Locale defLoc = Locale.getDefault();
        System.out.println("Domyślna lokalizacja : " + defLoc);
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(df.format(new Date()));
        System.out.println(nf.format(1234567.1));
    }
}
