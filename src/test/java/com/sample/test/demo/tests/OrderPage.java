package com.sample.test.demo.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.sample.test.demo.TestBase;
import com.sample.test.demo.constants.CustomerInformation;

public class OrderPage extends TestBase {

	
	public void selectPizzaType(String type, WebDriver driver) {
		
		WebElement pizza1 = driver.findElement(By.id("pizza1Pizza"));
		Select pizza = new Select(pizza1);
		pizza.selectByValue(type);
	}
	//Selected topping 1 and topping 2 
	
	public void selectToppings(String top1, String top2, WebDriver driver) {
		
		WebElement topping1 = driver.findElement(By.xpath("//div[@id='pizza1']//select[@class='toppings1']"));
		Select topping_1 = new Select(topping1);
		topping_1.selectByValue(top1);
				
		WebElement topping2 = driver.findElement(By.xpath("//div[@id='pizza1']//select[@class='toppings2']"));
		Select topping_2 = new Select(topping2);
		topping_2.selectByValue(top2);
	}
	
	//First cleared and then entered quantity ,can enter any quantity to test.
	
	public void selectQuantity(String i, WebDriver driver) {
		
		WebElement q = driver.findElement(By.id("pizza1Qty"));
		q.clear();
		q.sendKeys(i);
	}
	
	//Happy path as well as used  different scenarios to test with  name and phone number ,can get the  more info from Customer Information(package sample.test.demo.constants)
	
	public void enterCustInfo(String cust, WebDriver driver) {
		WebElement n = driver.findElement(By.id("name"));
		WebElement e = driver.findElement(By.id("email"));
		WebElement p = driver.findElement(By.id("phone"));
		n.clear();
		e.clear();
		p.clear();
		switch(cust) {
		case "Customer1":
			n.sendKeys(CustomerInformation.CUSTOMER1.getName());
			e.sendKeys(CustomerInformation.CUSTOMER1.getEmail());
			p.sendKeys(CustomerInformation.CUSTOMER1.getPhone());
			break;
		case "Customer2":
			n.sendKeys(CustomerInformation.CUSTOMER2.getName());
			e.sendKeys(CustomerInformation.CUSTOMER2.getEmail());
			p.sendKeys(CustomerInformation.CUSTOMER2.getPhone());
			break;
		case "Customer3":
			n.sendKeys(CustomerInformation.CUSTOMER3.getName());
			e.sendKeys(CustomerInformation.CUSTOMER3.getEmail());
			p.sendKeys(CustomerInformation.CUSTOMER3.getPhone());
			break;
		default:
			break;
		}
		
	}
	
	public void paymentMethod(String method, WebDriver driver) {
		switch(method) {
		case "Credit":
			WebElement creditCard = driver.findElement(By.id("ccpayment"));
			creditCard.click();
			break;
		case "Cash":
			WebElement cash = driver.findElement(By.id("cashpayment"));
			cash.click();
			break;
		default:
			break;
		}	
	}
	
	public void placeOrder(WebDriver driver) {
		WebElement placeOrder = driver.findElement(By.id("placeOrder"));
		placeOrder.click();
	}
	
	public void resetPage(WebDriver driver) {
		WebElement reset = driver.findElement(By.id("reset"));
		reset.click();
	}
}
