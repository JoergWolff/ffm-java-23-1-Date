package de.wolffclan;

import java.time.LocalDate;
import java.time.Period;

public record Animal(LocalDate birthDay, String name) {

    public long getDaysToBirthday(){
        LocalDate nextBirthday = birthDay.withYear(LocalDate.now().getYear());
        if(nextBirthday.isBefore(LocalDate.now()) ||nextBirthday.isEqual(LocalDate.now())){
            nextBirthday = nextBirthday.plusYears(1);
        }
        return Period.between(LocalDate.now(), nextBirthday).getDays();
    }
}
