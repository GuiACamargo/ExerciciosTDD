package desafioTDD;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Boolean run = true;
		
		while (run) {
			Scanner sc = new Scanner(System.in);
			System.out.println("\n(O exercicio aparecera acima dessa mensagem) Digite o correspondente numero do exercicio que deseja acessar:\n[1] Exercicio 01\n[2] Exercicio 02\n[3] Exercicio 03\n[7] Exercicio 07\n[0] Sair\nSua escolha:");
			try {
				int numero = sc.nextInt();
				
				if (numero == 1) {
					
					System.out.println("\nExercicio 1 selecionado, criando veiculo\n");
					
					Veiculo01 v1 = new Veiculo01();
					
					System.out.println("VELOCIDADE --------------");
					v1.setVelocidade(20);
					System.out.println("Velocidade do veiculo antes de acelerar: " + v1.getVelocidade());
					v1.acelerar();
					System.out.println("Velocidade do veiculo apos acelerar: " + v1.getVelocidade());
					
					System.out.println("\nABASTECER --------------");
					v1.setLitrosCombustivel(42);
					System.out.println("Nivel de combustivel antes de abastecer: " + v1.getLitrosCombustivel());
					v1.abastecer(22);
					System.out.println("Nivel de combustivel apos abastecer: " + v1.getLitrosCombustivel());
					
					System.out.println("\nFREAR --------------");
					v1.setVelocidade(50);
					System.out.println("Velocidade antes de frear: " + v1.getVelocidade());
					v1.frear();
					System.out.println("Velocidade apos frear: " + v1.getVelocidade());
					
					System.out.println("\nPINTAR --------------");
					v1.setCor("Roxo");
					System.out.println("Cor antes da pintura: " + v1.getCor());
					v1.pintar("Verde");
					System.out.println("Cor apos pintura: " + v1.getCor());
					
					System.out.println("\nLIGAR --------------");
					v1.setLigado(false);
					System.out.println("Estado do veiculo antes do comando de ligar(False = Desligado, True = Ligado): " + v1.isLigado());
					v1.ligar();
					System.out.println("Estado do veiculo apos o comando de ligar(False = Desligado, True = Ligado): " + v1.isLigado());
					
					System.out.println("\nDESLIGAR --------------");
					v1.setLigado(true);
					System.out.println("Estado do veiculo antes de comando de desligar (False = Desligado, True = Ligado): " + v1.isLigado());
					v1.desligar();
					System.out.println("Estado do veiculo apos o comando de desligar e estar com velocidade acima de 0 (False = Desligado, True = Ligado): " + v1.isLigado());
					v1.setVelocidade(0);
					v1.desligar();
					System.out.println("Estado do veiculo apos o comando de desligar e estar parado(False = Desligado, True = Ligado): " + v1.isLigado());
					
				} else if (numero == 2) {
					
					System.out.println("\nExercicio 2 selecionado, criando loja\n");
					
					Livro02 l1 = new Livro02("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300);
					Livro02 l2 = new Livro02("Senhor dos Aneis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
					Livro02 l3 = new Livro02("Java POO", 20, 50, "GFT", "educativo", 500);
		
					VideoGame02 ps4 = new VideoGame02("PS4", 1800, 100, "Sony", "Slim", false);
					VideoGame02 ps4Usado = new VideoGame02("PS4", 1000, 7, "Sony", "Slim", true);
					VideoGame02 xbox = new VideoGame02("XBOX", 1500, 500, "Microsoft", "One", false);
					
					List<Livro02> livros = new ArrayList<>();
					livros.add(l1);
					livros.add(l2);
					livros.add(l3);
					
					List<VideoGame02> games = new ArrayList<>();
					games.add(ps4);
					games.add(ps4Usado);
					games.add(xbox);
					
					Loja02 americanas = new Loja02("Americanas", "12345678", livros, games);
					
					l2.calculaImposto();
					l3.calculaImposto();
					
					System.out.println("------------------------------------------------------");
					
					ps4Usado.calculaImposto();
					ps4.calculaImposto();
					
					System.out.println("------------------------------------------------------");
					
					americanas.listaLivros();
					System.out.println("------------------------------------------------------");
					americanas.listaVideoGames();
					System.out.println("------------------------------------------------------");
					System.out.println("O patrimonio da loja: " + americanas.getNome() + " e de R$" + americanas.calculaPatrimonio());
				
				} else if (numero == 3) {
					
					System.out.println("\nExercicio 3 selecionado, criando personagems\n");
					
					Mago03 m1 = new Mago03("Josevaldo", 100, 50, 20, 30, 5, 5);
					System.out.println(m1.getNome() + " Nivel: " + m1.getLevel() + ", Mana: " + m1.getMana() + ", Inteligencia: " + m1.getInteligencia());
					m1.lvlUp();
					System.out.println(m1.getNome() + " upou! Novo Nivel: " + m1.getLevel() + ", nova Mana: " + m1.getMana() + ", nova Inteligencia: " + m1.getInteligencia());
					m1.attack();
					
					Guerreiro03 g1 = new Guerreiro03("Pedro", 150, 10, 25, 5, 30, 5);
					System.out.println("\n" + g1.getNome() + " Nivel: " + g1.getLevel() + ", Vida: " + g1.getVida() + ", Forca: " + g1.getForca());
					g1.lvlUp();
					System.out.println(g1.getNome() + " upou! Novo Nivel: " + g1.getLevel() + ", nova Vida: " + g1.getVida() + ", nova Forca: " + g1.getForca());
					g1.attack();
		
					System.out.println("\nNumero existente de personagens: " + Personagem03.getpInstancias());
					
				} else if (numero == 7) {
					
					System.out.println("\nExercicio 7 selecionado, analisando salarios\n");
					
					Gerente07 g1 = new Gerente07("Fabricio", 34, 7500.00);
					Supervisor07 s1 = new Supervisor07("Geraldo", 31, 4500.00);
					Vendedor07 v1 = new Vendedor07("Leonardo", 27, 3600.00);
					
					System.out.println("Salario de Fabricio (Gerente) ANTES do aumento: " + g1.getSalario());
					System.out.println("Salario de Fabricio (Gerente) APOS o aumento: " + g1.bonificacao());
					
					System.out.println("\nSalario de Geraldo (Supervisor) ANTES do aumento: " + s1.getSalario());
					System.out.println("Salario de Geraldo (Supervisor) APOS o aumento: " + s1.bonificacao());
					
					System.out.println("\nSalario de Leonardo (Vendedor) ANTES do aumento: " + v1.getSalario());
					System.out.println("Salario de Leonardo (Vendedor) APOS o aumento: " + v1.bonificacao());
					
				} else if (numero == 0){
					System.out.println("Saindo!");
					run = false;
					sc.close();
				} else {
					System.out.println("Digite um numero valido entre as opcoes");
				}
			} catch(InputMismatchException erro) {
				System.out.println("Digite um numero valido entre as opcoes\nComece o programa denovo!");
			}
		}
	}

}
