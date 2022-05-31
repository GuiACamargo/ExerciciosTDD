package desafioTDD;

public class Vendedor07 extends Funcionario07 {

	public Vendedor07(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}
	
	@Override
	public double bonificacao() {
		setSalario(getSalario() + 3000.00);
		return getSalario();
	}

}
