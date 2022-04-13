package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.ID, using="log_email")
	WebElement Username;
	
	@FindBy(how = How.ID, using = "log_password")
	WebElement Password;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"log_frm\"]/div[4]/input[1]")
	WebElement LoginBtn;
	
	public void LoginSalesforce(String Uname, String Psd) {
		Username.sendKeys(Uname);
		Password.sendKeys(Psd);
		LoginBtn.click();
	}

}
