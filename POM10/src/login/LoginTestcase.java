package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObj.LoginPageObj;

public class LoginTestcase {
	WebDriver d;
  @Test
  public void login() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver100\\chromedriver.exe");
	  WebDriver d=new ChromeDriver();
	  
	  d.get("https://www.phptravels.net/login");
	  
	  PageFactory.initElements(d,LoginPageObj.class);
	  LoginPageObj.userName.sendKeys("user@phptravels.com");
	  LoginPageObj.pswd.sendKeys("demouser");
	  Thread.sleep(2000);
	  LoginPageObj.loginbutton.click();
	  
	  /*
	  
	  LoginPageObj.userName(d).sendKeys("user@phptravels.com");
	  LoginPageObj.pswd(d).sendKeys("demouser");
	  LoginPageObj.loginbutton(d).click();
	  */
	  
	  
	  
	  
	  /*
	  
	  d.findElement(By.name("email")).sendKeys("user@phptravels.com");
	  d.findElement(By.name("password")).sendKeys("demouser");
	  d.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
	  */
  }
}
