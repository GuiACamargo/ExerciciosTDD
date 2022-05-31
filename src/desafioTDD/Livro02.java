package desafioTDD;

public class Livro02 extends Produto02 implements Imposto02 {

	public Livro02(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}

	private String autor;
	private String tema;
	private int qtdPag;
	private double imposto;
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getQtdPag() {
		return qtdPag;
	}
	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}
	
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	@Override
	public void calculaImposto() {
		if(getTema() == "educativo") {
			System.out.println("Livro de tema educativo nao tem imposto! (" + getNome() + ")");
		} else {
			setImposto(getPreco() * 1/10);
			System.out.println("R$" + getImposto() + " de impostos no livro! (" + getNome() + ")");
		}
	}
}
