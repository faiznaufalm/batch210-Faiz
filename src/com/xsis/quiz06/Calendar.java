package com.xsis.quiz06;

import java.util.GregorianCalendar;

public class Calendar {

    void Calendar(int month, int year, String[] months) {
        // GregorianCalendar months range from 0 to 11
        month = month - 1;
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(java.util.Calendar.YEAR, year);
        calendar.set(java.util.Calendar.MONTH, month);

        int daysInMonth = calendar.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);

        System.out.println("There are " + daysInMonth + " days in " + months[month] + " " + year);
    }

}
