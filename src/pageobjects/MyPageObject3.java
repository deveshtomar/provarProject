package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="My Page Object 3"                                
     , summary=""
     , relativeUrl=""
     , connection="LogOnAsTest"
     )             
public class MyPageObject3 {
			
			public WebDriver driver;
	  
   MyPageObject3(WebDriver driver){
     
     this.driver=driver;
			
			}
}
