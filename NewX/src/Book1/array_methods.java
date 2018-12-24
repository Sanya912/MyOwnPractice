package Book1;

public class array_methods {
	public static void prinArray (int[]array) {
	for(int i=0; i<array.length; i++)  {
		System.out.println(array[i]+" ");
	}
	}

	public static void main(String[] args) {
		prinArray(new int[]{2,4,6,8,0,12});
//		int [] array= new int [5];
//		array = new int [57];
//		System.out.println(array.length);
		

	}

}
