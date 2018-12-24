package Book1;

import java.util.Scanner;

public class SecondIfElse {

	public static void main(String[] args) {
		Scanner my = new Scanner(System.in);
		System.out.println("Print number: ");
		int x = my.nextInt();
		if(x > 5)
			System.out.println("More than 5");
		else
		System.out.println("Less than 5");
		int ex = my.nextInt();
		
		if (ex>3)
			if(ex>20)
				System.out.println("...>3");
			else
				System.out.println("Less...");

	}

}
