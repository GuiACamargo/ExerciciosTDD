package desafioTDD;

public class Main01 {
	public static void main(String[] args) {
		
		Veiculo01 v1 = new Veiculo01();
		
		System.out.println("VELOCIDADE --------------");
		v1.setVelocidade(20);
		v1.acelerar();
		System.out.println("Velocidade do veiculo apos acelerar: " + v1.getVelocidade());
		
		System.out.println("ABASTECER --------------");
		v1.setLitrosCombustivel(42);
		v1.abastecer(22);
		System.out.println("Nivel de combustivel apos abastecer: " + v1.getLitrosCombustivel());
		
		System.out.println("FREAR --------------");
		v1.setVelocidade(50);
		v1.frear();
		System.out.println("Velocidade apos frear: " + v1.getVelocidade());
		
		System.out.println("PINTAR --------------");
		v1.setCor("Roxo");
		v1.pintar("Verde");
		System.out.println("Cor apos pintura: " + v1.getCor());
		
		System.out.println("LIGAR --------------");
		v1.setLigado(false);
		v1.ligar();
		System.out.println("Estado do veiculo apos comando de ligar(False = Desligado, True = Ligado): " + v1.isLigado());
		
		System.out.println("DESLIGAR --------------");
		v1.setLigado(true);
		v1.desligar();
		System.out.println("Estado do veiculo apos comando de desligar (False = Desligado, True = Ligado): " + v1.isLigado());

	}

}