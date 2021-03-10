import java.text.ParseException;
import java.text.*;
import java.util.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
public class Hashy
{
public static void main(String[] args)
{
LocalDate today = LocalDate.now();
  System.out.println("Current Date="+today);
  
LocalDate from = LocalDate.of(2019, Month.JULY, 1);
        LocalDate to = LocalDate.now();

        LocalDate fromTemp = LocalDate.from(from);
         long days = fromTemp.until(to, ChronoUnit.DAYS);
        fromTemp = fromTemp.plusDays(days);
              
        System.out.println(days);
}


}
