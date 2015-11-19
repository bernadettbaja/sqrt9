package com.pages;

import Helper.constante;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(constante.BASEURL + "/vacation")
public class VacationOptionsPage extends PageObject
{
	@FindBy(css = "a[href*='menuItem=new-request']")
    private WebElementFacade newVacationRequest;
	
	public void create_page_newVacationRequest() 
    {
    	newVacationRequest.click();
    }
	
	@FindBy(css = "a[href*='menuItem=my-requests']")
	private WebElementFacade newMyRequests;
	
	public void create_page_newMyRequests() 
    {
		newMyRequests.click();
    }
	
	@FindBy(css = "a[href*='menuItem=my-free-days']")
    private WebElementFacade newMyFreeDays;
	
	public void create_page_newMyFreeDays() 
    {
		newMyFreeDays.click();
    }
	
	@FindBy (css = "a[href*='menuItem=free-days-history']")
	private WebElementFacade newFreeDaysHistory;
	
	public void create_page_newFreeDaysHistory() 
    {
		newFreeDaysHistory.click();
    }
	
	@FindBy (css = "a[href*='menuItem=vacation-tracker']")
	private WebElementFacade trackVacationTracker;
	
	public void create_page_trackVacationTracker() 
    {
		trackVacationTracker.click();
    }
	
	@FindBy (css = "a[href*='menuItem=inbox']")
	private WebElementFacade inboxVacManagement;
	
	public void create_page_inboxVacManagement() 
    {
		inboxVacManagement.click();
    }
	
	@FindBy (css = "a[href*='menuItem=view-vacations']")
	private WebElementFacade viewVacations;
	
	public void create_page_viewVacations() 
    {
		viewVacations.click();
    }
	
	//    public void enter_keywords(String keyword) {
//        searchTerms.type(keyword);
//    }
  
}
