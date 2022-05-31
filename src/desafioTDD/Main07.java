package desafioTDD;

public class Main07 {

	public static void main(String[] args) {
		Gerente07 g1 = new Gerente07("Fabricio", 34, 7500.00);
		Supervisor07 s1 = new Supervisor07("Geraldo", 31, 4500.00);
		Vendedor07 v1 = new Vendedor07("Leonardo", 27, 3600.00);
		
		System.out.println("Salario de Fabricio (Gerente) ANTES do aumento: " + g1.getSalario());
		System.out.println("Salario de Fabricio (Gerente) APOS o aumento: " + g1.bonificacao());
		
		System.out.println("Salario de Geraldo (Supervisor) ANTES do aumento: " + s1.getSalario());
		System.out.println("Salario de Geraldo (Supervisor) APOS o aumento: " + s1.bonificacao());
		
		System.out.println("Salario de Leonardo (Vendedor) ANTES do aumento: " + v1.getSalario());
		System.out.println("Salario de Leonardo (Vendedor) APOS o aumento: " + v1.bonificacao());

	}

}
