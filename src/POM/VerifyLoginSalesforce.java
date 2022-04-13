package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class VerifyLoginSalesforce {

	public static void main(String[] args) {
		WebDriver driver = BrowserFactory.BrowserOptions("Chrome","https://www.login.hiox.com/login?referrer=easycalculation.com");
		LoginPage loginSalesforce = PageFactory.initElements(driver, LoginPage.class);
		loginSalesforce.LoginSalesforce("Admin","admin123");

	}

}
