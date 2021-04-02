package Chepter_04;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now(ZoneId.systemDefault()));

        LocalDate newYear = LocalDate.of(2021, 07, 07);
        int day = newYear.getDayOfMonth();
        int month = newYear.getMonthValue();
        int year = newYear.getYear();
        System.out.println(day + " /" + month+ " /" + year);
    }
}
