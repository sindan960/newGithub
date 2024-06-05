package baseClass;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_new {

	public static WebDriver driver;
	public static Select s;
	public static Alert alt;

//	public static WebDriver browserLaunch(String browserName) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		return driver;
//	}

	public static WebDriver bowsersetup() throws InterruptedException {
		Thread.sleep(2000);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\Project_of_oneWeek\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		return driver;
		
	}

	public static WebDriver websiteLaunch(String url) {
		driver.get(url);
		return driver;
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void backward() {
		driver.navigate().back();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void navigateToPage(String url) {
		driver.navigate().to(url);
	}

	public static void xpath(String xpathValue) {
		driver.findElement(By.xpath(xpathValue));
	}

	public static void xpath_SendKeys(WebElement ele, String InputText) {
		ele.sendKeys(InputText);
	}
	

	public static void xpath_Click(String XpathValue) {
		driver.findElement(By.xpath(XpathValue)).click();
	}

	public static void xpath_Clickweb(WebElement web) {
		web.click();
	}

	public static void id_sendKeys(String IdValue, String InputText) {
		driver.findElement(By.id(IdValue)).sendKeys(InputText);
	}

	public static void id_Click(String IdValue) {
		driver.findElement(By.id(IdValue)).click();
	}

	public static void id_radioBox(String IdValue) {
		driver.findElement(By.id(IdValue));
	}

	public static void id_checkBox(String IdValue) {
		driver.findElement(By.id(IdValue));
	}

	public static void dropDownBox(WebElement element, String choice, int num_value, String text_value) {
		s = new Select(element);
		if (choice.equalsIgnoreCase("index")) {
			s.selectByIndex(num_value);
		} else if (choice.equalsIgnoreCase("value")) {
			s.selectByValue(text_value);
		} else if (choice.equalsIgnoreCase("text")) {
			s.selectByVisibleText(text_value);
		} else {
			System.out.println("chose index or value or test to select");
		}
	}

	public static void index_DropDown(String indexvalue, int num) {
		WebElement dropDown = driver.findElement(By.xpath(indexvalue));
		s = new Select(dropDown);
		s.selectByIndex(num);
	}

	public static void value_DropDown(String value, String vValue) {
		WebElement dropDown = driver.findElement(By.xpath(value));
		s = new Select(dropDown);
		s.selectByValue(vValue);
	}

	public static void text_DropDown(String value, String textvalue) {
		WebElement dropDown = driver.findElement(By.xpath(value));
		s = new Select(dropDown);
		s.selectByVisibleText(textvalue);
	}

	public static void simpleAlert(String xpathValue, String xpathValue2) {
		xpath(xpathValue);
		xpath_Click(xpathValue2);
		driver.switchTo().alert().accept();
		System.out.println(" simple alert executed");
	}

	public static void confirmAlert(String xpathValue, String xpathValue2) {
		xpath(xpathValue);
		xpath_Click(xpathValue);
		xpath_Click(xpathValue2);
		driver.switchTo().alert().dismiss();
		System.out.println("confirm alert executed");
	}

	public static void promptAlert(String xpathValue, String xpathValue2) {
		xpath(xpathValue);
		xpath_Click(xpathValue);
		xpath_Click(xpathValue2);
		alt = driver.switchTo().alert();
		alt.sendKeys("sureshkrishna");
		alt.accept();
		System.out.println("prompt alert executed");
	}

	public static void insideframe(String xpathValue, String cValue) {
		WebElement insideFrame = driver.findElement(By.xpath(xpathValue));
		driver.switchTo().frame(insideFrame);
		WebElement login1 = driver.findElement(By.id(cValue));
		login1.click();
		driver.switchTo().defaultContent();
	}

	public static void nestedFrames(String xpathValue, String Cvalue) {
		WebElement nestedFrame = driver.findElement(By.xpath(xpathValue));
		driver.switchTo().frame(nestedFrame);// out frame
		driver.switchTo().frame("frame2");// inner frame
		WebElement login2 = driver.findElement(By.id(Cvalue));
		login2.click();
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		List<WebElement> countFrame = driver.findElements(By.tagName("iframe"));
		int count = countFrame.size();
		System.out.println(count + "frames in this website");
	}

	public static void screenShot(String fileNmae) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(fileNmae);
		FileUtils.copyFile(source, target);
		System.out.println("file moved");
	}

	public static void vidStart(String recordName) throws Exception {
		// ScreenRecorderUtil.startRecord(recordName);
	}

	public static void vidStop() throws Exception {
		// ScreenRecorderUtil.stopRecord();
	}

	public static void browserClose() {
		driver.close();
	}

	public static void mousehover(WebElement web) {
		Actions act = new Actions(driver);
		act.moveToElement(web).perform();
	}

	public static void getText(List<WebElement> list) {
		for (int i = 1; i < list.size(); i++) {
			System.out.println("#" + list.get(i).getText());
		}
	}

	public static void windowsHandle(WebElement web) {
		List<String> windowslist = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windowslist.get(1));
	}
}
