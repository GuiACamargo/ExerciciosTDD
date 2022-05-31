package desafioTDDTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import desafioTDD.Veiculo01;

class Veiculo01Test {
	
	private Veiculo01 veiculo;
	
	@BeforeEach
	void setUp() throws Exception {
		veiculo = new Veiculo01();
	}

	@Test
	void deveAcelerarVeiculoCorretamente() throws Exception {
		veiculo.setVelocidade(20);
		veiculo.acelerar();
		Assertions.assertEquals(40, veiculo.getVelocidade());
	}
	
	@Test
	void deveAcelerarVeiculoComVelocidadeNegativa() throws Exception {
		veiculo.setVelocidade(-10);
		veiculo.acelerar();
		Assertions.assertEquals(10, veiculo.getVelocidade());
	}
	
	@Test
	void deveAbastecerVeiculo() throws Exception {
		veiculo.setLitrosCombustivel(39);
		veiculo.abastecer(20);
		Assertions.assertEquals(59, veiculo.getLitrosCombustivel());
	}
	
	@Test
	void deveAbastecerSemPassarDoLimiteDe60Litros() throws Exception {
		veiculo.setLitrosCombustivel(50);
		veiculo.abastecer(15);
		Assertions.assertEquals(60, veiculo.getLitrosCombustivel());
	}
	
	@Test
	void deveNaoAbastecerPorJaEstarNoLimiteDe60Litros() throws Exception {
		veiculo.setLitrosCombustivel(60);
		veiculo.abastecer(1);
		Assertions.assertEquals(60, veiculo.getLitrosCombustivel());
	}
	
	@Test
	void deveFrearVeiculo() throws Exception {
		veiculo.setVelocidade(30);
		veiculo.frear();
		Assertions.assertEquals(10, veiculo.getVelocidade());
	}
	
	@Test
	void deveFrearSemFicarVelocidadeAbaixoDe0() throws Exception {
		veiculo.setVelocidade(10);
		veiculo.frear();
		Assertions.assertEquals(0, veiculo.getVelocidade());
	}
	
	@Test
	void deveNaoFrearPorJaEstarComVelocidade0() throws Exception {
		veiculo.setVelocidade(0);
		veiculo.frear();
		Assertions.assertEquals(0, veiculo.getVelocidade());
	}
	
	@Test
	void devePintarVeiculo() throws Exception {
		veiculo.setCor("Verde");
		veiculo.pintar("Azul");
		Assertions.assertEquals("Azul", veiculo.getCor());
	}
	
	@Test
	void deveLigarVeiculoDesligado() throws Exception {
		veiculo.setLigado(false);
		veiculo.ligar();
		Assertions.assertEquals(true, veiculo.isLigado());
	}
	
	@Test
	void deveNaoLigarCarroJaLigado() throws Exception {
		veiculo.setLigado(true);
		veiculo.ligar();
		Assertions.assertEquals(true, veiculo.isLigado());
	}
	
	@Test
	void deveDesligarCarroLigadoEVelocidadeZero() throws Exception {
		veiculo.setLigado(true);
		veiculo.desligar();
		Assertions.assertEquals(false, veiculo.isLigado());
	}
	
	@Test
	void deveNaoDesligarCarroJaDesligado() throws Exception {
		veiculo.setLigado(false);
		veiculo.desligar();
		Assertions.assertEquals(false, veiculo.isLigado());
	}
	
	@Test
	void deveNaoDesligarCarroComVelocidadeMaiorQue0() throws Exception {
		veiculo.setVelocidade(20);
		veiculo.setLigado(true);
		veiculo.desligar();
		Assertions.assertEquals(true, veiculo.isLigado());
	}

}
