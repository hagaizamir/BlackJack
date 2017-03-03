package edu.Hagai.java;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Created by dev on 2/17/2017.
 */
public class DateUtils {
    //what is the date and the time now
    public static LocalDateTime now (){
        return LocalDateTime.now();
    }

    //how many years from now

    public  static long howManyYearsFromNow (LocalDateTime date){
        LocalDateTime now = LocalDateTime.now();
        long years = now.until(date , ChronoUnit.YEARS);
        return now.until(date , ChronoUnit.YEARS);
    }
    //how many years between two dates
    public  static long differenceInYears (LocalDateTime from , LocalDateTime to){
        return to.until(from , ChronoUnit.YEARS);
    }
    //input a date
    public  static LocalDateTime getDate (String prompt){
        int years = IO.getInt("Enter the year" , 1900 , 2200);
        int month = IO.getInt("Enter the month" , 1 , 12);
        int day = IO.getInt("Enter the day" , 1, 31);

        return LocalDateTime.of(years , month , day , 0 , 0);
    }
}
