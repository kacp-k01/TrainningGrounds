package Internationalization;

import lombok.Getter;

import java.util.*;
public class Info_en_GB extends ListResourceBundle {

@Getter
    private final Object[][] contents = {
            { "english", "English" },
            { "polish", "Polish" },
            {  "enterData", "Withdrawal" },
            { "report",
                    "At {0,time} on {0,date} value of {1,number,currency} was withdrawed" },
            { "parseError", "Invalid value format: {0}" },
            { "exceedError", "Total ammount {0,number,currency} exceeded" },
    };

}