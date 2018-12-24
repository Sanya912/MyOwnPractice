package ObjectsClasses;

public class Tot {
int i;
	Tot(int i){
		this.i=i;
	}
	Tot(){
		this(3);
	}

	public static void main(String[] args) {
	Tot a = new Tot();
	System.out.println(a.i);
	}
		

}
