package flipkart_doubt;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class find {
		
	@FindBy(xpath ="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	public static WebElement email;
			
	@FindBy(xpath ="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	public static WebElement pass;
			
	@FindBy(xpath ="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
	public static WebElement button;
			
	@FindBy(name ="q")
	public static WebElement search;
			
	@FindBy(xpath ="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
	public static WebElement clic;
			 
	@FindBy(id="pincodeInputId")
	public static WebElement pincode;
			
	@FindBy(className="_2P_LDn")
	public static WebElement check;
			
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")
	public static WebElement cart;
			
	@FindBy(xpath ="//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[5]/div/form/button")
	public static WebElement order;
	
	@FindBy(xpath ="//button[@class='_2KpZ6l 1seccl 3AWRsL']")
	public static WebElement con;
	
	@FindBy(xpath ="//button[@class='_2KpZ6l 1uR9yB 3dESVI']")
	public static WebElement acc;
	
	@FindBy(xpath ="//*[@id=\"container\"]/div/div[2]/div/div[1]/div[4]/div/div/div[1]/div/label[1]/div[1]")
	public static WebElement pay;
	
	@FindBy(xpath ="//*[@id=\"container\"]/div/div[2]/div/div[1]/div[4]/div/div/div[1]/div/label[1]/div[2]/div/div/div[3]/label[2]/div[1]")
	public static WebElement pay1;
			
	@FindBy(xpath ="//*[@id=\"container\"]/div/div[2]/div/div[1]/div[4]/div/div/div[1]/div/label[1]/div[2]/div/div/div[3]/label[2]/div[2]/div/div[2]/div/div[1]/input")
	public static WebElement upi;
	
	@FindBy(xpath ="//*[@id=\"container\"]/div/div[2]/div/div[1]/div[4]/div/div/div[1]/div/label[1]/div[2]/div/div/div[3]/label[2]/div[2]/div/div[2]/div/div[2]")
	public static WebElement verify;
       
}

