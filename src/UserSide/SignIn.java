package UserSide;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import graphql.Assert;

public class SignIn extends  Config{
	By email=By.xpath("/html/body/center/div/div[2]/div[2]/form[1]/div[1]/input");
	By password=By.xpath("/html/body/center/div/div[2]/div[2]/form[1]/div[2]/input");
	By loginButton=By.xpath("/html/body/div[1]/div[3]/button[2]");
	
	
	//Best Case Scenario
	@Test
	public void t1() throws IOException
	{
		WebDriver driver=getDriver();
		Properties prop=getProperties();
		System.out.println(prop.getProperty("homePageUrl"));
		driver.get(prop.getProperty("homePageUrl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Assert.assertTrue(driver.getCurrentUrl().equals(prop.getProperty("homePageUrl")));
		driver.findElement(loginButton).click();
	
		Assert.assertTrue(driver.getCurrentUrl().equals(prop.getProperty("registertaionPageUrl")));
	}
	

}
