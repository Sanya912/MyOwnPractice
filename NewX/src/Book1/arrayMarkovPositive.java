package Book1;

public class arrayMarkovPositive {

	public static void main(String[] args) {
	
		double [][] matrix = { {0.15, -0.875, 0.375},
							 {0.55, 0.005, 0.225},
							 {0.30, 0.12, 0.4} };
		
		for(int row = 0; row<matrix.length; row++) {
			double sum = 0;
			for(int col =0; col<matrix[row].length; col++) {
				sum+=matrix[row][col];
				
			}if(sum<0) {
				System.out.println("not Markov");
			} else {
				System.out.println("Markov");
			}
				System.out.println(sum);
			//System.out.println(each);
		}

	}

}
