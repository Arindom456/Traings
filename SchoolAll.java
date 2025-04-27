package Java;

public class SchoolAll implements School,NewSchool{

	public static void main(String[] args) {
		School a = new SchoolAll();
		a.Class1();
		a.Class2();
		a.Class3();
		
		SchoolAll b = new SchoolAll();
		b.Class4();
		
		NewSchool c = new SchoolAll();
		c.Class10();
		
	}

	public void Class1() {
		System.out.println("Class 1 Total 60 students");
		
	}

	public void Class2() {
		System.out.println("Class 2 Total 30 students");
		
	}

	public void Class3() {
		System.out.println("Class 3 Total 50 students");
		
	}

	public void Class4()
	{
		System.out.println("Class 4 Total 80 students");	
	}

	public void Class10() {
		System.out.println("Class 4 Total 120 students");
		
	}
}
