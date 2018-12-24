package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@BeforeClass
	public void befff()
	{
		System.out.println("before executing any methods in the class");
	}
	
	@Test()
	public void EXXX() {
		// example
		System.out.println("example for 1");
	}
	

	@Test(groups= {"Smoke"})
	public void WebloginCarLoan() {
		// selenium
		System.out.println("weblogincar");
	}
	
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("I will execute before every last method in day 3");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("After executing all methods in the CLASS");
	}
	@Test(groups= {"Smoke"})
	public void MobileLoginCarLoan() {
		//Appium
		System.out.println("Mobilelogincar");
	}
	
	
	@BeforeSuite
	public void Bfsuite() {
		System.out.println("I am no 1");
	}
	@AfterMethod
	public void MobileLoginAPIcarLoan() {
//Rest API automation 
		System.out.println("I will execute AFTER METHODS DAY 3    APIloginCar");
}
	
	@Test(dependsOnMethods= {"WebloginCarLoan"})
	public void APIcarLoan() {
		//Appium
		System.out.println("Mobilelogincar");
		
		
	}
	
	@Parameters({ "URL", "APIKey/username" })
	@Test(dataProvider="getData")
	public void WeblogincarLoannn(String username, String password)
	{
		System.out.println("OUT####");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test()
	public void SignOut()
	{
		System.out.println("Mobile Sign out");
	}
	
	
	@Test(enabled=false)
	public void APISecond() {
		//Appium
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA Mobile Sign Out");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combinations - username pawwword
		//2nd - userd name password - no credit history
		//3rd - fraudelent credit history
		Object[][] data = new Object[3][2];
		data[0][0] ="firstusernme";
		data[0][1] ="firstpassword";
		//columns in the row are nothing but values for that particular combination(row)
		//2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		//3d set
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		return data;
		
		
		
	}
	
}
