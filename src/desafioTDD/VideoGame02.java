package desafioTDD;

public class VideoGame02 extends Produto02 implements Imposto02 {

	public VideoGame02(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	private String marca;
	private String modelo;
	private boolean isUsado;
	private double imposto;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isUsado() {
		return isUsado;
	}
	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}
		
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	@Override
	public void calculaImposto() {
		if(isUsado() == true) {
			setImposto(getPreco() * 1/4);
			System.out.println("Imposto no " + getNome() + " usado e de R$" + getImposto());
		} else {
			setImposto(getPreco() * 9/20);
			System.out.println("Imposto no " + getNome() + " nao usado e de R$" + getImposto());
		}	
	}
}
