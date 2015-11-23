package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import helper.Constante;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.LogInSteps;
import steps.MyRequestsSteps;

@RunWith(SerenityRunner.class)
public class MyRequestsTest {

	@Managed(uniqueSession = true)
    public WebDriver webdriver;
	
	@Steps
	public LogInSteps logInSteps;
	
    @Steps
	public MyRequestsSteps myRequestsSteps;

    @Test
    public void myRequestsTest(){
    	logInSteps.login(Constante.USERDEV, Constante.PASSDEV);
    	myRequestsSteps.clickMyRequestsBtn();
    	myRequestsSteps.checkShowFutureVacation();
    	myRequestsSteps.selectFiler("6 - 10");
    	myRequestsSteps.selectFiler("Withdrawn");
    	myRequestsSteps.selectFiler("Sick Leave");
    	myRequestsSteps.selectFiler("Show only future vacations");
    	
    }
    
}
