package Java;

import java.util.Calendar;

public class CalenderClass {

	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
		System.out.println(cl.get(Calendar.DATE));
		System.out.println(cl.get(Calendar.AM_PM));
		System.out.println(cl.get(Calendar.DAY_OF_WEEK));
		System.out.println(cl.get(Calendar.DAY_OF_YEAR));

	}

}
