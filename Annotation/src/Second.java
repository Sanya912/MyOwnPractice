import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Second {
	@Test
	public void My() {
		System.out.println("AinSecond");
	}
	@BeforeSuite
	public void Before() {
		System.out.println("Before SUITE PRINt in second");
	}
	@Test
	public void just() {
		System.out.println("just");
	}

}
