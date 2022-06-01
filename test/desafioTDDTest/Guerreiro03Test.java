package desafioTDDTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import desafioTDD.Guerreiro03;

class Guerreiro03Test {

	private Guerreiro03 guerreiro;
	
	@BeforeEach
	void setUp() throws Exception {
		guerreiro = new Guerreiro03("Roberto", 150, 5, 10, 5, 30, 20);
	}
	
	@Test
	void deveAumentarONivelDoGuerreiroESeusAtributosCorrespondentes() throws Exception {
		guerreiro.lvlUp();
		Assertions.assertEquals(21, guerreiro.getLevel());
		Assertions.assertEquals(153, guerreiro.getVida());
		Assertions.assertEquals(33, guerreiro.getForca());
	}
	
	@Test
	void deveAprenderHabilidade() throws Exception {
		guerreiro.aprenderMagia("Empurrão");
		Assertions.assertEquals("Empurrão", guerreiro.Magias(0));
	}
	
	@Test
	void deveConfirmarQueOAtaqueFoiExecutadoDevolvendoTrue() throws Exception {
		guerreiro.attack();
		Assertions.assertEquals(true, guerreiro.getAttackExecutado());
	}

}
