package de.wolffclan;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public record Animal(LocalDate birthDay, String name) {

    public long getDaysToBirthday(){
        LocalDate localDate = LocalDate.now();
        if(localDate.getYear() > birthDay.getYear()){
            // int difference = localDate.getYear() - birthDay.getYear();
            int difference = localDate.getYear() +1;
            LocalDate nextDate = LocalDate.of(difference, birthDay.getMonth(),birthDay.getDayOfMonth());
            return ChronoUnit.DAYS.between(LocalDate.now(),nextDate);
        }
        return ChronoUnit.DAYS.between(LocalDate.now(),birthDay);
    }
}
