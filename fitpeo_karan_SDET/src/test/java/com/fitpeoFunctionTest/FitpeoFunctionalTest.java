package com.fitpeoFunctionTest;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import fitpeo_karan_SDET.ApplicationsSettings;

import static fitpeo_karan_SDET.StaticTestSession.browserSession;


public class FitpeoFunctionalTest {
	
	
	 public String browser_name= ApplicationsSettings.BROWSER_NAME;
	  
	   @BeforeTest
	    public void user_is_on_home_page_of_fitpeo()  {
	        browserSession.startBrowserSession(browser_name);
	       System.out.println("User is on Home Page");
	       Assert.assertEquals(true, "Remote Patient Monitoring (RPM) - fitpeo.com".equals(browserSession.driver.getTitle()));

	    }
	    @Test
	    public void user_click_on_revenue_calculator_menu_button() throws InterruptedException {
	        WebDriverWait wait= new WebDriverWait(browserSession.driver,Duration.ofSeconds(10));
	        
	        WebElement revenue_calculator_menu= browserSession.driver.findElement(By.xpath("//div[contains(text(),'Revenue Calculator')]"));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Revenue Calculator')]")));
	        revenue_calculator_menu.click();
	       


	    }
	    @Test(dependsOnMethods={"user_click_on_revenue_calculator_menu_button"}) 
	    public void user_lands_on_revenue_calculator_page() throws InterruptedException  {
	    	Thread.sleep(10000);
	       System.out.println(browserSession.driver.getCurrentUrl());
	     Assert.assertEquals(true, "https://www.fitpeo.com/revenue-calculator".equals(browserSession.driver.getCurrentUrl()));
	        System.out.println("User is on Revenue Calculator page");
	        browserSession.driver.close();

	    }
	   
	}