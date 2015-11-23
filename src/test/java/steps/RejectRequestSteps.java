package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.InboxPage;
import pages.VacationOptionsPage;

public class RejectRequestSteps extends ScenarioSteps 
{
 VacationOptionsPage vacationOptionsPage;

	InboxPage InboxPage;

	@Step
	public void GoToInbox() {
		vacationOptionsPage.createPageInboxVacManagement();
	}

	@Step
	public void checklist() {
		InboxPage.clickChecklist();
	}

	@Step
	public void reject() {
		InboxPage.reject();
	}
	@Step
	public void verifymessage(){
		InboxPage.verifyMessage();
	}

}