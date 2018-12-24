package Book1;

public class SumColomn {

	public static void main(String[] args) {
		
		int [][]array={{1, 6},
				{4,5}};
		//System.out.println(array[0][1]);
		//int [][] matrix = new int [5][5];
		int [][] matrix = { {21,3,42,1},
							{3,5,6,8},
							{22,45,7,0} };
	
		int totalCol=0;
		
		for(int col =0; col<matrix[0].length; col++) {
			totalCol=0;
			for (int row = 0; row<matrix.length; row++) {
			totalCol+=matrix[row][col];	
			
			}   System.out.println(totalCol);
		}
//		for (int row = 0; row<matrix.length; row++) {
//				
//			for(int col =0; col<matrix[0].length; col++) {
//				totalCol+=matrix[row][col];	
//			}System.out.println(totalCol);

//}
	}}
