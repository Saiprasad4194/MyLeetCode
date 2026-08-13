import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        LocalDate no1=LocalDate.parse(date1);
        LocalDate no2=LocalDate.parse(date2);

       return (int)Math.abs(ChronoUnit.DAYS.between(no1, no2));
    }
}