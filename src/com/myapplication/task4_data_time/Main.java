package com.myapplication.task4_data_time;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println("The flight starts at 11:15 AM local Sydney time and ends at 06:00 AM local LA time.");
        System.out.println("What is the duration of the flight?");
        FlightDuration.countFlightDuration("Australia/Sydney", "America/Los_Angeles", "2019-11-20 11:15 AM", "2019-11-20 06:00 AM");

        System.out.println();
        System.out.println("Assume that it was played in cinemas on premiere (May 25, 1977) and then only once a day on every Saturday and Sunday");
        StarWars starWars = new StarWars("May 25, 1977", 120);

        System.out.println("What day of the week was it released?");
        starWars.dayofReleased();

        System.out.println("How many times was it played in the first 2 years?");
        System.out.println(starWars.countNrPlayingTimes(2));

        System.out.println("How many TOTAL minutes/hours/days of playtime it summed up in the 1st year?");
        starWars.totaPlayingTime(1);
    }
}
