package NBStepDefinition;


import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;

import ProfileDriverSetup.SetupDriver;
import ProfilePageFac.LoginClass;
import ProfilePageFac.ProfilePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



//Scenario 1

public class PStepDefinition {
	static WebDriver driver;
	LoginClass lc;
	ProfilePage pf;
	
	@Given("User should be logged in")
	public void user_should_be_logged_in() throws InterruptedException {
		driver=SetupDriver.chromedriver();
		lc=new LoginClass(driver);
		lc.userLogin();
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("User hovers on profile drop down in the menu bar")
	public void user_hovers_on_profile_drop_down_in_the_menu_bar() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		pf=new ProfilePage(driver);
		Thread.sleep(3000);
		
		
		pf.hoverOnProfile();
		
	}

	@And("User clicks on profile")
	public void user_clicks_on_profile() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		pf=new ProfilePage(driver);
		Thread.sleep(1000);
		pf.clickProfile();
		
	}
	@When("^User enters (.*) and (.*)$")
	public void user_enters_and(String name, String email) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		pf=new ProfilePage(driver);
		Thread.sleep(2000);
		pf.clickOnNameBtn(name,email);
	}

	@And("User clicks the link to verify email")
	public void user_clicks_the_link_to_verify_email() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		pf=new ProfilePage(driver);
		pf.clickOnEmailLink();
	    
	}

	@And("User clicks on the link to reset password")
	public void user_clicks_on_the_link_to_reset_password() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    pf=new ProfilePage(driver);
	    pf.clickOnPassLink();
	}

	@And("User clicks on the toggle button")
	public void user_clicks_on_the_toggle_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		pf=new ProfilePage(driver);
	    pf.clicktogglebutton();
	    Thread.sleep(2000);
	}

	@Then("User clicks on save profile")
	public void user_clicks_on_save_profile() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		pf=new ProfilePage(driver);
	    pf.saveProfile();
	}
	@AfterStep
	public static void takeScreendown1(Scenario scenerio) {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}
//===========================================Scenario 2==========================================
	
	@When("User hovers on the profile button")
	public void user_hovers_on_the_profile_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		pf=new ProfilePage(driver);
		Thread.sleep(3000);
		pf.hoverOnProfile();
	    
	}
	@And("User clicks on dashboard dropdown")
	public void user_clicks_on_dashboard_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
		pf.clickDashboard();
	}
	@And("User clicks on the timeline button")
	public void user_clicks_on_the_timeline_button() {
	    // Write code here that turns the phrase above into concrete actions
		pf.clickTimeline();
	}

	@And("User clicks on Write a testimonial")
	public void user_clicks_on_write_a_testimonial() {
	    // Write code here that turns the phrase above into concrete actions
		pf.clickTestBtn();
	}
	@And("^User writes (.*)$")
	public void user_writes(String feedback) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		pf.clickTextArea(feedback);
	}
	
	@Then("User clicks on submit button to give feedback")
	public void user_clicks_on_submit_button_to_give_feedback() {
	    // Write code here that turns the phrase above into concrete actions
		pf=new ProfilePage(driver);
		pf.clickSubmitBtn();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement e1 = driver.findElement(By.xpath("//div[@id=\"alertMessageBox\"]//child::div[@class=\"messageText\"]"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"alertMessageBox\"]//child::div[@class=\"messageText\"]")));
		String res = e1.getText();
		Assert.assertEquals("Testimonial Received successfully",res);
	}
	@AfterStep
	public static void takeScreendown2(Scenario scenerio) {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}
	
	
	
