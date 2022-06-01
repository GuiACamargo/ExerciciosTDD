package desafioTDDTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import desafioTDD.Mago03;

class Mago03Test {
	
	private Mago03 mago;
	
	@BeforeEach
	void setUp() throws Exception {
		mago = new Mago03("Roberto", 100, 20, 10 , 30, 5, 25);
	}
	
	@Test
	void deveAumentarONivelDoMagoESeusAtributosCorrespondentes() throws Exception {
		mago.lvlUp();
		Assertions.assertEquals(26, mago.getLevel());
		Assertions.assertEquals(23, mago.getMana());
		Assertions.assertEquals(33, mago.getInteligencia());
	}
	
	@Test
	void deveAprenderMagia() throws Exception {
		mago.aprenderMagia("Bola de Fogo");
		Assertions.assertEquals("Bola de Fogo", mago.Magias(0));
	}
	
	@Test
	void deveConfirmarQueOAtaqueFoiExecutadoDevolvendoTrue() throws Exception {
		mago.attack();
		Assertions.assertEquals(true, mago.getAttackExecutado());
	}
	
}
