package br.edu.iftm.boletim;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prova p1 = new Prova();
		p1.setNota_max(30);
		p1.setNota_obtida(20);
		
		
		Prova p2 = new Prova();
		p2.setNota_max(30);
		p2.setNota_obtida(10);
		
		Prova p3 = new Prova();
		p3.setNota_max(40);
		p3.setNota_obtida(35);
		
		Boletim boletim = new Boletim();
		boletim.adicionaProva(p1);
		boletim.adicionaProva(p2);
		boletim.adicionaProva(p3);
		
		System.out.println("Nota final: " + boletim.getNotaFinal());
		if(boletim.foiAprovado())
		{
			System.out.println("Aluno Aprovado!!!!");
		}
		else
		{
			System.out.println("Foi quase!!!");
		}
		
		
	}

}
