package Java;

import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		System.out.println("Put any number: ");
		Scanner scan = new Scanner(System.in);
		int my= scan.nextInt();
		
		int i =(int)(Math.random()*3);
		
		if(my ==i) {
			System.out.println("Your made it");
		} else {
			System.out.println("Next time");
		}
	}

}
