package Book1;

public class ArrayMax {
	

	public static void main(String[] args) {
		max(3,5,60, 78,8,9,110,7);
		
	}

	public static void max (double ... numbers) {
		if (numbers.length==0) {
			System.out.println("No arg numbers");
			//return;
		}
		double result = numbers[0];
		for(int i =1; i<numbers.length; i++) {
			if(numbers[i]>result) {
				result = numbers[i];
				//System.out.println("Max value: " + result);
			}
		}System.out.println("Max value: " + result);
	}
}
