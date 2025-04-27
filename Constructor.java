package Java;

public class Constructor {

	Constructor()
	{
		System.out.println("I am constructor");
	}
	Constructor(int a, int b)
	{
		System.out.println("I am Parameterzed constructor");
		int c= a+b;
		System.out.println(c);
	}
	public void getdata()
	{
		System.out.println("Method");
	}
	public static void main(String[] args) {
		//No need to call constructor//
		Constructor cn = new Constructor();
		Constructor pc = new Constructor(4,5);
		//Call Method//
		cn.getdata();
	}
}
