package Java;

import java.util.Scanner;

import org.testng.Assert;

public class InputTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inn = new Scanner(System.in);
		System.out.println("Put your number. I do your number + 5*3: ");
		double num = inn.nextDouble();
		double formula = num + 5*3;
		System.out.println("Final: "+formula);
		

	}
	
}
