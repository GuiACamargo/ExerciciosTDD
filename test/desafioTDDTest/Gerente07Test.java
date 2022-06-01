package desafioTDDTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import desafioTDD.Gerente07;

class Gerente07Test {
	
	Gerente07 gerente;

	@BeforeEach
	void setUp() throws Exception {
		gerente = new Gerente07("Fabricio", 38, 8000.00);
	}
	
	@Test
	void deveAplicarBonificaçãoDe10000() throws Exception {
		gerente.bonificacao();
		Assertions.assertEquals(18000.00, gerente.getSalario());
	}

}
