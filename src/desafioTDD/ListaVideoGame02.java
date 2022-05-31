package desafioTDD;

import java.util.List;

public class ListaVideoGame02 {
	private List<VideoGame02> videoGames;
	private Boolean checkTemVideoGame;

	public List<VideoGame02> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame02> videoGames) {
		this.videoGames = videoGames;
	}
	
	public Boolean getCheckTemVideoGame() {
		return checkTemVideoGame;
	}

	public void setCheckTemVideoGame(Boolean checkTemVideoGame) {
		this.checkTemVideoGame = checkTemVideoGame;
	}

	public void fazListaVideoGames() {
		if (getVideoGames().size() != 0) {
			for(int i = 0; i < getVideoGames().size(); i++) {
				if (getVideoGames().size() != 0) {
					System.out.println("Video-game: " + getVideoGames().get(i).getNome() + " " + getVideoGames().get(i).getModelo() + ", preco: " + getVideoGames().get(i).getPreco() + ", quantidade: " + getVideoGames().get(i).getQtd() + " em estoque.");
					setCheckTemVideoGame(true);
				} 
			}
		} else {
			System.out.println("A loja nao tem consoles em seu estoque");
			setCheckTemVideoGame(false);
		}
	}
}