package ProfilePageFac;

import org.testng.AssertJUnit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class ProfilePage {
		WebDriver driver;
		public ProfilePage(WebDriver driver){
			
			this.driver=driver;
			PageFactory.initElements(driver,this);
				
			}
		
//======================================Scenario 1=========================================================
		@FindBy(xpath="//span[@class=\"whitespace-nowrap truncate overflow-hidden max-w-10p text-header-text-color\"]")
		WebElement profileBtn;
		
		@FindBy(xpath="//a[@class=\"hover:text-secondary-color border-b-1 border-b-card-overview-border-color py-1.5p font-normal mx-2.5p block text-header-menu-color cursor-pointer text-left\"]")
		WebElement editProfile;
		
		@FindBy(xpath="//input[@id=\"nameText\"]")
		WebElement nameBtn;
		
		@FindBy(xpath="//input[@id=\"emailText\"]")
		WebElement emailBtn;
		
		@FindBy(xpath="//span[@class=\"nb__wUGea\"]//child::u")
		WebElement emailLink;
		
		@FindBy(xpath=" //span[@class=\"nb__wUGea\"]//u[text()=\"Click here to generate password reset email.\"]")
		WebElement passLink;
		
		@FindBy(xpath="//div[@class=\"nb-switch-toggle s\"]")
		WebElement toggleBtn;
		
		@FindBy(xpath="//div[@class=\"nb__2ed4M\"]//child::button[@id=\"saveProfile\"]")
		WebElement saveProfileBtn;
		
		@FindBy(xpath="(//div[@class=\"hover:text-secondary-color border-b-1 border-b-card-overview-border-color py-1.5p font-normal mx-2.5p block text-header-menu-color cursor-pointer text-left\"])[4]")
		WebElement dashboardBtn;
		
		@FindBy(xpath="//div[@class=\"mt-0.7p cursor-default\"]//child::a[@class=\"hover:text-secondary-color py-1.5p font-normal mx-2.5p block text-header-menu-color cursor-pointer text-left\"][1]")
		WebElement timelineBtn;
		
		@FindBy(xpath="(//div[@class=\"header-icon-container\"])[3]//child::center//child::i[@class=\"header-icon header-icon-testimonials\"]")
		WebElement testBtn;
		
		@FindBy(xpath="//textarea[@class=\"testimonial_textarea\"]")
		WebElement textArea;
		
		@FindBy(xpath="//button[@id=\"submit_testimonial\"]")
		WebElement submitBtn;
		
		@FindBy(xpath="(//img[@alt=\"star\"])[1]")
		WebElement packersBtn;
		
		@FindBy(xpath="(//div[text()=\"Check Prices\"])[3]")
		WebElement checkpricebtn;
		
	    @FindBy(xpath="(//div[@class=\"relative text-base\"])[2]")
	    WebElement selectCity;
	    
	    @FindBy(xpath="//li[@class=\"py-2 px-3 cursor-pointer bg-gray-100\"]")
	    WebElement clickMumbai;
	    
	    @FindBy(xpath="//div[text()=\"When you need the service?\"]")
	    WebElement pickupdate;
	    
	    @FindBy(xpath="(//div[@class=\"flex items-center justify-center\"])[2]")
	    WebElement clickcheckprices;
		
	    @FindBy(xpath = "//div[text()=\"Menu\"]")
	     WebElement menubtn;
	    
	    @FindBy(xpath="(//a[@class=\" py-0.8p px-0 font-normal block text-header-menu-color align-left no-underline cursor-pointer hover:text-secondary-color border-b-1 border-b-solid border-b-card-overview-border-color my-0.3p mx-2.5p\"])[1]")
	    WebElement rentalbtn;
	    
	    
		@FindBy(xpath="//img[@alt=\"Mumbai\"]")
		WebElement location;
		
		@FindBy(xpath="//div[@class=\"font-semibold opacity-80\"]")
		WebElement scrollOn;
		
		@FindBy(xpath="(//div[@class=\"flex items-center w-full gap-2 px-3 py-1 font-semibold md:px-4 bg-lsOfferContainer text-ls-offer-color\"])[1]")
	    WebElement navigate;
		
		@FindBy(xpath="(//div[@class=\"stepcontent\"])[5]")
		WebElement clicktenantdetails;
		
		@FindBy(xpath="class=\"my-3 font-semibold text-24 po:text-18\"]")
		WebElement ScrollFillDetails;
		
		@FindBy(xpath="//input[@name=\"age\"]") 
		WebElement age;
		
		@FindBy(xpath="//input[@name=\"adhaarNumber\"]") 
		WebElement aadhar;
		
		@FindBy (xpath="//input[@placeholder=\"Enter PAN\"]")
		WebElement panno;
		
		@FindBy(name="buildingName")
		WebElement buildname;
		
		@FindBy(xpath="//input[@name=\"flatNumber\"]") 
		WebElement flatno;
		
		@FindBy(xpath="//input[@name=\"floorNumber\"]") 
		WebElement floorno;
		
		@FindBy(xpath="//input[@name=\"street\"]")
		WebElement street;
		
		@FindBy(xpath="//input[@name=\"pincode\"]")
		WebElement pincode;
		
		@FindBy(xpath="//input[@name=\"village\"]")
		WebElement village;
		
		@FindBy(xpath="//input[@name=\"district\"]")
		WebElement dist;
		
		@FindBy(xpath="//button[@class=\"po:px-2 po:py-1 default-footer-button rounded-6 btn btn-default\"]")
		WebElement saveandproceed;
		
		@FindBy(xpath="//div[text()=\"Contract Detail\"][1]")
		WebElement contDetails;
		
		@FindBy(xpath="//a[@aria-label=\"t&c\"]")
		WebElement tandc;
		
		@FindBy(xpath="//div[text()=\"About Us\"]")
		WebElement aboutus;
		
		//constructor
//=========================================================Scenario 1===============================================================		
	    public void hoverOnProfile() {
	    	Actions actions = new Actions(driver);

	    	// Hover over the element
	        actions.moveToElement(profileBtn).perform();
	      }	    
	    
	    public void clickProfile() {
	    	
	    	Actions actions= new Actions(driver);
	    	actions.click(editProfile).perform();

	    }
	    
	    public void clickOnNameBtn(String name,String email) throws InterruptedException {
 
	    	Actions actions= new Actions(driver);
	    	actions.click(nameBtn).perform();
	    	nameBtn.sendKeys(Keys.CONTROL +"a");
	    	nameBtn.sendKeys(Keys.BACK_SPACE);
	    	//Thread.sleep(2000);
	    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.visibilityOf(nameBtn));
	    	nameBtn.sendKeys(name);
	    	
	    	actions.click(emailBtn).perform();
	    	emailBtn.sendKeys(Keys.CONTROL +"a");
	    	emailBtn.sendKeys(Keys.BACK_SPACE);
	    	//Thread.sleep(2000);
	    	WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(5));
	        wait1.until(ExpectedConditions.visibilityOf(nameBtn));
	    	emailBtn.sendKeys(email);
	    	
	    	
			    }
	    
	    public void clickOnEmailLink() throws InterruptedException {
	    	Actions actions=new Actions(driver);
	    	actions.click(emailLink).perform();
	    	//Thread.sleep(1000);
	    	WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(5));
	        wait2.until(ExpectedConditions.visibilityOf(nameBtn));
	    }
	    
	    public void clickOnPassLink() throws InterruptedException {
	    	Actions actions=new Actions(driver);
	    	actions.click(passLink).perform();
	    	//Thread.sleep(1000);
	    	WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(5));
	        wait3.until(ExpectedConditions.visibilityOf(nameBtn));
	    }
	    public void clicktogglebutton() {
	    	Actions actions=new Actions(driver);
	    	actions.click(toggleBtn).perform();
	    }
		public void saveProfile() {
			Actions actions=new Actions(driver);
			actions.click(saveProfileBtn).perform();
		}
		
