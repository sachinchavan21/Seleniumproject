package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;

public class S002 {

@Test(priority = 1)
    public void OpenWebRedirectToLogin(){


        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        String ActualTitle =driver.getTitle();
        String ExpectedTitle ="CURA Healthcare Service";
        Assert.assertEquals(ActualTitle,ExpectedTitle,"Title not matched");
    WebElement BtnMakeAppointMent = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
            BtnMakeAppointMent.click();
    WebElement TextBoxUserName = driver.findElement(By.xpath("//input[@id='txt-username']"));
    Assert.assertTrue(TextBoxUserName.isDisplayed());
            driver.close();
    }
    @Test(priority = 2)
    public void LoginTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement BtnMakeAppointMent = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        BtnMakeAppointMent.click();
        WebElement TextBoxUserName = driver.findElement(By.xpath("//input[@id='txt-username']"));
        TextBoxUserName.sendKeys("John Doe");
        WebElement TextBoxPassword = driver.findElement(By.xpath("//input[@id='txt-password']"));
        TextBoxPassword.sendKeys("ThisIsNotAPassword");
        WebElement BtnLogin = driver.findElement(By.xpath("//button[@id='btn-login']"));
        BtnLogin.click();
        WebElement BtnFacility = driver.findElement(By.xpath("//select[@id='combo_facility']"));
        Assert.assertTrue(BtnFacility.isDisplayed());

    }
}
