package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stepdef {
    WebDriver driver;
    @Given("I launch chrome browser")
    public void iLaunchChromeBrowser() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\leela\\Downloads\\ChromeSetup.exe");
        driver=new ChromeDriver();
    }

    @When("I open orange hrm homepage")
    public void iOpenOrangeHrmHomepage() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Then("I verify that the logo is present")
    public void iVerifyThatTheLogoIsPresent() {

        boolean status=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
        Assert.assertEquals(true,status);
    }

    @And("close browser")
    public void closeBrowser() {
    }
}
