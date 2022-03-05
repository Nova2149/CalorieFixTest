package UserSide;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Scanner;

import org.checkerframework.checker.units.qual.s;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.Assert;

public class Register extends Config {
	
	By signupButton=By.xpath("/html/body/div[1]/div[3]/button[1]");
	By signUpSlideButton=By.xpath("/html/body/center/div/div[2]/div[1]/label[2]");
	By firstName=By.xpath("//input[@name='firstname']");
	By lastName=By.xpath("//input[@name='lastname']");
	By email=By.xpath("/html/body/center/div/div[2]/div[2]/form[2]/div[3]/input");
	By password=By.id("psw");
	By confirmPassword=By.id("cpsw");
	By cellNumber=By.id("phone");
	By address=By.xpath("//input[@name='address']");
	By postalCode=By.xpath("//input[@id='pcode']");
	By province=By.id("user_weight_type");
	
	
	
	
	

	
	//Best Case Scenario for the inputs 
	@Test
	public void t1() throws IOException
	{
		System.out.println("Hello World");
		WebDriver driver=getDriver();
		Properties prop=getProperties();
		String url=prop.getProperty("homePageUrl");
		System.out.println(url);		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//To Check if user lands on the correct page or not
		String current_url=driver.getCurrentUrl();
		Assert.assertTrue(url.equals(current_url));
		
		driver.findElement(signupButton).click();
		driver.findElement(signUpSlideButton).click();
		driver.findElement(firstName).sendKeys("Neel");
		driver.findElement(lastName).sendKeys("Christian");
		driver.findElement(email).sendKeys("nc1@gmail.com");
		driver.findElement(password).sendKeys("Msdhoni1");
		driver.findElement(confirmPassword).sendKeys("Msdhoni1");
		driver.findElement(cellNumber).sendKeys("5679781818");
		driver.findElement(address).sendKeys("5785 Rue Eadie");
		driver.findElement(postalCode).sendKeys("H3K1S5");
		
		Select s=new Select(driver.findElement(province));
		System.out.println("Enter the name of the province starting with capital letter");
		Scanner sc=new Scanner(System.in);
		String input_province=sc.next();
		s.selectByVisibleText(input_province);
		
		//All inputs fields are filled now
		
		
		System.out.println("--End of script--");

		
		
		
		
	}
	

}
