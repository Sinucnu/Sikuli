package sikuli_projectDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UltimateQA {
	public static void main(String[] args) throws FindFailed {
		

		System.setProperty("webdriver","C:\\Selenium\\Drivers\\Chrome\\ChromeDriver\\chromedriver.exe");
		String filePath = "C:\\Selenium\\Practice\\Sikuli\\UltimateQA\\";
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ultimateqa.com/complicated-page/");
		
		
		
Screen s = new Screen();

Pattern button = new Pattern(filePath + "Button.PNG");

s.wait(button, 20);
s.click(button);


		
		
		
		
		
		
	}
	
	

}
