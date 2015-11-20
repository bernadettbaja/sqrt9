package com.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
public class LogOutPage extends PageObject {

	@FindBy(css = "ul.user-toolbar li.user-avatar span.user-links")
	private WebElement pictureButton;

	@FindBy(css = "span.sign-out a")
	private WebElement signOutButton;
	

	public void clickUserPicture() {
		element(pictureButton).waitUntilVisible();
		waitABit(2000);
		pictureButton.click();
	}

	public void clickSignout() {
		element(signOutButton).waitUntilPresent();
		
		String href = signOutButton.getAttribute("href");
		
		System.out.println("HREF: " + href);
		getDriver().get(href);
	}
}