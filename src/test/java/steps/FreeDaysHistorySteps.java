package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.FreeDaysHistoryPage;

public class FreeDaysHistorySteps extends ScenarioSteps {

	FreeDaysHistoryPage freeDaysHistoryPage;

	private static final long serialVersionUID = 8778191177521909831L;

	@Step
	public void clickFreeDaysHistoryMenuBtn() {
		freeDaysHistoryPage.clickFreeDaysHistoryMenuBtn();
	}
	
	@Step
	public void selectValueFromType(String typeValue){
		freeDaysHistoryPage.selectTypeFilterSearch(typeValue);
	}
	
    @Step
    public void selectValueFromDays (String daysValue) {
    	freeDaysHistoryPage.selectDaysFilterSearch(daysValue);
    }
    @Step
    public void selectValueFromOperation(String operationValue) {
    	freeDaysHistoryPage.selectOperationFilterSearch(operationValue);
    }
    
    @Step
	public void clickApplyButton() {
    	freeDaysHistoryPage.clickApplyButton();
    }
    
    @Step
    	public void verifyMessage(){
    	freeDaysHistoryPage.verifyMessage();
	}
   }

