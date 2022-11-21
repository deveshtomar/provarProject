package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="UITest"
     )             
public class MyPageObject {
    

	@LinkType()
	@FindBy(xpath = "//a[@id='w3loginbtn']")
	public WebElement logIn;
	@TextType()
	@FindBy(xpath = "//input[@name='email']")
	public WebElement Email;
	@TextType()
	@FindBy(xpath = "//input[@name='current-password']")
	public WebElement password;
	@ButtonType()
	@FindBy(xpath = "//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")
	public WebElement logIn1;

	
	
	
	  public WebDriver driver;
	  
   MyPageObject(WebDriver driver){
     
     this.driver=driver;
     
     
     }
     
     
     public void execute1(){
          
          WebElement web=driver.findElement(By.xpath("//div[@id='loginactioncontainer']/descendant::a"));
          web.click();
     }
     
     
     public void foo(){
     
     }
			
}
