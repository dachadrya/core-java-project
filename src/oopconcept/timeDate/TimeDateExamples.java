package oopconcept.timeDate;
import java.time.Instant;
import java.time.LocalDate;
public class TimeDateExamples {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("Current instant: " + now);

        LocalDate today = LocalDate.now();
        LocalDate specificDate = LocalDate.of(2021, 12, 31);
        System.out.println("Today's date: " + today);
        System.out.println("Specific date: " + specificDate);
    }
}
