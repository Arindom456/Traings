package Java;
import java.util.Scanner;
public class InputDemo {
	
	public static void main(String[] args)
	{
		//int num = 120;
		Scanner val = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int number = val.nextInt();
		System.out.println("Number is "+ number);
	}
	
}
