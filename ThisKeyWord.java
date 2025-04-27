package Java;

public class ThisKeyWord {

	int a = 5;
	ThisKeyWord()
	{
		int a=6;
		System.out.println(this.a);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		ThisKeyWord tk = new ThisKeyWord();

	}

}