//====================================================Scenario 2=======================================================================
		
		
		public void clickDashboard() {
			dashboardBtn.click();
//			Actions actions=new Actions(driver);
//			actions.click(dashboardBtn).perform();
		}
		
		public void clickTimeline() {
			timelineBtn.click();
		}
		public void clickTestBtn() {
			testBtn.click();
		}
		public void clickTextArea(String feedback) throws InterruptedException {
			Thread.sleep(2000);
//			WebDriverWait wait4 = new WebDriverWait(driver,Duration.ofSeconds(5));
//	        wait4.until(ExpectedConditions.visibilityOf(nameBtn));
			textArea.click();
			Thread.sleep(1000);
//			WebDriverWait wait5 = new WebDriverWait(driver,Duration.ofSeconds(5));
//	        wait5.until(ExpectedConditions.visibilityOf(nameBtn));
			textArea.sendKeys(feedback);
		}
		public void clickSubmitBtn() {
			submitBtn.click();
		}
		public boolean isMessageDisplayed() {
	    	return driver.findElement(By.xpath("//div[text()=\"Testimonial Received successfully\"]")).isDisplayed();
	    }
		
   
//==================================================Scenario3======================================================================
	
	public void packersandmovers() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		Thread.sleep(1000);
		
		js.executeScript("arguments[0].scrollIntoView(true);", packersBtn);
		Thread.sleep(2000);
	}
	public void clickPackersandMovers() throws InterruptedException {
		Thread.sleep(1000);
		
		Actions actions=new Actions(driver);
		actions.click(packersBtn).perform();
		
	}
    public void srolltocheckPrices() throws InterruptedException {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		Thread.sleep(1000);
 
		js.executeScript("arguments[0].scrollIntoView(true);", checkpricebtn);
		Thread.sleep(2000);
    }
    public void clickOnCity() throws InterruptedException {
    	Thread.sleep(2000);
    	selectCity.click();
    	Thread.sleep(2000);
    	clickMumbai.click();
    	Thread.sleep(2000);
    	//Shiftingfrom.click();
    }
    public void tabclick() throws AWTException {
    	Robot robot =  new Robot(); 
    	
    	robot.keyPress(KeyEvent.VK_TAB);
    	robot.keyRelease(KeyEvent.VK_TAB);
    	
    	robot.keyPress(KeyEvent.VK_TAB);
    	robot.keyRelease(KeyEvent.VK_TAB);
    	
    	robot.keyPress(KeyEvent.VK_TAB);
    	robot.keyRelease(KeyEvent.VK_TAB);
    	
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
    }


  
    

