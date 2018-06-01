package employeeinfo;//package prog3_1_startup;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Util {

	public static final String DATE_PATTERN = "MM/dd/yyyy";

	public static String dateAsString(Date d) {
		DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
		return f.format(d);
	}

	public static String localDateAsString(LocalDate date) {
		return date.format(DateTimeFormatter.ofPattern(DATE_PATTERN));
	}
	
}
