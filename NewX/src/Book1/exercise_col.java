package Book1;

public class exercise_col {

	public static void main(String[] args) {
		double colSum = 0;
		int num = -1;
		double [][]matrix= { {1.5, 2, 3, 4},
							 {5.5, 6, 7, 8},
							 {9.5, 1, 3, 1} };
		for(int col=0; col<matrix[0].length; col++) {
			colSum=0;
			num +=1;
			System.out.print("Sum of the elements at column " + num + " is: ");
			for(int row = 0; row<matrix.length;row++) {
				colSum+=matrix[row][col];
				
				
				
			} System.out.println(colSum);
		} 	

	}	

}
