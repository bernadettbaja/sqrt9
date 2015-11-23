package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.InboxPage;
import pages.VacationOptionsPage;

public class ApproveRequestSteps extends ScenarioSteps 
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
	public void approve() {
		InboxPage.approve();
	}

	@Step
	public void verifymessage(){
		InboxPage.verifyMessage();
	}

}
