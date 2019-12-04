package com.myapplication.task4_data_time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class StarWars {
    LocalDate releasedDate;
    int movieDuration;

    public StarWars(String releasedDate, int movieDuration) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");

        this.releasedDate = LocalDate.parse(releasedDate, formatter);

        this.movieDuration = movieDuration;
    }

    public void dayofReleased() {
        System.out.println(releasedDate.getDayOfWeek());
    }

    private int checkDays(LocalDate checkDate) {
        if (checkDate.getDayOfWeek() == DayOfWeek.SATURDAY) {
            return 1;
        } else if (checkDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
            return 2;
        }
        return 0;
    }

    public long countNrPlayingTimes(int numberOfYears) {
        LocalDate twoYearsOfPlay = releasedDate.plusYears(numberOfYears);
        long playingTimes = ChronoUnit.WEEKS.between(releasedDate, twoYearsOfPlay) * 2;
        return playingTimes + this.checkDays(releasedDate) + 1;
    }

    public void totaPlayingTime(int numberOfYears) {
        long totalMinutes = this.countNrPlayingTimes(numberOfYears) * movieDuration;
        long days = TimeUnit.DAYS.convert(totalMinutes, TimeUnit.MINUTES);
        long hours = TimeUnit.HOURS.convert(totalMinutes, TimeUnit.MINUTES);
        long hoursleft = hours - days * 24;
        System.out.printf("Movie played for a total number  of minutes in the first year: %s minutes\n" +
                "Total number of hours of play in the first year: %s hours:\n" +
                "Total number of days of play in the first year: %s days and %s hours", totalMinutes, hours, days, hoursleft);
    }
}