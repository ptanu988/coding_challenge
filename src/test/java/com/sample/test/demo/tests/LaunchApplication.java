package com.sample.test.demo.tests;

import com.sample.test.demo.TestBase;

public class LaunchApplication extends TestBase {

	public void getURLAndOpenApplication() {
		try {
			System.out.println("Driver URL is >>>>>>" + driver);

			driver.get(url);
			String actualTitle = driver.getTitle();

			if (actualTitle.contentEquals("Pizza Order Form")) {
				System.out.println("Test Passed Hello!");
			} else {
				System.out.println("Test Failed");
			}
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
