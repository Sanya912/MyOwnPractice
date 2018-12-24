
public class Multidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		int a[] [] = new int[2][3]; //same as b
		a[0][0]=2;
		a[0][1] =4;
		a[0][2]=5;
		a[1][0]=3;
		a[1][1]=4;
		a[1][2] =7;
		//System.out.println(a[1][2]);
		
		int b[][] = {{2,4,5}, {3,4,7}, {5,2,1}}; //same as a but easy code
		//System.out.println(b[2][1]);
		for(int i=0; i<2; i++)
		
			for(int r=0;r<3;r++)
		
				
			
			System.out.println(b[i][r]);
		
		
		
	}

}
