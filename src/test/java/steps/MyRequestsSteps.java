package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.MyRequestsPage;

public class MyRequestsSteps extends ScenarioSteps {

	MyRequestsPage myrequestsPage;
	
	private static final long serialVersionUID = 8778191177521909831L;

	@Step
	public void clickMyRequestsBtn(){
		myrequestsPage.clickMyRequestsBtn();
	}
	
	@Step
	public void checkShowFutureVacation(){
		myrequestsPage.clickShowOnlyFutureVacations();
	}
	
	@Step
	public void selectFiler(String filterName){
		myrequestsPage.selectFilter(filterName);;
	}
	
}
