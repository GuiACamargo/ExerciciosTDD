package desafioTDD;

import java.util.*;

public class Guerreiro03 extends Personagem03 {
	
	public Guerreiro03(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}

	private List<String> habilidades = new ArrayList<String>();
	private Random random = new Random();
	private Boolean attackExecutado = false;

	public List<String> getMagia() {
		return habilidades;
	}
	
	public String Magias(int index) {
		return habilidades.get(index);
	}

	public Boolean getAttackExecutado() {
		return attackExecutado;
	}

	public void setAttackExecutado(Boolean attackExecutado) {
		this.attackExecutado = attackExecutado;
	}
	
	@Override
	public void attack() {
		int dano = (getForca() * getLevel()) + random.nextInt(300);
		System.out.println("Voce como guerreiro efetuou: " + dano + " de dano!");
		setAttackExecutado(true);
	}	
	
	public void aprenderMagia(String Habilidade) {
		habilidades.add(Habilidade);
		System.out.println("Magia " + Habilidade + " aprendida!");
		System.out.println("Suas magias agora sao: " + habilidades);
	}

	@Override
	public void lvlUp() {
		setLevel(getLevel() + 1);
		setVida(getVida() + 3);
		setForca(getForca() + 3);
	}
	
}
