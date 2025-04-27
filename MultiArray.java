package Java;

public class MultiArray {

	public static void main(String[] args) {
		// one way//
		int a[][] = new int[2][3];
		a[0][0]=5;
		a[0][1]=4;
		a[0][2]=3;
		
		a[1][0]=3;
		a[1][1]=2;
		a[1][2]=1;
		//System.out.println(a[1][1]);
		//Other way//
		int b[][] = {{2,4,3},{3,2,1}};
		int min = b[0][0];
		//System.out.println(b[1][1]);	
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(b[i][j]);
				// Maximum if(b[i][j]>min)
				if(b[i][j]<min)
				{
					min = b[i][j];
				}
			}
		}
		System.out.println("Minimum number is "+min);
	}
}
