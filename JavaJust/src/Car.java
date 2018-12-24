
public class Car extends SpeedLim {
	int Speeed;
	int simpleFine = 120;
	int LoseDL=150;
	
	
	
	public Car() {
		
		
		
	}
	public void MySpeed(int speed) {
		System.out.println("My speed is:" + speed);
		 Speeed=speed;
	}
	public void Max()
	{
		if(Speeed>=speedLimit) {
		System.out.println("You got a ticket $200" );
		}else {
			System.out.println("Good to go");
		
		}
		
	}
	public void fines() {
		if(Speeed<speedLimit) {
			System.out.println("You are a very good driver");
		}
		
			//
		else if(simpleFine<Speeed) {
				System.out.println("You are losing your DL");
			}
			else {
				System.out.println("Fine with DL restriction for 1 year");	
			}
		}
		
	
	
	

	public static void main(String[] args) {
		Car Honda = new Car();
		Honda.MySpeed(140);
		Honda.Max();
		Honda.fines();
		
		
		
	}

}
