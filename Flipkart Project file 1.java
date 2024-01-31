package flipkart_doubt;
import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.annotations.Test;

	public class accesing {

			@Test
		public void scam() throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","D:\\Chrome web driver for selenium\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			d.get(" https://www.flipkart.com/ ");
			
			PageFactory.initElements(d, find.class)	;
		find.email.sendKeys("7092559531");
		find.pass.sendKeys("sanarts@123");      
		find.button.click();
		Thread.sleep(3000);
		find.search.sendKeys("APPLE iPhone 13");
		find.search.sendKeys(Keys.ENTER);

		d.get(" https://www.flipkart.com/search?q=APPLE%20iPhone%2013&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off ");
		PageFactory.initElements(d, find.class);
		find.clic.click();


		Set<String> window=d.getWindowHandles();
		List<String>list=new ArrayList<String>(window);
		d.switchTo().window(list.get(1));


		PageFactory.initElements(d, find.class)	;
		find.pincode.sendKeys("524132");
		find.check.click();
		Thread.sleep(10000);
		find.cart.click();
		//Thread.sleep(3000);
		//find.cartlogo.click();
		
		d.get(" https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART ");
		Thread.sleep(4000);
		find.order.click();
		Thread.sleep(5000);
		//find.order.sendKeys(Keys.ESCAPE);
		
		Thread.sleep(20000);
		//find.summary.click();
		d.get(" https://www.flipkart.com/checkout/init?view=FLIPKART&loginFlow=false ");
		Thread.sleep(10000);
		find.con.click();
		Thread.sleep(10000);
		find.acc.click();
		Thread.sleep(10000);
		find.pay.click();
		find.pay1.click();
		find.upi.sendKeys("7416278415@ybl");
		Thread.sleep(3000);
		find.verify.click();
			
      }
	}
