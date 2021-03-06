import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Users {
	@FindBy(xpath = "//*[@id=\"tasks\"]/div[3]/a[2]")
	private WebElement  createUser;
	
	@FindBy(xpath = "//*[@id=\"people\"]/tbody/tr[3]/td[2]/a")
	private WebElement  userInfo;

	
	
	
public void clickCreateUser() {
	createUser.click();
}

/*
public  String checkNewUser() {
	
	return userInfo.getText();
}
*/

public boolean checkUser() {
	if (userInfo.isDisplayed()) {
		return true;
	}

	else {
		return false;
	}
}
}

