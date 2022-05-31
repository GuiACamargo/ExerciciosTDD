package desafioTDD;

public class Supervisor07 extends Funcionario07 {

	public Supervisor07(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}
	
	@Override
	public double bonificacao() {
		setSalario(getSalario() + 5000.00);
		return getSalario();
	}

}
