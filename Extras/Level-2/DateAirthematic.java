import java.time.LocalDate;
public class DateAirthematic{
 public static void main(String[] args) {
	 LocalDate date = LocalDate.of(2025, 1, 16);
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2);
		result=date.minusWeeks(3);
        System.out.println("Resulting Date: " + result);
    }
}