package com.steps.serenity;

import com.pages.InboxPage;
import com.pages.VacationOptionsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ApproveRequestSteps extends ScenarioSteps 
{
 VacationOptionsPage vacationOptionsPage;

	InboxPage InboxPage;

	@Step
	public void GoToInbox() {
		vacationOptionsPage.create_page_inboxVacManagement();
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
	public void reject() {
		InboxPage.reject();
	}
	@Step
	public void verifymessage(){
		InboxPage.verifyMessage();
	}

}