//======================================Scenario 3===================================================	
	@When("user scrolls down the home page")
	public void user_scrolls_down_the_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		pf=new ProfilePage(driver);
		
		Thread.sleep(2000);
		pf.packersandmovers();
	}
	@And("user clicks on packers and movers option")
	public void user_clicks_on_packers_and_movers_option() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		pf.clickPackersandMovers();
		
		driver.get("https://www.nobroker.in/packers-and-movers-in-mumbai?page=pnm&nbFr=HOME-TILE-&relocationType=INTRA_CITY");
	}
	@And("user scrolls down packers and movers page")
	public void user_scrolls_down_packers_and_movers_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		pf.srolltocheckPrices();
	}
	@And("user selects city")
	public void user_selects_city() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		pf.clickOnCity();
		
		//pf.clickOnCheckPrices();
		
		//driver.get("https://www.nobroker.in/packers-and-movers-in-mumbai/slots?page=pnm&nbFr=HOME-TILE-&relocationType=INTRA_CITY");
		
	}
	@And("user searches the locality {string} and {string}")
	public void user_searches_the_locality_and(String string, String string2) throws InterruptedException, AWTException {
	    // Write code here that turns the phrase above into concrete actions
		pf.tabclick();

	}
	@And("user clicks on check prices button")
	public void user_clicks_on_check_prices_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		// Assert.assertTrue(pf.isMessageDisplayed());
		String actual = driver.getCurrentUrl();
		String expected = "https://www.nobroker.in/packers-and-movers-in-mumbai/slots?page=pnm&nbFr=HOME-TILE-&relocationType=INTRA_CITY";
		AssertJUnit.assertEquals(expected, actual);
	}
	@Then("user gets navigated to select pickup date and time")
	public void user_gets_navigated_to_select_pickup_date_and_time() {
	    // Write code here that turns the phrase above into concrete actions
	}
	@AfterStep
	public static void takeScreendown3(Scenario scenerio) {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}
	
	
//====================================scenario 4====================================
	
	
	
	@When("User is on menu drop down and clicks on rental agreement button")
	public void user_is_on_menu_drop_down_and_clicks_on_rental_agreement_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		pf=new ProfilePage(driver);
		pf.clickmenu();
	}
	
	
	
	@When("clicks on rental agreements with adhaar")
	public void clicks_on_rental_agreements_with_adhaar() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		pf.clickrental();
		//pf.clicklocation();
	    
	}

	@And("clicks on tenant details option")
	public void clicks_on_tenant_details_option() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    pf.clickagreement();
	    pf.navigateToAgreement();
	}

	@And("scrolls down to fill details and fills details")
	public void scrolls_down_to_fill_details_and_fills_details(DataTable dataTable) throws InterruptedException {
		
		List<List<String>> cells = dataTable.cells();
		
	    pf.FillDetails(cells.get(0).get(0), cells.get(0).get(1), cells.get(0).get(2), cells.get(0).get(3), cells.get(0).get(4), cells.get(0).get(5), cells.get(0).get(6), cells.get(0).get(7), cells.get(0).get(8), cells.get(0).get(9));
		
	}

	@And("clicks on save and proceed")
	public void clicks_on_save_and_proceed() {
	    // Write code here that turns the phrase above into concrete actions
		pf.proceed();
	}

	@Then("user gets navigated to next page of the form")
	public void user_gets_navigated_to_next_page_of_the_form() {
	    // Write code here that turns the phrase above into concrete actions
		  
//		String details = pf.contractDetails();
//		   Assert.assertEquals(details,"When you need the service?");
		String actual = driver.getCurrentUrl();
		String expected = "https://www.nobroker.in/rental-agreement-in-mumbai?nbFr=Home_page&ps=TERM_DETAIL&activeLead=3ab9b6a8d85d4de3b1be8fddbcc13b9a";
		AssertJUnit.assertEquals(expected, actual);

	}
	@AfterStep
	public static void takeScreendown4(Scenario scenerio) {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}
	
//======================================Scenario 5=====================================================
	@When("user scroll down on home page")
	public void user_scroll_down_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		pf=new ProfilePage(driver);
		pf.scroll();
	}

//	@When("user clicks on terms and conditions option and redirects to career tab")
//	public void user_clicks_on_terms_and_conditions_option_and_redirects_to_career_tab() {
//	    // Write code here that turns the phrase above into concrete actions
//	}

	@When("user comes back to home page and clicks on AboutUs option")
	public void user_comes_back_to_home_page_and_clicks_on_about_us_option() {
	    // Write code here that turns the phrase above into concrete actions
		pf.clickaboutus();
	}

	@Then("user should redirect to AboutUs tab")
	public void user_should_redirect_to_about_us_tab() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.nobroker.in/aboutus");
	}
	@AfterStep
	public static void takeScreendown5(Scenario scenerio) {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

