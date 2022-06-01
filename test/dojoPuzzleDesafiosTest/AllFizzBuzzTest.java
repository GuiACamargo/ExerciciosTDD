package dojoPuzzleDesafiosTest;

import java.util.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dojoPuzzleDesafios.FizzBuzz;
import dojoPuzzleDesafios.ListaComFizzBuzz;

//FIZZ BUZZ
	//Neste problema, você deverá exibir uma lista de 1 a 100, um em cada linha, com as seguintes exceções:

	//	Números divisíveis por 3 deve aparecer como 'Fizz' ao invés do número;
	//Números divisíveis por 5 devem aparecer como 'Buzz' ao invés do número;
	//Números divisíveis por 3 e 5 devem aparecer como 'FizzBuzz' ao invés do número'.

class AllFizzBuzzTest {
	
	private List<String> listaStrings;
	private List<Integer> listaNumeros;
	FizzBuzz fizzbuzz;
	ListaComFizzBuzz fizzbuzzNumMax;
	
	@BeforeEach
	void setUp() throws Exception {
		fizzbuzz = new FizzBuzz();
		listaStrings = new ArrayList<String>();
		listaNumeros = new ArrayList<Integer>();
		fizzbuzzNumMax = new ListaComFizzBuzz(null);
	}
	
	@Test
	void deveFazerAListaDeNElementosPedidos() throws Exception {
		fizzbuzz.fazListaCompleta();
		Assertions.assertEquals(fizzbuzzNumMax.getNumMax(), fizzbuzz.getNumeros().size());
	}
	
	@Test
	void deveCasoSejaDivisivelPor3e5TransformarONumeroEmFizzBuzz() throws Exception {
		listaStrings.add("\n" + 0);
		listaNumeros.add(15);
		fizzbuzz.substituicoesFizzBuzz(listaStrings, 0, listaNumeros);
		Assertions.assertEquals("\nFizzBuzz", listaStrings.get(0));
	}
	
	@Test
	void deveCasoSejaDivisivelPor5TransformarONumeroEmBuzz() throws Exception {
		listaStrings.add("\n" + 0);
		listaNumeros.add(10);
		fizzbuzz.substituicoesFizzBuzz(listaStrings, 0, listaNumeros);
		Assertions.assertEquals("\nBuzz", listaStrings.get(0));
	}
	
	@Test
	void deveCasoSejaDivisivelPor3TransformarONumeroEmFizz() throws Exception {
		listaStrings.add("\n" + 0);
		listaNumeros.add(9);
		fizzbuzz.substituicoesFizzBuzz(listaStrings, 0, listaNumeros);
		Assertions.assertEquals("\nFizz", listaStrings.get(0));
	}
}
