package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import helper.Constante;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.FreeDaysHistorySteps;
import steps.LogInSteps;

@RunWith(SerenityRunner.class)
public class FreeDaysHistoryTest  {
	
	@Managed(uniqueSession = true)
    public WebDriver webdriver;
	
	@Steps
	public LogInSteps logInSteps;
	@Steps
	public FreeDaysHistorySteps freeDaysHistorySteps;
	
	
	@Test
	public void freeDaysHistoryTest(){
		logInSteps.login(Constante.USERDEV, Constante.PASSDEV);
		freeDaysHistorySteps.clickFreeDaysHistoryMenuBtn();
		freeDaysHistorySteps.selectValueFromType("Vacation days");
		freeDaysHistorySteps.selectValueFromDays("6 - 10");
		freeDaysHistorySteps.selectValueFromOperation("Removed Days");
		freeDaysHistorySteps.clickApplyButton();
		freeDaysHistorySteps.verifyMessage();

		
	}

}
