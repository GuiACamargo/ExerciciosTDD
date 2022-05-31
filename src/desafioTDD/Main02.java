package desafioTDD;

import java.util.*;

public class Main02 {

	public static void main(String[] args) {
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
	}

}
