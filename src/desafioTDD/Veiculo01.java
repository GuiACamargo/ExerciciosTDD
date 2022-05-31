package desafioTDD;

public class Veiculo01 {
	
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;
	
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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void acelerar() {
		setVelocidade(getVelocidade() + 20);
	}
	
	public void abastecer(int combustivel) {
		if (getLitrosCombustivel() <= 40 && getLitrosCombustivel() + combustivel <= 60) {
			setLitrosCombustivel(getLitrosCombustivel() + combustivel);
			
		} else if (getLitrosCombustivel() + combustivel > 60) {
			setLitrosCombustivel(60);
			System.out.println("Nao foi possivel abastecer tudo pedido, pois ja chegou ao limite de 60 litros!");
			
		} else {
			System.out.println("Nao foi possivel abastecer por ja estar no limite de 60 litros!");
		}
	}
	
	public void frear() {
		if (getVelocidade() >= 20) {
			setVelocidade(getVelocidade() - 20);
		} else if (getVelocidade() < 20 && getVelocidade() > 0) {
			setVelocidade(0);
		} else {
			System.out.println("Veiculo ja esta parado!");
		}
	}
	
	public void pintar (String cor) {
		setCor(cor);
	}
	
	public void ligar() {
		if (isLigado() == false) {
			setLigado(true);
		} else {
			System.out.println("Veiculo ja esta ligado!");
		}
	}
	
	public void desligar() {
		if (isLigado() == true && getVelocidade() == 0) {
			setLigado(false);
		} else if (isLigado() == false) {
			System.out.println("Veiculo ja esta desligado!");
		} else if (getVelocidade() > 0) {
			System.out.println("Veiculo nao esta com velocidade 0!");
			setLigado(true);
		}
	}
}
