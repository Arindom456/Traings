package Java;
import java.util.Date;
import java.text.SimpleDateFormat;
public class DateClass {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/YYYY hh:mm:ss");
		System.out.println(sdf.format(d));

	}

}
