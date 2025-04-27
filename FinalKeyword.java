package Java;

public class FinalKeyword {

	public static void main(String[] args) {
		final int a = 5; //constant variable//
		
		//if try to change a variable it will not allow
		//if class name is define as final so you cannot extends the class 
		//if final keyword use in method then you cannot overridden the method
		a = 9;
		
		System.out.println(a);

	}

}
