package desafioTDD;

import java.util.List;

public class ListaLivros02 {
	private List<Livro02> livros;
	private Boolean checkTemLivros;

	public List<Livro02> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro02> livros) {
		this.livros = livros;
	}
	
	public Boolean getCheckTemLivros() {
		return checkTemLivros;
	}

	public void setCheckTemLivros(Boolean checkTemLivros) {
		this.checkTemLivros = checkTemLivros;
	}

	public void fazListaLivros() {
		if (getLivros().size() != 0) {
			for(int i = 0; i < getLivros().size(); i++) {
				if (getLivros().size() != 0) {
					System.out.println("Titulo: " + getLivros().get(i).getNome() + ", preco: " + getLivros().get(i).getPreco() + ", quantidade: " + getLivros().get(i).getQtd() + " em estoque.");
					setCheckTemLivros(true);
				} 
			}
		} else {
			System.out.println("A loja nao tem livros em seu estoque.");
			setCheckTemLivros(false);
		}
	}
}