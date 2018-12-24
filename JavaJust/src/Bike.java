
public class Bike {
	String name;
	int age;
	
	public Bike(String name, int age) {
		this.name = name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String Mistery() {
		return("Hi, my name is:" + this.getName() + ". My age is:" + this.getAge());
		
	}
	public static void main(String[] args) {
		Bike biker1 = new Bike("Alex", 26);
		System.out.println(biker1.Mistery());
	}
	

}
