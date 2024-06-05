package Cucumber_EMIS.EMIS_Cucumber;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="EMIS_Cucumber\\login.feature",
		glue = "Step")


public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void launch () throws InterruptedException {
		
	}
	

}
