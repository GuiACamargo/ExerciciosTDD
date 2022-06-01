package desafioTDD;

public class Listas02 {
	private ListaLivros02 listaLivros;
	private ListaVideoGame02 listaGames;

	public Listas02(ListaLivros02 listaLivros, ListaVideoGame02 listaGames) {
		this.listaLivros = listaLivros;
		this.listaGames = listaGames;
	}

	public ListaLivros02 getListaLivros() {
		return listaLivros;
	}

	public void setListaLivros(ListaLivros02 listaLivros) {
		this.listaLivros = listaLivros;
	}

	public ListaVideoGame02 getListaGames() {
		return listaGames;
	}

	public void setListaGames(ListaVideoGame02 listaGames) {
		this.listaGames = listaGames;
	}
	
	public double calculaPatrimonio() {
		if (getListaGames().getVideoGames().size() != 0) {
			double multVideo = 0;
			for(int i = 0; i < getListaGames().getVideoGames().size(); i++) {
				multVideo = multVideo + (getListaGames().getVideoGames().get(i).getPreco() * getListaGames().getVideoGames().get(i).getQtd());
			}
			double multLivros = 0;
			for(int i = 0; i < getListaLivros().getLivros().size(); i++) {
				multLivros = multLivros + (getListaLivros().getLivros().get(i).getPreco() * getListaLivros().getLivros().get(i).getQtd());
			}
			double total = multVideo + multLivros;
			return total;
		} else {
			double total = 0;
			return total;
		}
	}
}