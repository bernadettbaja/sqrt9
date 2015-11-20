package com.steps.serenity;

import com.pages.InboxPage;
import com.pages.AssignedToOthersPage;
import com.pages.VacationOptionsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AssignedToOthersSteps extends ScenarioSteps 
{
	VacationOptionsPage vacationOptionsPage;
	InboxPage InboxPage;
	AssignedToOthersPage AssignedToOthersPage;

	@Step
	public void GoToInbox() {
		vacationOptionsPage.create_page_inboxVacManagement();
	}
	@Step
	public void GotoAssignedToOthersTab(){
		AssignedToOthersPage.assignedToOthers();
	}

	@Step
	public void checklist() {
		AssignedToOthersPage.clickChecklist();
	}

	@Step
	public void reject() {
		AssignedToOthersPage.reject();
	}
	@Step
	public void verifymessage(){
		AssignedToOthersPage.verifyMessage();
		
	}


}