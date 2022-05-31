package desafioTDDTest;

import java.util.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import desafioTDD.ListaVideoGame02;
import desafioTDD.VideoGame02;

class ListaVideoGame02Test {
	VideoGame02 ps4;
	VideoGame02 ps4Usado; 
	ListaVideoGame02 listaGames;
	List<VideoGame02> games;
	
	@BeforeEach
	void setUp() throws Exception {
		listaGames = new ListaVideoGame02();
		ps4Usado = new VideoGame02("PS4", 1000, 7, "Sony", "Slim", true);
		ps4 = new VideoGame02("PS4", 1800, 100, "Sony", "Slim", false);
		games = new ArrayList<>();
		listaGames.setVideoGames(games);
	}
	
	@Test
	void deveListarOsVideoGamesEApresentarTruePoisTem() throws Exception {
		games.add(ps4);
		games.add(ps4Usado);
		listaGames.fazListaVideoGames();
		Assertions.assertEquals(true, listaGames.getCheckTemVideoGame());
	}
	
	@Test
	void naoDeveListarOsVideoGamesEApresentarFalsePoisNaoTem() throws Exception {
		listaGames.fazListaVideoGames();
		Assertions.assertEquals(false, listaGames.getCheckTemVideoGame());
	}
}
