package com.myapplication.task4_data_time;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class FlightDuration {

    public static void countFlightDuration(String departureZone, String arrivalZone, String departureDateTime, String arrivalDateTime) throws ParseException {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a");

        LocalDateTime departureLocalTime = LocalDateTime.parse(departureDateTime, formatter);
        LocalDateTime arrivalLocalTime = LocalDateTime.parse(arrivalDateTime, formatter);

        ZoneId localTimeZoneForDeparture = ZoneId.of(departureZone);
        ZoneId localTimeZoneForArrival = ZoneId.of(arrivalZone);

        ZonedDateTime sydneyLocalTimeZoneDeparture = departureLocalTime.atZone(localTimeZoneForDeparture);
        ZonedDateTime losAngelesLocalTimeZoneArrival = arrivalLocalTime.atZone(localTimeZoneForArrival);

        long flightDiff  = ChronoUnit.MINUTES.between(sydneyLocalTimeZoneDeparture, losAngelesLocalTimeZoneArrival);

        long hours = flightDiff  / 60;
        long minutes = flightDiff  % 60;

        System.out.printf("%s %d %s %d %s" ,"Duration of the flight from Sydney to Los Angeles is :", hours,"hours and ",  minutes, "minutes");
    }
}
