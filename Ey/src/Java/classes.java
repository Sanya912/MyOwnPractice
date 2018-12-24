package Java;

public class classes {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guy Alex = new Guy("Alex", 18);
	Alex.Printer();
	} 
}

class Guy{
	
	public String name;
	public int age;

	Guy(String name, int age){
	 this.name=name;
	 this.age=age;
}
	
	public void Printer() {
				
		System.out.println("Alex's name is " + name + " Alex's age is " + age);
	}
}