package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class S001 {
@Test
   public static void firstprogram() {


       WebDriver driver = new ChromeDriver();
       driver.get("https://vwo.com/");
       //  Thread.sleep(5000);
       System.out.println(driver.getCurrentUrl());
//System.out.println(driver.getPageSource());
    Assert.assertEquals(driver.getTitle(),"VWO | Digital Experience 1Optimization","Negative Test case");
       driver.close();

   }
}
