
public class Calculator {
  public Calculator(){
    
  }
  public int add(int a, int b){
  int sum = a + b; 
    return sum;
  }
  public int substract(int a, int b){
    int min = a-b;
    return min;
  }
  public int multiply(int a, int b){
    int multi = a *b;
    return multi;
  }
  public int devide(int a, int b){
	  
    if(b==0) {
    	
      System.out.println("Error! Dividing by zero is not allowed.");
      return 0;
    } else {
    	int dev = a/b;
    	return dev;
    }
	
    
  }
  public int modulo(int a, int b){
    if(b==0) {
      System.out.println("Error! Dividing by zero is not allowed.");
      return 0;
    } else {
      int mod = a%b;
      return mod;
    }
	
  }
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.substract(45,11));
    System.out.println(myCalculator.devide(10,2));
    System.out.println(myCalculator.modulo(10,4));
	}

}
