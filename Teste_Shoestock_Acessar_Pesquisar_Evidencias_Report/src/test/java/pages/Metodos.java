package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Metodos {

	Actions actions;
	WebDriver driver;

	public void acessarSite(String site) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();

	}

	public void buscarProduto(String texto, By Elementos) {
		driver.findElement(Elementos).sendKeys(texto);
	}

	public void submit(By Elementos) {
		driver.findElement(Elementos).submit();

	}

	public void click(By Elementos1) {
		driver.findElement(Elementos1).click();
	}

	public void clickComprar(By Elementos2) {
		driver.findElement(Elementos2).click();
	}

	public void screnShot(String nome) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File desFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(scrFile, desFile);

	}

	public void fecharNavegador() {
		driver.quit();

	}

}
