import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class TestClass {

	public static void main(String[] args) throws IOException, InterruptedException {


		System.setProperty("webdriver.edge.driver", "D:\\edgedriver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("file:///C:/Users/Lalisa/Desktop/Practice%20fies/auto%20screeshot%20test/Qa-automation-7thmar/index.html");
		
		driver.findElement(By.xpath("//*[@id=\"selectNow\"]")).click();
		Thread.sleep(3000);
		
		Date currentDate = new Date();
		String actualDate = currentDate.toString().replace(":", "-");
		TakesScreenshot src = ((TakesScreenshot)driver);
		File srcFile = src.getScreenshotAs((OutputType.FILE));
		File Dest = new File(".\\Images/"+actualDate+".png");
		FileUtils.copyFile(srcFile,Dest);
		
		List <WebElement> stud = driver.findElements(By.tagName("option"));
		
		for(int i=0; i<stud.size(); i=i+2) {
			driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
			 
		}
		
		driver.findElement(By.xpath("//*[@id=\"selectNow\"]")).click();
		Thread.sleep(3000);

		Date currentDate2 = new Date();
		String actualDate2 = currentDate2.toString().replace(":", "-");
		TakesScreenshot src2 = ((TakesScreenshot)driver);
		File srcFile2 = src2.getScreenshotAs((OutputType.FILE));
		File Dest2 = new File(".\\Images/"+actualDate2+".png");
		FileUtils.copyFile(srcFile2,Dest2);
		
	}

}
