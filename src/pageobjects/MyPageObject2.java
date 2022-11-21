package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="My Page Object 2"                                
     , summary=""
     , relativeUrl=""
     , connection="UITest"
     )             
public class MyPageObject2 {

    WebDriver driver;
     MyPageObject2(WebDriver driver){
     
     this.driver=driver;
     
     
     }
     public void execute(){
          
          WebElement web=driver.findElement(By.xpath("//div[@id='loginactioncontainer']/descendant::a"));
          web.click();
     }
     
			
}
