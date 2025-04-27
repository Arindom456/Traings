package Java;

public class ChildSuper extends ParentSuper{
	String Name = "Aloke";
	public void Namecall()
	{
		
		System.out.println(Name);
		System.out.println(super.Name);
	}
	public void fname()
	{
		super.fname();
		System.out.println("Child First name");
	}
	public static void main(String[] args) {
		ChildSuper cs = new ChildSuper();
		//it should prefer local rather than Parent
		cs.Namecall();
		cs.fname();

	}
}