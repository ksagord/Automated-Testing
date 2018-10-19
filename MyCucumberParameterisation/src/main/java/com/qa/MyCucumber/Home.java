package com.qa.MyCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {

	@FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
	private WebElement menu;
	// *[@id="wsb-nav-00000000-0000-0000-0000-000450914915"]/ul/li[3]/a

	@FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[5]/a")
	private WebElement checkout;

	@FindBy(xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span")
	private WebElement item1;

	@FindBy(xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451959280\"]/span")
	private WebElement item2;

	public void clickMenu() {
		menu.click();

	}

	public void clickCheckout() {
		checkout.click();

	}

	public boolean checkList() {
		if (item1.isDisplayed() && item2.isDisplayed()) {
			return true;
		}

		else {
			return false;
		}
	}
}
