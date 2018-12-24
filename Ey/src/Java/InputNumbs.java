package Java;

import java.util.Scanner;

public class InputNumbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inn = new Scanner(System.in);
		System.out.println("Put 3 numbers: ");
		double num1=inn.nextDouble();
		double num2=inn.nextDouble();
		double num3=inn.nextDouble();
		double sum = num1+num2+num3;
		System.out.println("1st numer + 2number + 3number: " + num1+num2+num3);
		System.out.println("Your sum = " + sum);
		

	}

}
