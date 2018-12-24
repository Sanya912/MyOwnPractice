package Book1;

public class Third_while {
	//int a =2; 
	//int b = 3;
	
	 int fir (int a, int b) {
		int result;
		if(a>b) {
			result =a;
			
			System.out.println(result);
		} else {
			result =b;
			System.out.println(result + " Bigger");
		}
		
		return result;
	}
	

	public static void main(String[] args) {
		Third_while n = new Third_while();
		n.fir(2, 3);
		System.out.println();
		/*double a = 100;
		int b =0;
		while (a<200) {
			a = a*1.6;
			b++;
			System.out.println(a);    */
		} 

	}


