package Internationalization;

import java.util.*;

public class Currencies {

    public static void main(String[] args) {
        Locale def = Locale.getDefault();

        Locale[] loc = Locale.getAvailableLocales();

        char[] zera = {'0', '0', '0', '0', '0', '0'};

        for (Locale locale : loc) {
            String countryCode = locale.getCountry();
            if (countryCode.isEmpty()) continue;

            String kraj = locale.getDisplayCountry(def);
            String jezyk = locale.getDisplayLanguage(def);

            Currency c = Currency.getInstance(locale);
            String sym = c.getSymbol();
            String nsym = c.getSymbol(locale);
            String icode = c.getCurrencyCode();
            int cdig = c.getDefaultFractionDigits();

            System.out.println(locale + " kraj: " + kraj + " język: " + jezyk +
                    "\nwaluta: " + sym + " " + nsym + " " + icode +
                    " grosz = 1/1" + new String(zera, 0, cdig) + " " + sym +
                    "\n============================================================"
            );
        }
    }

}