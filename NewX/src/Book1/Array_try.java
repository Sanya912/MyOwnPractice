package Book1;

public class Array_try {

	public static void main(String[] args) {
		double myList [] = new double[10];
		myList[0] = 134;
		myList[1] = 33.4;
		myList[2] = 23.4;
		myList[3] = 46.4;
		System.out.println(myList[0]);
		System.out.println(myList.length);
		
		int myLiist[]= {3,4,5,6,7,8};
		System.out.println(myLiist[4]);
		
		for(int i = 0; i>myList.length; i++) {
			myList[i]=i;
			System.out.println(myList[i]);
			
		}
	}

}
