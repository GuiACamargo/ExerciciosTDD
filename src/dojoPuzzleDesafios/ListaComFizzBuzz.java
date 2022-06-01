package dojoPuzzleDesafios;

import java.util.List;

public class ListaComFizzBuzz {
	private List<String> numerosComFizzBuzz;
	private int numMax = 100;

	public ListaComFizzBuzz(List<String> numerosComFizzBuzz) {
		this.numerosComFizzBuzz = numerosComFizzBuzz;
	}

	public List<String> getNumerosComFizzBuzz() {
		return numerosComFizzBuzz;
	}

	public void setNumerosComFizzBuzz(List<String> numerosComFizzBuzz) {
		this.numerosComFizzBuzz = numerosComFizzBuzz;
	}
	
	public int getNumMax() {
		return numMax;
	}

	public void setNumMax(int numMax) {
		this.numMax = numMax;
	}
	
	public void listaFizzBuzz() {
		for (int i = 0; i <= getNumMax(); i++) {
			getNumerosComFizzBuzz().add("\n" + i);
		}
	}
}