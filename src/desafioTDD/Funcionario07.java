package desafioTDD;

public abstract class Funcionario07 {
	private String nome;
	private int idade;
	private double salario;

	public Funcionario07(String nome, int idade, double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	public double bonificacao() {
		return salario + 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
