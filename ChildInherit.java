package Java;

public class ChildInherit extends ParentInharit{
	//Method Overloading
	public void getdata(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	public void getdata(int a)
	{
		System.out.println(a);
	}
	//End
	
	//Method OverRiding
	public void Musicsystem()
	{
		System.out.println("JBL Speeker");
	}
	//End
public void color()
{
System.out.println(color);
}
	public static void main(String[] args) {
		ChildInherit a = new ChildInherit();
		a.Model();
		a.Musicsystem();
		a.color();
		a.getdata(10);
		a.getdata(20, 30);
	}

}
