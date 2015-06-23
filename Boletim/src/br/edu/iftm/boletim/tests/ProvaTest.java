package br.edu.iftm.boletim.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.edu.iftm.boletim.Boletim;
import br.edu.iftm.boletim.Prova;

public class ProvaTest {


	@Test
	public void testProvaValendoMaisQueCem() {
		Prova p = new Prova();
		
		p.setNota_max(180.0);
		
		double esperado = 0.0;
		double atual = p.getNota_max();
		
		assertEquals(esperado, atual, 0.0);
		
	}
	
	@Test
	public void testNotaMaiorQueValorProva(){
		Prova p = new Prova();
		p.setNota_max(50.0);
		p.setNota_obtida(51);
		
		double esperado = 0.0;
		double atual = p.getNota_obtida();
		
		assertEquals(esperado, atual, 0.0);
	}
	
	@Test
	public void testAlunoAprovado(){
		Prova p = new Prova();
		Boletim b = new Boletim();
		p.setNota_max(100);
		p.setNota_obtida(60);
		b.adicionaProva(p);
		
		boolean esperado = true;
		boolean atual = b.foiAprovado();
		
		assertEquals(esperado, atual);
		
	}
	
	@Test
	public void testSomaNotaMaximaProva(){
		Prova p = new Prova();
		p.setNota_max(110);
		Boletim b = new Boletim();
		b.adicionaProva(p);
		
		double esperado = 0.0;
		double atual = b.getNotaFinal();
		
		assertEquals(esperado, atual, 0.0);
	}
	
	@Test
	public void testSomaNotasAluno(){
		Prova p1 = new Prova();
		p1.setNota_max(50);
		p1.setNota_obtida(20);
		Prova p2 = new Prova();
		p2.setNota_max(50);
		p2.setNota_obtida(25);
		Boletim b = new Boletim();
		b.adicionaProva(p1);
		b.adicionaProva(p2);
		
		double esperado = 45.0;
		double atual = b.getNotaFinal();
		
		assertEquals(esperado, atual, 0.0);
	}
	
	@Test
	public void testTotalProvasMenorQueCem(){
		Prova p = new Prova();
		p.setNota_max(70);
		p.setNota_obtida(55);
		Boletim b = new Boletim();
		b.adicionaProva(p);
		
		double esperado = 0.0;
		double atual = b.getNotaFinal();
		
		assertEquals(esperado, atual, 0.0);
	}

	

}