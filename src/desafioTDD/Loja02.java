package desafioTDD;

import java.util.*;

public class Loja02 {
	private String nome;
	private String cnpj;
	private Listas02 listas = new Listas02(new ListaLivros02(), new ListaVideoGame02());

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public List<Livro02> getLivros() {
		return listas.getListaLivros().getLivros();
	}
	public void setLivros(List<Livro02> livros) {
		this.listas.getListaLivros().setLivros(livros);
	}
	public List<VideoGame02> getVideoGames() {
		return listas.getListaGames().getVideoGames();
	}
	public void setVideoGames(List<VideoGame02> videoGames) {
		this.listas.getListaGames().setVideoGames(videoGames);
	}
	
	public Loja02(String nome, String cnpj, List<Livro02> livros, List<VideoGame02> videoGames) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.listas.getListaLivros().setLivros(livros);
		this.listas.getListaGames().setVideoGames(videoGames);
	}
	
	public void listaLivros() {
		System.out.println("A loja Casas Bahia possui estes livros para venda:");
		listas.getListaLivros().fazListaLivros();
	}
	
	public void listaVideoGames() {
		System.out.println("A loja Casas Bahia possui estes video-games para venda:");
		listas.getListaGames().fazListaVideoGames();
	}
	
	public double calculaPatrimonio() {
		return listas.calculaPatrimonio();
	}
}
