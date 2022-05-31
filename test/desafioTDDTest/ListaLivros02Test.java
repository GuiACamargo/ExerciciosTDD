package desafioTDDTest;

import java.util.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import desafioTDD.ListaLivros02;
import desafioTDD.Livro02;

class ListaLivros02Test {
	
	Livro02 l1;
	Livro02 l2;
	ListaLivros02 listaLivros;
	List<Livro02> livros;

	@BeforeEach
	void setUp() throws Exception {
		listaLivros = new ListaLivros02();
		l1 = new Livro02("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300);
		l2 = new Livro02("Java POO", 20, 50, "GFT", "educativo", 500);
		livros = new ArrayList<>();
		listaLivros.setLivros(livros);
	}
	
	@Test
	void deveListarOsLivrosEApresentarTruePoisTem() throws Exception {
		livros.add(l1);
		livros.add(l2);
		listaLivros.fazListaLivros();
		Assertions.assertEquals(true, listaLivros.getCheckTemLivros());
	}
	
	@Test
	void naoDeveListarOsLivrosEApresentarFalsePoisNaoTem() throws Exception {
		listaLivros.fazListaLivros();
		Assertions.assertEquals(false, listaLivros.getCheckTemLivros());
	}

}
