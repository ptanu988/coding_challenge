


//code to check the Thank you message .
//	public static String successMessage ="Thank you for your order";
package com.sample.test.demo.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sample.test.demo.TestBase;

import junit.framework.Assert;

public class ValidateOrder extends TestBase{
//	public static String successMessage ="Thank you for your order";
	public void validateMessage(String msg, WebDriver driver) {
		
		WebElement dialog = driver.findElement(By.xpath("//div[@id='dialog']/p"));
		String actualMessage = dialog.getText();
		String[] text = actualMessage.split("!");
		String actualText = text[0];
		Assert.assertEquals(msg, actualText);
	}

}
