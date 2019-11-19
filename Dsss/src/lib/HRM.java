package lib;

//import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.apache.xpath.operations.Equals;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

@Test
public class HRM {
  WebDriver driver;
//  private String baseUrl;

  /*@BeforeClass(alwaysRun = true)
  public void setUp() throws Exception 
  {
	System.setProperty("webdriver.chrome.driver","D:/QA/chromedriver_win32/chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }*/

  public void TestCase() throws Exception {
	  System.setProperty("webdriver.chrome.driver","D:/Softs/eclipse/Chrome driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	  
	    driver.get("http://192.168.1.21:9212/#/");
	    driver.manage().window().maximize();
	    Thread.sleep(4000);
	    driver.findElement(By.id("txtUserName")).clear();
	    driver.findElement(By.id("txtUserName")).sendKeys("");
	    Thread.sleep(3000);
	    driver.findElement(By.id("txtPwd")).clear();
	    driver.findElement(By.id("txtPwd")).sendKeys("");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/my-app/div/div/login/form/div/div[2]/div[3]/div/input")).click();
	    String errorMsg = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]")).getText();
	    
	    if(errorMsg.equals("Please Enter Username."))
	    {
	    	System.out.println("error msg is valid");
	    	Thread.sleep(2000);
	    	driver.findElement(By.id("popup_ok")).click();
	    }
	    else
	    {
	    	System.out.println("Not Valid");
	    }
	    
	    driver.findElement(By.id("txtUserName")).clear();
	    driver.findElement(By.id("txtUserName")).sendKeys("admin");
	    Thread.sleep(3000);
	    driver.findElement(By.id("txtPwd")).clear();
	    driver.findElement(By.id("txtPwd")).sendKeys("paras12");
	   
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/my-app/div/div/login/form/div/div[2]/div[3]/div/input")).click();
	    String error = driver.findElement(By.id("popup_message")).getText();
	    
	    if(error.equals("Invalid username and password."))
	    {
	    	System.out.println("valid msg");
	    	Thread.sleep(2000);
	    	driver.findElement(By.id("popup_ok")).click();
	    }
	    else
	    {
	    	System.out.println("Invalid");
	    }
	    
	    driver.findElement(By.id("txtUserName")).clear();
	    driver.findElement(By.id("txtUserName")).sendKeys("admi");
	    Thread.sleep(3000);
	    driver.findElement(By.id("txtPwd")).clear();
	    driver.findElement(By.id("txtPwd")).sendKeys("paras123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/my-app/div/div/login/form/div/div[2]/div[3]/div/input")).click();
	    String errorM = driver.findElement(By.id("popup_message")).getText();
	    
	    if(errorM.equals("Invalid username and password."))
	    {
	    	System.out.println("msg is valid");
	    	Thread.sleep(2000);
	    	driver.findElement(By.id("popup_ok")).click();
	    }
	    else
	    {
	    	System.out.println("Invalid");
	    }
	    
	    driver.findElement(By.id("txtUserName")).clear();
	    driver.findElement(By.id("txtUserName")).sendKeys("admi");
	    Thread.sleep(3000);
	    driver.findElement(By.id("txtPwd")).clear();
	    driver.findElement(By.id("txtPwd")).sendKeys("paras12");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/my-app/div/div/login/form/div/div[2]/div[3]/div/input")).click();
	    String errorN = driver.findElement(By.id("popup_message")).getText();
	    
	    
	    if(errorN.equals("Invalid username and password."))
	    {
	    	System.out.println("valid message");
	    	Thread.sleep(2000);
	    	driver.findElement(By.id("popup_ok")).click();
	    }
	    else
	    {
	    	System.out.println("Invalid");
	    }
	    
