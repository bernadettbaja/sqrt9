package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyRequestsPage extends PageObject 
{
	

	@FindBy(css = "a[href*='my-requests']")
	private WebElementFacade myRequests;

}
