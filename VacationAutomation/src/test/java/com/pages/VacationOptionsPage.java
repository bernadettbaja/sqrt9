package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.4.88:9090/vacation")
public class VacationOptionsPage extends PageObject
{
	@FindBy(css = "a[href*='menuItem=new-request']")
    private WebElementFacade newVacationRequest;
	
	@FindBy(css = "a[href*='menuItem=my-requests']")
	private WebElementFacade newMyRequests;
	
	@FindBy(css = "  ")
    private WebElementFacade newMyFreeDays;
	
	@FindBy (css = "#aui_3_4_0_1_340 > div.aui-column.aui-w25.aui-column-first > div > div:nth-child(1) > ul > li:nth-child(5) > a")
	private WebElementFacade newFreeDaysHistory;
	
	@FindBy (css = "#aui_3_4_0_1_340 > div.aui-column.aui-w25.aui-column-first > div > div:nth-child(2) > ul > li.inactive-menu > a")
	private WebElementFacade trackVacationTracker;
	
	@FindBy (css = "#aui_3_4_0_1_340 > div.aui-column.aui-w25.aui-column-first > div > div:nth-child(3) > ul > li:nth-child(3) > a")
	private WebElementFacade inboxVacManagement;
	
	@FindBy (css = "#p_p_id_evovacation_WAR_EvoVacationportlet_ > div > div > div > div > div > div.aui-column.aui-w25.aui-column-first > div > div:nth-child(3) > ul > li:nth-child(4) > a")
	private WebElementFacade viewVacations;
	
	
	//    public void enter_keywords(String keyword) {
//        searchTerms.type(keyword);
//    }

    public void create_page_newVacationRequest() 
    {
    	newVacationRequest.click();
    }
}
