package pages;
import helper.Constante;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(Constante.BASEURL + "/vacation")
public class LogInPage extends PageObject {

	@FindBy(css = "input[id='_58_login']")
	private WebElementFacade username;

	@FindBy(css = "input[id='_58_password']")
	private WebElementFacade password;

	@FindBy(css = "input[type=\"submit\"]")
	private WebElementFacade loginButton;

	public void enter_username(String user) {
		element(username).waitUntilVisible();
		username.type(user);
	}

	public void enter_password(String pass) {
		element(password).waitUntilVisible();
		password.type(pass);
	}

	public void click_login() {
		loginButton.click();
	}
}