package desafioTDDTest;

import java.util.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import desafioTDD.ListaLivros02;
import desafioTDD.ListaVideoGame02;
import desafioTDD.Listas02;
import desafioTDD.Livro02;
import desafioTDD.VideoGame02;

class Listas02Test {

	Listas02 listas;
	
	VideoGame02 ps4;
	VideoGame02 ps4Usado; 
	ListaVideoGame02 listaGames;
	List<VideoGame02> games;
	
	Livro02 l1;
	Livro02 l2;
	ListaLivros02 listaLivros;
	List<Livro02> livros;
	
	@BeforeEach
	void setUp() throws Exception {
		listas = new Listas02(listaLivros, listaGames);
		
		listaGames = new ListaVideoGame02();
		ps4Usado = new VideoGame02("PS4", 1000, 7, "Sony", "Slim", true);
		ps4 = new VideoGame02("PS4", 1800, 100, "Sony", "Slim", false);
		games = new ArrayList<>();
		listaGames.setVideoGames(games);
		
		listaLivros = new ListaLivros02();
		l1 = new Livro02("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300);
		l2 = new Livro02("Java POO", 20, 50, "GFT", "educativo", 500);
		livros = new ArrayList<>();
		listaLivros.setLivros(livros);
			
		listas.setListaGames(listaGames);
		listas.setListaLivros(listaLivros);
	}
	
	@Test
	void deveCalcularOPatrimonioCorretamente() throws Exception {
		games.add(ps4);
		games.add(ps4Usado);
		livros.add(l1);
		livros.add(l2);
		double total = listas.calculaPatrimonio();
		Assertions.assertEquals(190000.0, total);
	}
	
	@Test
	void deveCalcularOPatrimonioSemItensRetornando0() throws Exception {
		double total = listas.calculaPatrimonio();
		Assertions.assertEquals(0, total);
	}
	

}
