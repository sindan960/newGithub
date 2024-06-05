package PomClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pom_RC {

	public WebDriver driver;

	public Pom_RC(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
//	@FindBy(xpath = "//body/app-root[1]/app-auth[1]/app-login[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
//	WebElement username;

//	@FindBy(xpath = "//input[@id='exampleInputPassword1']")
//	WebElement password;

//	@FindBy(xpath = "//button[contains(text(),'Login')]")
//	WebElement loginButton;	

	private By username = By.xpath("(//input[@class='input_error form_input'])[1]");
	private By password = By.xpath("//*[@id=\"password\"]");
	private By loginclick = By.xpath("//*[@id=\"login-button\"]");
	private By addcart1 = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
	private By addcart2 = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
	private By dropdwn = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");
	private By kartpage = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	private By proceed = By.xpath(" //*[@id=\"checkout\"]");
	private By name = By.xpath(" //*[@id=\"first-name\"]");
	private By lasname = By.xpath(" //*[@id=\"last-name\"]");

	private By pincode = By.xpath(" //*[@id=\"postal-code\"]");
	private By contin = By.xpath("//*[@id=\"continue\"]");
	private By done = By.xpath("//*[@id=\"finish\"]");
	private By bhome = By.xpath(" //*[@id=\"back-to-products\"]");

	public void loignId(String user) {
		WebElement login = driver.findElement(username);
		login.sendKeys(user);
	}

	public void loginPwd(String pwd) {
		WebElement logpwd = driver.findElement(password);
		logpwd.sendKeys(pwd);
	}

	public void loginbutton() {
		WebElement click = driver.findElement(loginclick);
		click.click();

	}

	public void AtoZdwnddwn() throws InterruptedException {
		Thread.sleep(1000);
		WebElement dst = driver.findElement(dropdwn);
		dst.click();
		Thread.sleep(1000);
		Select dropdown = new Select(dst);
		dropdown.selectByIndex(3);
	}

	public void cart1() throws InterruptedException {
		Thread.sleep(2000);
		WebElement item1 = driver.findElement(addcart1);
		item1.click();
	}

	public void cart2() throws InterruptedException {
		Thread.sleep(2000);
		// scroll down
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0, 1000)");
//		//click
		WebElement item2 = driver.findElement(addcart2);
		item2.click();
	}

	public void kart() throws InterruptedException {
		WebElement kartp = driver.findElement(kartpage);
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0, -1000)");
		Thread.sleep(2000);
		kartp.click();
	}

	public void process() {
		WebElement gopayment = driver.findElement(proceed);
		gopayment.click();
	}

	public void myname(String nam) {
		WebElement namee = driver.findElement(name);
		namee.sendKeys(nam);
	}

	public void lastname(String lnam) {
		WebElement laname = driver.findElement(lasname);
		laname.sendKeys(lnam);
	}

	public void zip(CharSequence pin) {
		WebElement zippin = driver.findElement(pincode);
		zippin.sendKeys(pin);
	}

	public void next() {
		WebElement contine = driver.findElement(contin);
		contine.click();
	}

	public void finish() {
		WebElement fini = driver.findElement(done);
		fini.click();
	}

	public void home() {
		WebElement bahome = driver.findElement(bhome);
		bahome.click();
	}

}
