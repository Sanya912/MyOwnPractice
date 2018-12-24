package ObjectsClasses;

public class gettersetter {
int ga;

int getGe() {
	return ga;
}
int setGe(int ga) {
	this.ga=ga;
	return ga;
	
}
gettersetter re = new gettersetter();

	public static void main(String[] args) {
		gettersetter obj = new gettersetter();
		
		obj.setGe(5);
		
		System.out.println(obj.getGe());

	}

}
