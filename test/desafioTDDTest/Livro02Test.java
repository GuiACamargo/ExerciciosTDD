package desafioTDDTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import desafioTDD.Livro02;

class Livro02Test {

	Livro02 livro;
	Livro02 livroEducativo;
	
	@BeforeEach
	void setUp() throws Exception {
		livro = new Livro02("Aventuras", 30, 40, "Roberto", "drama", 290);
		livroEducativo = new Livro02("JavaScript Introducao", 25, 60, "TecNew", "educativo", 480);
	}
	
	@Test
	void deveCalcularImpostoDeLivro() throws Exception {
		livro.calculaImposto();
		Assertions.assertEquals(3, livro.getImposto());
	}
	
	@Test
	void deveCalcularImpostoDeLivroEducacional() throws Exception {
		livroEducativo.calculaImposto();
		Assertions.assertEquals(0, livroEducativo.getImposto());
	}


}
