package dev.matteomeneghetti.sendhelp.utility;

import java.util.Date;

public class Utility {
    public static String date2String(Date data) {
        return data.getDate()+"/"+data.getMonth()+"/"+data.getYear();
    }
}
