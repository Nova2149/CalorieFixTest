package UserSide;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {

	public Properties getProperties() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fs=new FileInputStream("C:\\Users\\14389\\eclipse-workspace\\CalorieFixTest\\resource.properties");
		prop.load(fs);
		return prop;
	}
	
	
	public WebDriver  getDriver() throws IOException
	{
		System.out.println(System.getProperty("user.dir"));
		

		Properties prop=getProperties();
		System.out.println(prop.getProperty("chromeDriver"));
		System.setProperty("webdriver.chrome.driver",prop.getProperty("chromeDriver"));
		WebDriver driver=new ChromeDriver();
		return driver;
		
		
	}

}
