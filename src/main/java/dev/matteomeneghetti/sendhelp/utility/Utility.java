package dev.matteomeneghetti.sendhelp.utility;

import java.util.Date;

public class Utility {
    public static String date2String(Date data) {
        return data.getDate()+"/"+data.getMonth()+"/"+data.getYear();
    }
    public static Date string2Date(String stringa) {    // dd/MM/yyyy
        String[] stringaSplittata = stringa.split("/");
        return new Date(Integer.parseInt(stringaSplittata[2]), Integer.parseInt(stringaSplittata[1]), Integer.parseInt(stringaSplittata[0]));
    }
}
