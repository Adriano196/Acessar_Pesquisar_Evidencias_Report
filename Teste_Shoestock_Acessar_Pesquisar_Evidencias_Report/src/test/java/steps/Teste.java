package steps;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Teste {

	Actions actions;
	Metodos Met = new Metodos();
	Elementos Ele = new Elementos();

	@Given("que eu acesse o site {string}")
	public void que_eu_acesse_o_site(String site) {

		Met.acessarSite(site);

	}

	@When("realizar busca de {string}")
	public void realizar_busca_de(String texto) throws InterruptedException {
		Thread.sleep(2000);
		Met.buscarProduto(texto, Ele.getElementos());
		Thread.sleep(6000);
		Met.submit(Ele.getElementos());
		Thread.sleep(3000);
		Met.click(Ele.getElementos1());
		Thread.sleep(4000);
		Met.clickComprar(Ele.getElementos2());
	}

	@Then("vou validar informacao {string}")
	public void vou_validar_informacao(String texto) throws IOException, InterruptedException {
		Thread.sleep(5000);
		Met.screnShot(texto);
		Met.fecharNavegador();

	}

}
