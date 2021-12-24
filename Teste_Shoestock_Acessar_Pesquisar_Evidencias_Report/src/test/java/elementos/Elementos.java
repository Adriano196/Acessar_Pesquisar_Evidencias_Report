package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By Elementos = By.cssSelector("#input-search");
	private By Elementos1 = By.xpath("//img[@data-testid='image']");
	private By Elementos2 = By.xpath("/html/body/div[3]/div[5]/div[1]/div[3]/div[2]/button");

	public By getElementos() {
		return Elementos;
	}

	public By getElementos1() {
		return Elementos1;
	}

	public By getElementos2() {
		return Elementos2;
	}

}