	    driver.findElement(By.id("txtUserName")).clear();
	    driver.findElement(By.id("txtUserName")).sendKeys("");
	    Thread.sleep(3000);
	    driver.findElement(By.id("txtPwd")).clear();
	    driver.findElement(By.id("txtPwd")).sendKeys("paras123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/my-app/div/div/login/form/div/div[2]/div[3]/div/input")).click();
	    String errorP = driver.findElement(By.id("popup_message")).getText();
	    
	    if(errorP.equals("Invalid username and password."))
	    {
	    	System.out.println("valid");
	    	Thread.sleep(2000);
	    	driver.findElement(By.id("popup_ok")).click();
	    }
	    else
	    {
	    	System.out.println("Invalid");
	    }
	    
	    driver.findElement(By.id("txtUserName")).clear();
	    driver.findElement(By.id("txtUserName")).sendKeys("admin");
	    Thread.sleep(3000);
	    driver.findElement(By.id("txtPwd")).clear();
	    driver.findElement(By.id("txtPwd")).sendKeys("");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/my-app/div/div/login/form/div/div[2]/div[3]/div/input")).click();
	    String errorQ = driver.findElement(By.id("popup_message")).getText();
	    
	    if(errorQ.equals("Invalid username and password."))
	    {
	    	System.out.println("valid");
	    	Thread.sleep(2000);
	    	driver.findElement(By.id("popup_ok")).click();
	    }
	    else
	    {
	    	System.out.println("Invalid");
	    }
	    
	    
	    driver.findElement(By.id("txtUserName")).clear();
	    driver.findElement(By.id("txtUserName")).sendKeys("admin");
	    Thread.sleep(2000);
	    driver.findElement(By.id("txtPwd")).clear();
	    driver.findElement(By.id("txtPwd")).sendKeys("paras123");
	    Thread.sleep(2000);
	 //   driver.findElement()
	    
	    /*driver.findElement(By.id("txtUserName")).clear();
	    driver.findElement(By.id("txtUserName")).sendKeys("admin");
	    Thread.sleep(3000);
	    driver.findElement(By.id("txtPwd")).clear();
	    driver.findElement(By.id("txtPwd")).sendKeys("paras123");
	    Thread.sleep(4000);
	    driver.findElement(By.id("btnSave")).click();
	    Thread.sleep(3000);
	    
	    String errorcorrect = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]")).getText();
	    
	    if(errorcorrect.equals("Invalid username and password."))
	    {
	    	System.out.println("error msg is valid");
	    }
	    else 
	    {
	    	System.out.println("error msg is not according to the Website");
	    }*/
	    
	    
	    /*driver.findElement(By.id("txtUserName")).clear();
	    driver.findElement(By.id("txtUserName")).sendKeys("admi");
	    Thread.sleep(3000);
	    driver.findElement(By.id("txtPwd")).clear();
	    driver.findElement(By.id("txtPwd")).sendKeys("paras12");
	    Thread.sleep(4000);
	    driver.findElement(By.id("btnSave")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("popup_ok")).click();
	    driver.findElement(By.id("txtUserName")).clear();
	    driver.findElement(By.id("txtUserName")).sendKeys("");
	    Thread.sleep(3000);
	    driver.findElement(By.id("txtPwd")).clear();
	    driver.findElement(By.id("txtPwd")).sendKeys("");
	    Thread.sleep(4000);
	    driver.findElement(By.id("btnSave")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("popup_ok")).click();
	    Thread.sleep(3000);*/
	    //driver.findElement(By.id("txtUserName")).clear();
	    
	    
	    
	    /*driver.findElement(By.id("txtUserName")).sendKeys("admin");
	    driver.findElement(By.id("txtPwd")).clear();
	    driver.findElement(By.id("txtPwd")).sendKeys("paras123");
	    Thread.sleep(4000);
	    driver.findElement(By.id("btnSave")).click();
	    Thread.sleep(5000);
	    
	    
	    driver.findElement(By.id("divInvoiceParent")).click();
	    driver.findElement(By.linkText("Residents Accounts")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Invoice Summary'])[1]/following::i[1]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.id("btnShow")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("identityquery")).click();
	    driver.findElement(By.id("identityquery")).sendKeys("ashok");
	    Thread.sleep(3000);
	    driver.findElement(By.id("identityquery")).sendKeys(Keys.ENTER);
	    driver.findElement(By.id("btnShow")).click();
	    Thread.sleep(2000);	
	    driver.findElement(By.xpath("/html/body/my-app/div/div/innerheader/div/div/div/div/nav/ul/li[4]/div/ul/li[4]/a")).click();
	    driver.findElement(By.id("btnSave")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("identityquery")).sendKeys("raksha");
	    Thread.sleep(3000);
	    driver.findElement(By.id("identityquery")).sendKeys(Keys.ENTER);
	    driver.findElement(By.id("btnSave")).click();
	    driver.findElement(By.id("identityquery")).sendKeys(Keys.ENTER);
	    Thread.sleep(2500);
	    
	    driver.findElement(By.xpath("/html/body/my-app/div/div/innerheader/div/div/div/div/nav/ul/li[4]/div/ul/li[5]/a/span")).click();
	   
	    /*driver.findElement(By.id("btnSave")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("popup_ok")).click();
	    driver.findElement(By.id("Tower")).click();
	    Thread.sleep(2900);
	    new Select(driver.findElement(By.id("Tower"))).selectByVisibleText("Tower G");
	    driver.findElement(By.id("Tower")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("Go")).click();*/
	    
	    
	    
	    /*driver.findElement(By.xpath("/html/body/my-app/div/div/innerheader/div/div/div/div/nav/ul/li[4]/div/ul/li[4]/a")).click();
	    Thread.sleep(2000);
	    /*driver.findElement(By.id("btnSave")).click();
	    driver.findElement(By.id("identityquery")).clear();
	    driver.findElement(By.id("identityquery")).sendKeys("(D602) Mr. PRAKASH SHINDE");
	    Thread.sleep(3000);*/
	    
	    //driver.findElement(By.id("btnSave")).click();
	   
	    /*driver.findElement(By.linkText("New")).click();
	    driver.findElement(By.id("btnSave")).click();
	    driver.findElement(By.id("popup_ok")).click();*/
	    
	    //driver.close();
	    
	    
	    
	    
	    
	    ///* Settings Page*///
	    /*driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Role & Permission'])[2]/following::a[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Error Log'])[2]/following::span[1]")).click();
	    driver.findElement(By.linkText("Save")).click();
	    driver.findElement(By.id("popup_ok")).click();
	    driver.close();*/
	    
	    
	    ///* System - User Code*///
	    /*driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Advertiser'])[2]/following::a[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='System'])[2]/following::a[1]")).click();
	    driver.findElement(By.linkText("New")).click();
	    driver.findElement(By.id("FirstName")).clear();
	    driver.findElement(By.id("FirstName")).sendKeys("amis");
	    driver.findElement(By.id("SurName")).clear();
	    driver.findElement(By.id("SurName")).sendKeys("khan");
	    driver.findElement(By.id("MobileId")).clear();
	    driver.findElement(By.id("MobileId")).sendKeys("7698534683");
	    driver.findElement(By.id("EmailID")).clear();
	    driver.findElement(By.id("EmailID")).sendKeys("amish@gmail.com");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[4]/following::input[1]")).clear();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[4]/following::input[1]")).sendKeys("amiskhan");
	    driver.findElement(By.id("Password")).clear();
	    driver.findElement(By.id("Password")).sendKeys("Amish");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Address'])[1]/following::textarea[1]")).clear();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Address'])[1]/following::textarea[1]")).sendKeys("ahmedabad");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Add / Edit User'])[1]/following::div[2]")).click();
	    driver.findElement(By.id("UserType")).click();
	    new Select(driver.findElement(By.id("UserType"))).selectByVisibleText("Chain Admin");
	    driver.findElement(By.id("UserType")).click();
	    driver.findElement(By.id("RoleId")).click();
	    new Select(driver.findElement(By.id("RoleId"))).selectByVisibleText("krishcompusoftservices Chain Admin Role");
	    driver.findElement(By.id("ChainId")).click();
	    new Select(driver.findElement(By.id("ChainId"))).selectByVisibleText("KCS");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Active'])[1]/following::button[1]")).click();
	    driver.findElement(By.id("popup_ok")).click();
	    driver.close();*/
	    
	    
	    ///* Schedule Approval - Delete Code*///
	    
	    
	    
	    
	    
	    /*driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Downloads'])[2]/following::a[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Playlist'])[2]/following::span[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Logout'])[1]/following::div[3]")).click();
	    driver.findElement(By.linkText("New")).click();
	    driver.findElement(By.linkText("Cancel")).click();*/
	    //driver.findElement(By.id("PlayerTypeId")).click();
	  //dropdown code
	    /*WebElement testDropDown = driver.findElement(By.id("schedule"));  
	    Select dropdown = new Select(testDropDown); 
	    dropdown.selectByIndex(1);*/  
	    //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Downloads'])[2]/following::a[1]")).click();
	    //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Playlist'])[2]/following::a[1]")).click();
	    //driver.findElement(By.id("txtUserName")).clear();
	    //driver.findElement(By.id("txtUserName")).sendKeys("admin");
	    //driver.findElement(By.id("password")).clear();
	    //driver.findElement(By.id("password")).sendKeys("admin");
  }
    
 /*driver.findElement(By.id("txt_username")).clear();
    driver.findElement(By.id("txt_username")).sendKeys("viranchkadi");
   // driver.findElement(By.id("txt_password")).clear();
    driver.findElement(By.id("txt_password")).sendKeys("Viru@123");
    Thread.sleep(3000);
    driver.findElement(By.id("act_login")).click();
    driver.findElement(By.id("txt_username")).clear();
    driver.findElement(By.id("txt_username")).sendKeys("viranchkadia");
   // driver.findElement(By.id("txt_password")).clear();
    driver.findElement(By.id("txt_password")).sendKeys("Viru@123");
    Thread.sleep(3000);
    driver.findElement(By.id("act_login")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Project Operations'])[1]/preceding::img[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("TASKS")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("Add Task")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Action'])[3]/following::button[1]")).click();
    Thread.sleep(1000);
    driver.close();
    /*driver.findElement(By.xpath("//div/div")).click();
    driver.findElement(By.id("txt_password")).clear();
    driver.findElement(By.id("txt_password")).sendKeys("Viru@123");
    driver.findElement(By.id("formmain")).submit();*/
  }

 // @AfterClass(alwaysRun = true)
  //public void tearDown() throws Exception {
   // driver.quit();
  //}
