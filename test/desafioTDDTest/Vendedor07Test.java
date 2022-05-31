package desafioTDDTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import desafioTDD.Vendedor07;

class Vendedor07Test {

	Vendedor07 vendedor;
	
	@BeforeEach
	void setUp() throws Exception {
		vendedor = new Vendedor07("Marcelo", 25, 3000.75);
	}
	
	@Test
	void deveAplicarBonificacaoDe3000() throws Exception {
		vendedor.bonificacao();
		Assertions.assertEquals(6000.75, vendedor.getSalario());
	}

}
