package desafioTDD;

import java.util.*;

public class Mago03 extends Personagem03 {
	
	public Mago03(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);

	}

	private List<String> magia = new ArrayList<String>();
	private Random random = new Random();
	private Boolean attackExecutado = false;

	@Override
	public void lvlUp() {
		setLevel(getLevel() + 1);
		setMana(getMana() + 3);
		setInteligencia(getInteligencia() + 3);
	}
	
	public void aprenderMagia(String Magia) {
		magia.add(Magia);
		System.out.println("Magia " + Magia + " aprendida!");
		System.out.println("Suas magias agora sao: " + magia);
	}

	public List<String> getMagia() {
		return magia;
	}

	public String Magias(int index) {
		return magia.get(index);
	}
	
	public Boolean getAttackExecutado() {
		return attackExecutado;
	}

	public void setAttackExecutado(Boolean attackExecutado) {
		this.attackExecutado = attackExecutado;
	}

	@Override
	public void attack() {
		int dano = (getInteligencia() * getLevel()) + random.nextInt(300);
		System.out.println("Voce como mago efetuou: " + dano + " de dano!");
		setAttackExecutado(true);
	}

}
