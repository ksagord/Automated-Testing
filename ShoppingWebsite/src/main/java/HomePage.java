import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	
	@FindBy(xpath = "//*[@id=\"search_query_top\"]")
	private WebElement searchbar;
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/button")
	private WebElement searchbutton;
	
	@FindBy(xpath = "//*[@id=\"product_reference\"]")
	private WebElement item;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
	private WebElement position;



public void finditem(String search) {
	
	searchbar.sendKeys(search);
	searchbutton.click();
	position.click();
	
}

public String verify(){
return item.getText();
}


}

