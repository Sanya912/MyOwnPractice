package Book1;

import java.util.*;
import java.util.Scanner;

public class First {
	final double P = 3.14; //final - constant. We can not change in the code
	 static double day = 2;
	 static double remain = (2*100)%7;
	 static double e = 4.1;
	 static int r =(int)e;
	 static double saleTax = 0.06;
	
	

	public static void main(String[] args) {
		
		//System.out.println(new java.util.Date());
		//System.out.println(r);
		//System.out.println(System.currentTimeMillis());
	
		Scanner input = new Scanner(System.in);
		double purchase =input.nextDouble();
		double total = purchase + saleTax * purchase;
		System.out.println(total);
		
		
		//String b = input.nextLine();
		//System.out.println("You entered: " + b);
		
		
	}

	
}
