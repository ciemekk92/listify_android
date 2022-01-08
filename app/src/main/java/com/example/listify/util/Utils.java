package com.example.listify.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    public static String formatDate(Date date) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) SimpleDateFormat.getDateInstance();
        simpleDateFormat.applyPattern("dd-MM-YYYY");

        return simpleDateFormat.format(date);
    }
}
