package com.sample.test.demo.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.sample.test.demo.Configuration;
import com.sample.test.demo.TestBase;
import com.sample.test.demo.constants.ExpectedMessages;
import com.sample.test.demo.constants.PizzaToppings;
import com.sample.test.demo.constants.PizzaTypes;

public class PizzaOrderTest extends TestBase {
	private Configuration config;
	public static LaunchApplication launchApplication = new LaunchApplication();
	public static TestBase testBase = new TestBase();
	public static OrderPage pizzaOrderPage = new OrderPage();
	public static ValidateOrder validateOrder = new ValidateOrder();
	

	@DataProvider (name = "pizzaOrder")
	public Object[] [] getData(){
		return new Object[][] {
			{PizzaTypes.SMALL_NOTOPPINGS.getDisplayName(),PizzaToppings.MANGOS.getDisplayName(),PizzaToppings.OLIVES.getDisplayName(),"1","Customer1","Credit",ExpectedMessages.SUCCESS.getDisplayName()},
			{PizzaTypes.LARGE_THREETOPPINGS.getDisplayName(),PizzaToppings.EXTRACHEESE.getDisplayName(),PizzaToppings.MOZZARELLA.getDisplayName(),"2","Customer2","Cash",ExpectedMessages.PHONEERROR.getDisplayName()},
			{PizzaTypes.LARGE_THREETOPPINGS.getDisplayName(),PizzaToppings.EXTRACHEESE.getDisplayName(),PizzaToppings.MOZZARELLA.getDisplayName(),"2","Customer3","Cash",ExpectedMessages.NAMEERROR.getDisplayName()}};
	}
	
	@Test(dataProvider = "pizzaOrder")
	public void orderTest(String p1, String p2, String p3, String p4, String p5,String p6, String p7) {
		
		pizzaOrderPage.selectPizzaType(p1,driver);
		pizzaOrderPage.selectToppings(p2,p3, driver);
		pizzaOrderPage.selectQuantity(p4,driver);
		pizzaOrderPage.enterCustInfo(p5, driver);
		pizzaOrderPage.paymentMethod(p6,driver);
		pizzaOrderPage.placeOrder(driver);
		validateOrder.validateMessage(p7,driver);
	}
}

