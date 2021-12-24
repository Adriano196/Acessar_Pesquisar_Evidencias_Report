#Author: com.adr196@


@Executa
Feature:  Acessar Magazineluiza
          Eu como usuario quero acessar o site Magazine para Realizar busca;
          
  Background: Acessar site MagazineLuiza
  Given que eu acesse o site "https://www.magazineluiza.com.br"
    

 @Executa1
  Scenario: Acessar site Magazineluiza 
 
    When  realizar busca de <produto1>
    Then  vou validar informacao <plint>

   Examples:
       | produto1 |      plint      |
       | "caneta" | "validar caneta"|
       | "lapis"  | "validar lapis" |