package StepDef;

import org.openqa.selenium.WebDriver;

import PomClass.Pom_RC;
import RunnerClass.Runner_Class;
import baseClass.Base_new;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Base_new {

	public static WebDriver driver = Runner_Class.driver;
	Pom_RC pom = new Pom_RC(driver);

	@Before
	public void beforeHook(Scenario sc) {
		String name = sc.getName();
		System.out.println(name);
	}

	@After
	public void afterHook(Scenario sc) {
		Status status = sc.getStatus();
		System.out.println(status);
		if (sc.isFailed()) {
		}
	}

	@Given("user launch the website")
	public void user_launch_the_website() throws InterruptedException {
		Thread.sleep(1000);
		pom.loignId("visual_user");
		Thread.sleep(1000);
		pom.loginPwd("secret_sauce");
		Thread.sleep(1000);
		pom.loginbutton();

	}

	@Given("add items to cart")
	public void add_items_to_cart() throws InterruptedException {
		Thread.sleep(1000);
		pom.AtoZdwnddwn();
		Thread.sleep(1000);
		pom.cart1();
		Thread.sleep(1000);
		pom.cart2();
		Thread.sleep(1000);
		pom.kart();
		;
	}

	@When("enter personl details")
	public void enter_personl_details() throws InterruptedException {
		Thread.sleep(1000);
		pom.process();
		Thread.sleep(1000);
		pom.myname("Test Name");
		Thread.sleep(1000);
		pom.lastname("V");
		Thread.sleep(1000);
		pom.zip("600000");

	}

	@Then("buy the product and submit")
	public void buy_the_product_and_submit() throws InterruptedException {
		Thread.sleep(1000);
		pom.next();
		Thread.sleep(1000);
		pom.finish();
		Thread.sleep(1000);
		pom.home();
	}

}
