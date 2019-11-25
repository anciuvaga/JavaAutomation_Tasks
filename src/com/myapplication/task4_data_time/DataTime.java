package com.myapplication.task4_data_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class DataTime {
    public static void main(String[] args) {

    }

    //Task1 Frodo
    public static void timeDifferenceCount() {
        ZonedDateTime c = ZonedDateTime.of(LocalDateTime.parse("2019-11-11T06:00"), ZoneId.of("America/Los_Angeles"));
        System.out.println(c);
        ZonedDateTime v = ZonedDateTime.of(LocalDateTime.parse("2019-11-11T11:15"), ZoneId.of("Australia/Sydney"));
        System.out.println(v);
        Duration po = Duration.between(v, c);
        System.out.println("Difference is:" + po);
    }

    //Task2 StarWars
    public static void countOfMovieDuringTheYear() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        int count = 0;
        try {
            Date d1 = formatter.parse("1977-05-25 00:00:00");
            Date d2 = formatter.parse("1979-05-25 00:00:00");
            count = saturdaySundayCount(d1, d2);
        } catch (ParseException e) {
            System.err.println("Take care of input data! ");
            e.printStackTrace();
        }
        System.out.println("Count of movie shows = " + count);
        System.out.println("For one year film was played for " + (count / 2 + 1) * 120 + " minutes! ");
    }

    private static int saturdaySundayCount(Date d1, Date d2) {
        Calendar c1 = Calendar.getInstance();
        c1.setTime(d1);
        Calendar c2 = Calendar.getInstance();
        c2.setTime(d2);
        int sundays = 0;
        int saturday = 0;
        while (!c1.after(c2)) {
            if (c1.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                saturday++;
            }
            if (c1.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                sundays++;
            }
            c1.add(Calendar.DATE, 1);
        }
        return saturday + sundays;
    }

}



