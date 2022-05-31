package desafioTDD;

public class Main03 {

	public static void main(String[] args) {
			
		Mago03 m1 = new Mago03("Josevaldo", 100, 50, 20, 30, 5, 5);
		m1.lvlUp();
		System.out.println(m1.getNome() + " upou! Novo Nivel: " + m1.getLevel() + ", nova Mana: " + m1.getMana() + ", nova Inteligencia: " + m1.getInteligencia());
		m1.attack();
		
		Guerreiro03 g1 = new Guerreiro03("Pedro", 150, 10, 25, 5, 30, 5);
		g1.lvlUp();
		System.out.println(g1.getNome() + " upou! Novo Nivel: " + g1.getLevel() + ", nova Vida: " + g1.getVida() + ", nova Forca: " + g1.getForca());
		g1.attack();

		System.out.println("Numero existente de personagens: " + Personagem03.getpInstancias());
	}

}
