package DSPACKAGE;
import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.support.*;
import java.io.IOException;
import java.security.Key;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DSClass {
	
	
	public void waitForLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                    }
                };
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageLoadCondition);
	}
	
	/**
	 * @param args
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws IllegalMonitorStateException
	 * @throws AWTException 
	 */
	public static void main(String[] args) throws InterruptedException, IOException,IllegalMonitorStateException, AWTException {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","D:/Softs/eclipse/Chrome driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//url 
		String baseUrl = "http://dssweb.qasprint.kcspl.in/";
        String expectedTitle = "";
        String actualTitle = "";//
        
        // launch Fire fox / Chrome and direct it to the Base URL
        driver.get(baseUrl);
        Thread.sleep(5000);

        // get the actual value of the title
        actualTitle = driver.getTitle();
        Thread.sleep(5000);
        //Login page
         driver.findElement(By.id("txtUserName")).sendKeys("admin");
        Thread.sleep(1500);
        driver.findElement(By.id("password")).sendKeys("admin");
        Thread.sleep(1500);
        
        driver.findElement(By.name("login")).click();
        Thread.sleep(1500);
        
        WebDriverWait wait= new WebDriverWait(driver,5000);
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
        Thread.sleep(5000);
        
        //Chain pop up page
      //  driver.findElement(By.xpath("//a[@class='btn res-btn']").click();
      //  driver.findElement(By.xpath("//a[@class='btn res-btn']")).click();
        driver.findElement(By.xpath("/html/body/my-app/div/div/chainpop/div/div/div/div[4]/a")).click();
        Thread.sleep(5000);
      
       //Navbar
        driver.findElement(By.cssSelector("#bs-example-navbar-collapse-1 > ul > li:nth-child(3) > a")).click();
        Thread.sleep(5000);
       
        driver.findElement(By.xpath("//a[@href ='#/PlayList']")).click();
        Thread.sleep(5000);
        
        
        driver.findElement(By.id("txtsearch")).sendKeys("Playlist_1/8/2019_13:59:53");
        
        Thread.sleep(5000);
        
        //Delete Playlist
        //driver.findElement(By.xpath("//*[@id=\"tblChain\"]/tbody/tr[1]/td[7]/span[2]/a/i")).click();
        //Thread.sleep(5000);
        
        driver.findElement(By.cssSelector("body > my-app > div > div > playlist > div > div.title > span > div > a")).click();
       
        Thread.sleep(5000);
           
		WebDriverWait waitt = new WebDriverWait(driver,30);
        waitt.until(ExpectedConditions.visibilityOfElementLocated(By.id("LayoutId")));
        

        
        
        Select country = new Select(driver.findElement(By.id("LayoutId")));
	//  country.selectByVisibleText("win7");
		country.selectByIndex(2);

		 Thread.sleep(5000);
		 
		 
		 
		 driver.findElement(By.id("PlayTimeSec")).sendKeys("250");
		  
		 Thread.sleep(5000);
		 
		 
		 Select b = new Select(driver.findElement(By.id("ddlPlayerId")));
		 b.selectByIndex(8);
		 
		 Thread.sleep(5000);
		 
		 Select c = new Select(driver.findElement(By.id("ddlPlayerId")));
		 c.selectByIndex(7);
		 
		 Thread.sleep(5000);
		 
		 Select d = new Select(driver.findElement(By.id("Frame")));
		 d.selectByIndex(1);
		 
		 Thread.sleep(5000);
	
		                           
		 driver.findElement(By.cssSelector("body > my-app > div > div > playlistadd > div > div.contentblock > div > div.row.partion > div:nth-child(2) > div.boxcontent-body > div.label-block > div:nth-child(1) > div:nth-child(3) > div > span > div > button")).click();
		 
		 driver.findElement(By.xpath(" /html/body/my-app/div/div/playlistadd/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div/span/div/ul/li[3]/a/label/input")).click();
		 driver.findElement(By.xpath(" /html/body/my-app/div/div/playlistadd/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div/span/div/ul/li[4]/a/label/input")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath(" /html/body/my-app/div/div/playlistadd/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div/span/div/ul/li[6]/a/label/input")).click();
		 driver.findElement(By.xpath(" /html/body/my-app/div/div/playlistadd/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div/span/div/ul/li[8]/a/label/input")).click();
		 Thread.sleep(5000);
		 
		 driver.findElement(By.id("ContentPlayTimeSec")).sendKeys("10");
		 
		 
		 Select e = new Select(driver.findElement(By.id("ddlBrandId")));
		 e.selectByVisibleText("SAMSUNG");
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//a[@href ='#/PlayListAdd/%23']")).click();
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.id("specifiedtime")).click();
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	     	js.executeScript("window.scrollBy(0,1000)");
		 
	     	Thread.sleep(5000);
	     	
		 driver.findElement(By.id("SaveButton")).click();
		 
		// driver.findElement(By.xpath("/html/body/my-app/div/div/playlistadd/div/div[2]/div/div[2]/div/a")).click();		 
		 
		 
		 driver.findElement(By.id("popup_ok")).click(); 
		 	
	//----------------------	 Schedule
		 
		 driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();
		 Thread.sleep(5000);
		
		 //driver.findElement(By.cssSelector("#Schedule > li:nth-child(2) > a > span")).click();
		
		 
		 driver.findElement(By.xpath("//a[@href ='#/ScheduleList']")).click();
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//a[@href ='#/ScheduleSequenceAdd']")).click();
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.cssSelector("#ddlAllTheatre > option:nth-child(1)")).click();
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("btnleft")).click();
		 
     	 Thread.sleep(1000);
		 
		 driver.findElement(By.cssSelector("#selectedAdshoweringClient > option:nth-child(1)")).click();
		 
		 Thread.sleep(1000);
		 
	     	 driver.findElement(By.id("Button2")).click();
	     	 Thread.sleep(1000); 	  
	/*     	driver.findElement(By.id("s2id_PlaylistId")).click();
	     	Robot r = new Robot();
	     	r.keyPress(KeyEvent.VK_ENTER);
	     	r.keyRelease(KeyEvent.VK_ENTER);
	     	 Thread.sleep(5000);
	     	 
	*/     //--------------------	 
	      
	      
	    WebElement wd1 = driver.findElement(By.id("s2id_PlaylistId"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(wd1).click().moveToElement(wd1,200, 0).sendKeys("011 [1080 sec] ").build().perform();
		action1.sendKeys(Keys.ENTER).build().perform();
	   
	     	
		JavascriptExecutor jssss = (JavascriptExecutor) driver;
     	jssss.executeScript("window.scrollBy(0,1000)");
    // XPath =input /html/body/div[4]/ul/li[4]/div;
     	
    // 	driver.findElement(By.cssSelector("body > div.select2-drop.select2-drop-multi.select2-drop-active > ul > li:nth-child(4) > div")).click();
    // Select ab = new Select(driver.findElement(By.id("s2id_PlaylistId")));
	// ab.selectByIndex(2);
		 
    // 	driver.findElement(By.cssSelector("0605_images [20 sec] ")).sendKeys(Keys.ENTER);
     	
    // driver.findElement(By.xpath("/html/body/div[4]/ul/li[4]/div")).click();
     	
     	//driver.findElement(By.xpath("/html/body/div[24]/ul/li[8]/div/text()")).sendKeys(Keys.ENTER);
     	//Thread.sleep(5000);
     	
     	//driver.findElement(By.xpath("/html/body/div[3]/ul/li[0]/div")).click();
     //	Thread.sleep(5000);
     	
     	//driver.findElement(By.xpath("/html/body/div[3]/ul/li[2]/div")).click();
     	//Thread.sleep(5000);
     
     	driver.findElement(By.id("Button1")).click();
     	Thread.sleep(5000);
     	
     	driver.findElement(By.id("A1")).click();
     	Thread.sleep(5000);
     	 
     	driver.findElement(By.id("popup_ok")).click();
    	
     	
     	driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();
     	
     	Thread.sleep(5000);
     	driver.findElement(By.xpath("//a[@href ='#/ScheduleApprovalList']")).click();
     	
     	Thread.sleep(5000);
     	
     	JavascriptExecutor jss = (JavascriptExecutor) driver;
     	jss.executeScript("window.scrollBy(0,440)");
     	 
     	Thread.sleep(5000);
     	
     	driver.findElement(By.xpath("//*[@id=\"tblChain\"]/tbody/tr[1]/td[5]/span[1]/a/i")).click();
     	Thread.sleep(5000);
     	
     	JavascriptExecutor jsss = (JavascriptExecutor) driver;
     	jsss.executeScript("window.scrollBy(0,1000)");
     	
     	driver.findElement(By.xpath("/html/body/my-app/div/div/scheduleapprovaladd/div/div[9]/div/span/button/span")).click();
     	
     	driver.findElement(By.id("popup_ok")).click();
     	
     	driver.findElement(By.cssSelector("tr")).click();
     	
    	Thread.sleep(5000);
    	
     	driver.findElement(By.id("popup_cancel")).click();
     	 
     /*   WebElement select1 = driver.findElement(By.xpath("/html/body/div[24]/ul/li[8]/div/text()\""));
       // WebElement select2 = driver.findElement(By.xpath("//option[@value='Honda']"));
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).click(select1).build().perform();
	*/
	 
	/*	 
		 driver.findElement(By.cssSelector("#bs-example-navbar-collapse-1 > ul > li.open > a")).click();
		 
		 driver.findElement(By.xpath("//a[@href ='#/AdShoweringClientList']")).click();
		 
		 driver.findElement(By.xpath("/html/body/my-app/div/div/adshoweringclientlist/div/div[1]/span/div/a")).click();
		 
		 Select f = new Select(driver.findElement(By.id("TheatreMasterId")));
		 f.selectByIndex(2);
		 
		 driver.findElement(By.id("AdShoweringClientMasterName")).sendKeys("SalviADI");
		 
		 driver.findElement(By.id("MacAddress")).sendKeys("123.456.789");
		
		 
		 driver.findElement(By.id("NoOfSignage")).sendKeys("1");
		 
		 driver.findElement(By.id("txtPlayerStartTime")).sendKeys("00:00");
		 
		 
		 */
     	 
}
}
