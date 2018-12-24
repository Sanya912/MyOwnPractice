import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Third {
	@AfterSuite
	public void after() {
		System.out.println("After All suites 3d");
	}
	@Test
	public void tes() {
		System.out.println("Ny 3 i");
	}
	@Test
	public void tesa() {
		System.out.println("Ny 3 i ewe");
	}

}
