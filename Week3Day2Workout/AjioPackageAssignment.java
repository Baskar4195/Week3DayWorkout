package Week3Day2Workout;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioPackageAssignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		// Step 2: Instantaite the ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		// Loads a new web page in the current browser window
		// Maximise the screen
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.ajio.com/");
		// In the search box, type as "bags" and press enter

		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		// driver.findElement(By.id("Men")).click();
		Thread.sleep(2000);
		// To the left of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		// Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		// Print the count of the items Found.
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of Bags : " + totalItems);
		// Get the list of brand of the products displayed in the page and print the
		// list.
		System.out.println("BrandListed in Page");
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println(" Size of Brandlist:" + bagBrandList.size());

		for (WebElement AllBagBrandList : bagBrandList) {
			String Bag = AllBagBrandList.getText();
			System.out.println(Bag);
		}
		// Get the list of names of the bags and print it
		List<WebElement> bagNameList = driver.findElements(By.className("name"));
		System.out.println(" Size :" + bagNameList.size());
		System.out.println("This is the Bag Name List");
		for (WebElement bagName : bagNameList) {
			String Bag = bagName.getText();
			System.out.println(Bag);
		}
	
	}

}
