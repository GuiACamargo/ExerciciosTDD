package dojoPuzzleDesafios;
import java.util.*;

//FIZZ BUZZ
		//Neste problema, você deverá exibir uma lista de 1 a 100, um em cada linha, com as seguintes exceções:
	
		//	Números divisíveis por 3 deve aparecer como 'Fizz' ao invés do número;
		//Números divisíveis por 5 devem aparecer como 'Buzz' ao invés do número;
		//Números divisíveis por 3 e 5 devem aparecer como 'FizzBuzz' ao invés do número'.

public class FizzBuzz {

	private List<Integer> numeros = new ArrayList<Integer>();
	private ListaComFizzBuzz fizzbuzz = new ListaComFizzBuzz(new ArrayList<String>());

	public List<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}
		
	public void fazListaCompleta() {

		fizzbuzz.listaFizzBuzz();
		List<String> pegaLista = fizzbuzz.getNumerosComFizzBuzz();
		
		for (int i = 1; i <= fizzbuzz.getNumMax(); i++) {
			numeros.add(i);
			
			if (i == 1 && numeros.size() == 1) {
				i--;
			}
			substituicoesFizzBuzz(pegaLista, i, numeros);
		}
		
		numeros.remove(0);
		pegaLista.remove(0);
		System.out.println(pegaLista);
	}

	public void substituicoesFizzBuzz(List<String> pegaLista, int i, List<Integer> numeros) {
		
		if (numeros.get(i)%3 == 0 && numeros.get(i)%5 == 0) {
			pegaLista.remove(i);
			pegaLista.add(i, "\nFizzBuzz");
			
		} else if (numeros.get(i)%5 == 0) {
			pegaLista.remove(i);
			pegaLista.add(i, "\nBuzz");
			
		} else if (numeros.get(i)%3 == 0) {
			pegaLista.remove(i);
			pegaLista.add(i, "\nFizz");
		}
	}

}
