package com.fitpeoFunctionTest;
import static fitpeo_karan_SDET.StaticTestSession.browserSession;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import fitpeo_karan_SDET.ApplicationsSettings;
public class ReimbursementFunctionalTest {
	public JavascriptExecutor js = (JavascriptExecutor) browserSession.driver;
    public WebElement text_field;
    public  WebElement slider_bar;
    public String browser_name= ApplicationsSettings.BROWSER_NAME;
    public  SoftAssert sr= new SoftAssert();
	@Test
	public void validate_total_recurring_reimbursement() throws InterruptedException {
		browserSession.startBrowserSession(browser_name);
		   WebDriverWait wait= new WebDriverWait(browserSession.driver,Duration.ofSeconds(10));
		 
	       WebElement revenue_calculator_menu= browserSession.driver.findElement(By.xpath("//div[contains(text(),'Revenue Calculator')]"));
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Revenue Calculator')]")));
	       revenue_calculator_menu.click();
	       Thread.sleep(5000);
	       ((JavascriptExecutor) browserSession.driver).executeScript("window.scrollBy(0,750)");
	       WebElement checkbox_99091=browserSession.driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']/div[1]/label/span/child::input[1]"));
	       checkbox_99091.click();
	       WebElement checkbox_99453=browserSession.driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']/div[2]/label/span/child::input[1]"));
	       checkbox_99453.click();
	       WebElement checkbox_99454=browserSession.driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']/div[3]/label/span/child::input[1]"));
	       checkbox_99454.click();
	       WebElement checkbox_99474=browserSession.driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']/div[8]/label/span/child::input[1]"));
	       checkbox_99474.click();
	       WebElement validate = browserSession.driver.findElement(By.xpath("//*[@class='MuiToolbar-root MuiToolbar-gutters MuiToolbar-regular css-1lnu3ao']/p[4]/p"));
	       String value=validate.getText();
	       try {
	    	  
	    	   //sr.assertEquals(value,"$110700");
	    	   sr.assertEquals(value,"$27000");
	    	
	       }
	       catch(Exception e) {
	    	   System.out.println("Total Recurring Reimbursement for all Patients Per Month: shows the value " + value + " and it is not matching" + e);
	       }  sr.assertAll();
	       
	       browserSession.driver.close();
	       
	      
	       
	     //  ((JavascriptExecutor)browserSession.driver).executeScript("arguments[0].scrollIntoView();",checkbox);
	      
	    	   
	       }
	       
	      
	       // ((JavascriptExecutor)browserSession.driver).executeScript("arguments[0].scrollIntoView();",text_field);
	}


