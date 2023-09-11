package de.wolffclan;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Now: " + localDateTime);
        LocalDateTime twoWeeksLater = localDateTime.plusWeeks(2);
        System.out.println("Two weeks later: " + twoWeeksLater);

        if (localDateTime.isAfter(twoWeeksLater)) {
            System.out.println(localDateTime + " is after " + twoWeeksLater);
        }
        if (localDateTime.isBefore(twoWeeksLater)) {
            System.out.println(localDateTime + " is before " + twoWeeksLater);
        }

        LocalDateTime startTime = LocalDateTime.of(2023,9,11,0,0);
        LocalDateTime endTime = LocalDateTime.of(2023,12,24,12,0);

       long difference= ChronoUnit.DAYS.between(startTime,endTime);
        System.out.println("Difference between \n " + startTime + " \n and \n " + endTime + " \n are " + difference + " Days");

        System.out.println("\n Animal Birthday \n ---------------");
        Animal hippo = new Animal(LocalDate.of(2010, 10, 2), "Hippo");
        System.out.println("Today: " +LocalDate.now());
        System.out.println("Only " + hippo.getDaysToBirthday() + " to birthday....");
        System.out.println("Day of birth: " + hippo.birthDay());

    }
}