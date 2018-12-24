package Book1;

import java.util.Scanner;

public class arrayCities {

	public static void main(String[] args) {
		
		String [][] citiesAndCaP = { {"PA", "PHILA"}, {"DE", "WILMINGTON"} };
		System.out.println("Enter capital of PA: ");
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		String b = a.toUpperCase();
		System.out.println(b);
		if(b.equals(citiesAndCaP[0][1])) {   //citiesAndCaP[0][1]
			System.out.println("Your answer is correct. Good job");
			
		} else {
			System.out.println("Your answer is WRONG!!!");
		}
		
		

	}

}
