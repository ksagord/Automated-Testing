import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUSer {

	@FindBy(xpath = "//*[@id=\"username\"]")
	private WebElement  username;
	
	@FindBy(xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[2]/td[2]/input")
	private WebElement  password;
	
	@FindBy(xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[3]/td[2]/input")
	private WebElement  confirmPassword;
	
	@FindBy(xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[4]/td[2]/input")
	private WebElement  fullName;
	
	@FindBy(xpath = "//*[@id=\"yui-gen1-button\"]")
	private WebElement  createUser;
	
	
	
	public void addUSer(String user, String pass, String name ) {
		
		username.sendKeys(user);
		password.sendKeys(pass);
		confirmPassword.sendKeys(pass);
		fullName.sendKeys(name);
		createUser.click();
		
	}
}
