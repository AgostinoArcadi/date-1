import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();

        String dateFull = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        System.out.println("Full: " + dateFull);

        String dateMedium = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("Medium: " + dateMedium);

        String dateShort = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        System.out.println("Short: " + dateShort);
    }
}
