package com.fitpeoFunctionTest;

import static fitpeo_karan_SDET.StaticTestSession.browserSession;
import static org.testng.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import fitpeo_karan_SDET.ApplicationsSettings;


public class ValidateRevenuePage {
	public JavascriptExecutor js = (JavascriptExecutor) browserSession.driver;
    public WebElement text_field;
    public  WebElement slider_bar;
    public String browser_name= ApplicationsSettings.BROWSER_NAME;
    public  WebDriverWait wait= new WebDriverWait(browserSession.driver,Duration.ofSeconds(10));
   
  @Test
    public void user_scroll_the_page_till_slide_bar_is_visible_slide_the_bar_as_requested_by_use() throws InterruptedException {
	   browserSession.startBrowserSession(browser_name);
	   WebDriverWait wait= new WebDriverWait(browserSession.driver,Duration.ofSeconds(10));
	   Actions act = new Actions(browserSession.driver);
       WebElement revenue_calculator_menu= browserSession.driver.findElement(By.xpath("//div[contains(text(),'Revenue Calculator')]"));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Revenue Calculator')]")));
       revenue_calculator_menu.click();
//WebElement slider_bar = browserSession.driver.findElement(By.xpath("//div[@class='MuiBox-root css-j7qwjs']/span[1]/span[3]/input"));
     //  Thread.sleep(20000);
       try {
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='sc-1uf0igr-0 dJdqci']")));
       
       WebElement ele= browserSession.driver.findElement(By.xpath("//button[@class='sc-1uf0igr-0 dJdqci']"));
      if(ele.isDisplayed()) {
       ele.click();}}
       catch(Exception e) {
    	   System.out.println("element not displayed"+e);
       }
    //  Thread.sleep(10000);
      
       ((JavascriptExecutor) browserSession.driver).executeScript("window.scrollBy(0,250)");
    
        slider_bar= browserSession.driver.findElement(By.xpath("//*[contains(@class,'css-j7qwjs')]/span[1]/span[3]"));
       // ((JavascriptExecutor)browserSession.driver).executeScript("arguments[0].scrollIntoView(true);", slider_bar);
        WebElement ele2= browserSession.driver.findElement(By.xpath("//*[contains(@class,'css-j7qwjs')]/span[1]/span[3]/input"));
        int x=Integer.parseInt(ele2.getAttribute("value"));
        System.out.println(x);
     int y =(int)93;
      act.moveToElement(slider_bar);
         act.clickAndHold(slider_bar);
         act.moveByOffset(y,0);
         act.sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT);
        act.build().perform();
       
        System.out.println("Slided to 820");
  }

@Test(priority=1)
  public void value_should_be_updated_in_text_field() throws InterruptedException {
	  Actions act2 = new Actions(browserSession.driver);
    
      WebElement text_field= browserSession.driver.findElement(By.xpath("//*[@id=':r0:']"));
     // ((JavascriptExecutor)browserSession.driver).executeScript("arguments[0].scrollIntoView();",text_field);
      Thread.sleep(5000);
      text_field.click();
      act2.moveToElement(text_field);
      act2.click();
      act2.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE);
     act2.sendKeys("520");
     act2.build().perform();
      assertEquals("520", text_field.getAttribute("value"));
      
      System.out.println("Text field updated");

 
      browserSession.driver.close();
  
    }

}



