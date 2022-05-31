package desafioTDDTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import desafioTDD.Supervisor07;

class Supervisor07Test {
	
	Supervisor07 supervisor;

	@BeforeEach
	void setUp() throws Exception {
		supervisor = new Supervisor07("Ronaldo", 27, 5000.00);
	}
	
	@Test
	void deveAplicarBonificacaoDe5000() throws Exception {
		supervisor.bonificacao();
		Assertions.assertEquals(10000.00, supervisor.getSalario());
	}


}
