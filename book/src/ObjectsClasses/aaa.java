package ObjectsClasses;

public class aaa {
	String team[] = new String[5];
	int numPlayer;
	
	void pl(String player) {
		team[numPlayer]=player;
		numPlayer++;	
	}
	int colPl() {
		return numPlayer;
	}
	

	public static void main(String[] args) {
		aaa obj = new aaa();
		obj.pl("Anton");
		obj.pl("Andr");
		obj.pl("Anton");
		obj.pl("Andr");
		System.out.println("Players: " + obj.colPl());
		
		for(int i=0; i<obj.colPl(); i++) {
			System.out.println("Name: " + obj.team[i]);
		}

	}

}
