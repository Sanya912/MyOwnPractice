import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableexercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		System.setProperty("webdriver.gecko.driver", "C:\\Windows\\System32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/20178/aus-vs-zim-6th-match-australia-and-pakistan-in-zimbabwe-t20i-tri-series-2018");
		
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']")); //1table 
		int rowcount = table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size(); //just 1 row
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']  div:nth-child(3)")).size(); //find 3d line
		
		for(int i =0; i<count-2; i++) //shows all number - 2 last (Extras and total)
		{
			String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']  div:nth-child(3)")).get(i).getText(); //create own path with child 3d child from parent
			int valueinteger = Integer.parseInt(value); //convert string to int
			sum=sum+valueinteger; //sum all numbers in the table from 0 +...
		}
		//System.out.println(sum);
		String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText(); //find by xpath extras in the table
		int extrasValue = Integer.parseInt(Extras); //convert string to the int
		System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());//find by xpath Total in the table
		int Tot = sum+extrasValue; //use math to sum all numbers + extras and it will be the same as Total in the table
		System.out.println(Tot);
		
		String ActualTotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int ActualTotalValue =Integer.parseInt(ActualTotal);
		if(ActualTotalValue==Tot)
		{
			System.out.println("Count matches");
		}
		else {
			System.out.println("Count fails");
		}
		

	}

}
