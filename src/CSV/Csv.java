package CSV;

import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import au.com.bytecode.opencsv.CSVReader;


public class Csv {

	public static void main(String[] args) throws IOException {
		
		String CsvPath="D:\\DXC Selenium Automation Class\\CSVFileReading\\CSVData\\CSVData.csv";
		WebDriver driver;
			System.setProperty("webdriver.chrome.driver","D:\\DXC Selenium Automation Class\\CSVFileReading\\ChromeJars\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://only-testing-blog.blogspot.com/2014/05/form.html");

			CSVReader reader = new CSVReader(new FileReader(CsvPath));
			String[] csvCell;
			while ((csvCell = reader.readNext()) != null) {
				String FName = csvCell[0];
				String LName = csvCell[1];
				String Email = csvCell[2];
				String MNumb = csvCell[3];
				String CName = csvCell[4];

				driver.findElement(By.name("FirstName")).sendKeys(FName);
				driver.findElement(By.name("LastName")).sendKeys(LName);
				driver.findElement(By.name("EmailID")).sendKeys(Email);
				driver.findElement(By.name("MobNo")).sendKeys(MNumb);
				driver.findElement(By.name("Company")).sendKeys(CName);

				driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
				driver.switchTo().alert().accept();
			}

			reader.close();

		driver.quit();

	}
}

