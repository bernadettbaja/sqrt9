package pages;

import helper.Constante;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(Constante.BASEURL + "/vacation")
public class VacationOptionsPage extends PageObject
{
	@FindBy(css = "a[href*='menuItem=new-request']")
    private WebElementFacade newVacationRequest;
	
	public void createPageNewVacationRequest() 
    {
    	newVacationRequest.click();
    }
	
	@FindBy(css = "a[href*='menuItem=my-requests']")
	private WebElementFacade newMyRequests;
	
	public void createPageMyRequests() 
    {
		newMyRequests.click();
    }
	
	@FindBy(css = "a[href*='menuItem=my-free-days']")
    private WebElementFacade newMyFreeDays;
	
	public void createPageMyFreeDays() 
    {
		newMyFreeDays.click();
    }
	
	@FindBy (css = "a[href*='menuItem=free-days-history']")
	private WebElementFacade newFreeDaysHistory;
	
	public void createPageFreeDaysHistory() 
    {
		newFreeDaysHistory.click();
    }
	
	@FindBy (css = "a[href*='menuItem=vacation-tracker']")
	private WebElementFacade trackVacationTracker;
	
	public void enterPageTrackVacationTracker() 
    {
		trackVacationTracker.click();
    }
	
	@FindBy (css = "a[href*='menuItem=inbox']")
	private WebElementFacade inboxVacManagement;
	
	public void createPageInboxVacManagement() 
    {
		inboxVacManagement.click();
    }
	
	@FindBy (css = "a[href*='menuItem=view-vacations']")
	private WebElementFacade viewVacations;
	
	public void createPageViewVacations() 
    {
		viewVacations.click();
    }  
}
