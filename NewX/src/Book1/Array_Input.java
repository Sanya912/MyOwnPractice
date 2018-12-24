package Book1;

import java.util.Scanner;

public class Array_Input {

	public static void main(String[] args) {
//		System.out.println("Put numbers: " );
//		Scanner input = new Scanner(System.in);
//		int i = input.nextInt();
//if (i==1) {
//	System.out.println("Put numbers AGAIN: " );
//	Scanner inputt = new Scanner(System.in);
//	int ii = input.nextInt();
//}else {
//	System.out.println("gooood " );
//}
		
		//int [] myArray= {2,3,4,5};
//		int total=0;
//		for(int i =0; i<myArray.length; i++) {
//			total+=myArray[i];
//			//System.out.println(total);
//		}
		int [] array= {3,4,53,62,1,45};
		int [] ar = new int[6];
		System.arraycopy(array, 0, ar, 0, array.length); //faster than array.clone()
		
		//int [] ar = array.clone();
		System.out.println(ar[1]);
		//double max=array[0];
		int max=0;
		int index =0;
		for(int i =0; i<array.length; i++) {
			if(array[i]>max) max = array[i]; //the biggest number
			index=i; //index for the biggest number
			
		}// System.out.println(max);	
		//System.out.println(index);
		
		
		
		
	}

}
