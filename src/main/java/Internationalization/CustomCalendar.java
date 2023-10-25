package Internationalization;

import java.util.*;

public class CustomCalendar {

    public static void say(String s) {
        System.out.println(s + '\n');
    }

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        say("ERA.............. " + cal.get(Calendar.ERA) +
                " (tu: 0=pne, 1=AD)");

        say("ROK.............. " + cal.get(Calendar.YEAR));
        say("MIESIĄC.......... " + cal.get(Calendar.MONTH) +
                " (0-styczeń, 2-luty, ..., 11-grudzień)");

        say("LICZBA DNI\n" +
                "W MIESIĄCU....... " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));

        say("DZIEŃ MIESIĄCA... " + cal.get(Calendar.DAY_OF_MONTH));
        say("DZIEŃ MIESIĄCA... " + cal.get(Calendar.DATE));
        say("TYDZIEŃ ROKU..... " + cal.get(Calendar.WEEK_OF_YEAR));
        say("TYDZIEŃ MIESIĄCA. " + cal.get(Calendar.WEEK_OF_MONTH));
        say("DZIEŃ W ROKU..... " + cal.get(Calendar.DAY_OF_YEAR));

        say("PIERWSZY DZIEŃ\n" +
                "TYGODNIA......... " + cal.getFirstDayOfWeek() +
                " (1-niedziela, 2-poniedziałek, ..., 7 sobota)");

        say("DZIEŃ TYGODNIA... " + cal.get(Calendar.DAY_OF_WEEK) +
                " (1-niedziela, 2-poniedziałek, ..., 7-sobota)");

        say("GODZINA.......... " + cal.get(Calendar.HOUR) +
                " (12 godzinna skala; następne odwolanie czy AM czy PM)");

        say("AM/PM............ " + cal.get(Calendar.AM_PM) +
                " (AM=0, PM=1)");

        say("GODZINA.......... " + cal.get(Calendar.HOUR_OF_DAY) +
                " (24 godzinna skala)");

        say("MINUTA........... " + cal.get(Calendar.MINUTE));
        say("SEKUNDA.........  " + cal.get(Calendar.SECOND));
        say("MILISEKUNDA:      " + cal.get(Calendar.MILLISECOND));

        int msh = 3600 * 1000;

        say("RÓŻNICA CZASU\n" +
                "WOBEC GMT........ " + cal.get(Calendar.ZONE_OFFSET) / msh);

        say("PRZESUNIĘCIE\n" +
                "CZASU............ " + cal.get(Calendar.DST_OFFSET) / msh +
                " (w Polsce obowiązuje w lecie)");

    }

}