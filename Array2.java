package Java;

public class Array2 {

	public static void main(String[] args) {
	//one way of initilizing an array//
		
		int a[] = new int[5];
	a[0]= 5;
	a[1] = 10;
	a[2]= 16;
	a[3]= 54;
	a[4]= 63;
	
	//Another way of initilizing an Array//
	
	int b[] = {1,2,3,4,5};
	
	for(int i =0; i<b.length; i++)
	{
		System.out.println(b[i]);
	}

	}

}
