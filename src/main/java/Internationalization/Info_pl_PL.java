package Internationalization;

import java.util.*;
public class Info_pl_PL extends ListResourceBundle {

    public Object[][] getContents() {
        return contents;
    }

    private Object[][] contents = {
            {  "english", "Angielski" },
            {  "polish", "Polski" },
            {  "enterData", "Wypłata" },
            {  "report", "Dnia {0,date} o godzinie {0,time}" +
                    " wypłacono {1,number,currency}" },
            {  "parseError", "Nieprawidłowy format wartości do wypłaty {0}" },
            {  "exceedError", "Możliwa suma wypłat {0,number,currency}" +
                    " została przekroczona" },
    };

}