//======================================================Scenario 4=================================================================================
    
    
    
    public void clickmenu() throws InterruptedException {
    	Thread.sleep(2000);
    	Actions action=new Actions(driver);
    	Thread.sleep(2000);
    	action.click(menubtn).perform();
    }
    public void clickrental() {
    	
    	rentalbtn.click();
    }
    public void clicklocation() throws InterruptedException {
    	Thread.sleep(4000);
    	//location.click();
    	//Thread.sleep(1000);
   }
    public void clickagreement() throws InterruptedException {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	 
		Thread.sleep(1000);
 
		js.executeScript("arguments[0].scrollIntoView(true);", scrollOn);
		Thread.sleep(2000);
    }
    public void navigateToAgreement() throws InterruptedException {
    	navigate.click();
    	Thread.sleep(3000);
    	String mainWindowHandle = driver.getWindowHandle();
	    for (String windowHandle : driver.getWindowHandles()) {
	        if (!windowHandle.equals(mainWindowHandle)) {
	            driver.switchTo().window(windowHandle);
	            break;
	        }
	    }
	    Actions action=new Actions(driver);
    	Thread.sleep(2000);
    	action.click(clicktenantdetails).perform();
    	
    }
    public void FillDetails(String age1, String aadharno,String panNo, String buildingName, String flatNumber, String floorNumber,
    		String street1, String pinCode1, String villageName, String district) throws InterruptedException {
    	age.sendKeys(age1);
    	aadhar.sendKeys(aadharno);
    	panno.sendKeys(panNo);
    	buildname.sendKeys(buildingName);
    	flatno.sendKeys(flatNumber);
    	floorno.sendKeys(floorNumber);
    	street.sendKeys(street1);
    	pincode.sendKeys(pinCode1);
    	village.sendKeys(villageName);
    	dist.sendKeys(district);
    }
    public void proceed() {
    	saveandproceed.click();
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(contDetails));
    }

//===================================================Scenario 5=========================================================================
	
  

	
	
	public void scroll() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scroll(0,40000)");
	    JavascriptExecutor js1=(JavascriptExecutor)driver;
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.visibilityOf(aboutus));
		    js1.executeScript("window.scroll(0,20000)");
		    JavascriptExecutor js2=(JavascriptExecutor)driver;
		    WebDriverWait wait9 = new WebDriverWait(driver,Duration.ofSeconds(5));
		    wait9.until(ExpectedConditions.visibilityOf(aboutus));
			    js2.executeScript("window.scroll(0,20000)");
			    }
	public void clickaboutus() {
		aboutus.click();
	}

	 
}
    
    
    
	



	