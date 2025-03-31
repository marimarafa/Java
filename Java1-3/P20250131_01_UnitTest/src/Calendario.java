import java.util.*;

public class Calendario {

	public static void main(String[] args) {
		SetCalendario(4, 2, 2025);
	}

	public static String SetCalendario(int day, int month, int year) {
		Calendar calendar = new GregorianCalendar();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month -1);
		calendar.set(Calendar.DAY_OF_MONTH, day);

		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		String dayName = getDayName(dayOfWeek);
		return dayName;
	}
	
	public static String getDayName(int dayOfWeek) {
		switch (dayOfWeek) {
		case Calendar.SUNDAY:
			return "Domenica";
		case Calendar.MONDAY:
			return "Lunedì";
		case Calendar.TUESDAY:
			return "Martedì";
		case Calendar.WEDNESDAY:
			return "Mercoledì";
		case Calendar.THURSDAY:
			return "Giovedì";
		case Calendar.FRIDAY:
			return "Venerdì";
		case Calendar.SATURDAY:
			return "Sabato";
		default:
			return "Giorno sconosciuto";
		}
	}

}
