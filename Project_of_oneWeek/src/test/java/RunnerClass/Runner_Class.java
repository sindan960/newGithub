package RunnerClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import baseClass.Base_new;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Feature", 
		glue = "StepDef", 
		monochrome = true, 
		stepNotifications = true, 
		publish = true,
		plugin = {
		"pretty", "html:target/test-out"}
		)

public class Runner_Class extends Base_new {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void launch () throws InterruptedException {
		driver = Base_new.bowsersetup();
		
	}
	
	
	
	}
				
	
	

