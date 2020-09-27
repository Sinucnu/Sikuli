package sikuli_projectDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class SikulifirstClass {
	public static void main(String [] args) throws FindFailed {
		
		System.setProperty("webdriver","C:\\Selenium\\Drivers\\Chrome\\ChromeDriver\\chromedriver.exe");
		String filePath = "C:\\Selenium\\Practice\\Sikuli\\";
		
		Screen S = new Screen();
		Pattern FileInuptTextBox = new Pattern(filePath + "FileTextBox.png");
		Pattern openButton = new Pattern(filePath + "OpenTextBox.PNG");
		WebDriver driver ;
		
		
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/image_upload/index.php");
		driver.findElement(By.xpath("//*[@id=\"photoimg\"]")).click();
		
		
		S.wait(FileInuptTextBox, 20);
		S.type(FileInuptTextBox, filePath + "Test.docx");
		S.click(openButton);
		
		driver.close();
	}

}
