import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath = "//*[@id=\"tasks\"]/div[4]/a[2]")
	private WebElement  manageJenkins;
	
	@FindBy(xpath = "//*[@id=\"j_username\"]")
	private WebElement  username;
	
	@FindBy(xpath = "/html/body/div/div/form/div[2]/input")
	private WebElement  password;
	
	@FindBy(xpath = "/html/body/div/div/form/div[3]/input")
	private WebElement  loginButton;

	
	
public void clickManageJenkins() {
	manageJenkins.click();
}

public void login() {
	username.sendKeys("root");
	password.sendKeys("root");
	loginButton.click();
}
}
