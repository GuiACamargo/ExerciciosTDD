package desafioTDDTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import desafioTDD.VideoGame02;

class VideoGame02Test {

	VideoGame02 videogame;
	VideoGame02 videogameUsado;
	
	@BeforeEach
	void setUp() throws Exception {
		videogame = new VideoGame02("PS4", 1800, 100, "Sony", "Slim", false);
		videogameUsado = new VideoGame02("PS4", 1000, 7, "Sony", "Slim", true);
	}
	
	@Test
	void deveCalcularImpostoDeVideoGameNovo() throws Exception {
		videogame.calculaImposto();
		Assertions.assertEquals(810, videogame.getImposto());
	}
	
	@Test
	void deveCalcularImpostoDeVideoGameUsado() throws Exception {
		videogameUsado.calculaImposto();
		Assertions.assertEquals(250, videogameUsado.getImposto());
	}


}
