package br.edu.iftm.boletim;

import java.util.ArrayList;

public class Boletim {
	
	private String nomeDoAluno = "";
	private String nomeDaDisciplina = "";
	private ArrayList<Prova> provas = new ArrayList<Prova>();
	public String getNomeDoAluno() {
		return nomeDoAluno;
	}
	public void setNomeDoAluno(String nomeDoAluno) {
		if(nomeDoAluno != null)
		{
			this.nomeDoAluno = nomeDoAluno;
		}
	}
	public String getNomeDaDisciplina() {
		return nomeDaDisciplina;
	}
	
	
	public void setNomeDaDisciplina(String nomeDaDisciplina) {
		if(nomeDaDisciplina != null)
		{
			this.nomeDaDisciplina = nomeDaDisciplina;
		}
	}
	public ArrayList<Prova> getProvas() {
		return (ArrayList<Prova>)provas.clone();
	}

	public void adicionaProva(Prova prova)
	{
		double totalDasProvas = somaDasProvas();
		
		if((totalDasProvas + prova.getNota_max()) <= 100)
		{
			provas.add(prova);
		}
		
	}
	
	private double somaDasProvas() {
		double totalDasProvas = 0.0;
		
		/*for(int i = 0; i<provas.size();i++)
		{
			Prova p = provas.get(i);//provas[i]
			totalDasProvas += p.getNota_max();
		}*/
		
		
		for(Prova p : provas)
		{
			totalDasProvas += p.getNota_max();
		}
		return totalDasProvas;
	}
	
	public double getNotaFinal()
	{
		if(somaDasProvas() != 100.0)
		{
			return 0;
		}
		else
		{
			double totalDasNotas = 0.0;
			for(Prova p : provas)
			{
				totalDasNotas += p.getNota_obtida();
			}
			return totalDasNotas;
		}
	}
	
	public boolean foiAprovado(){
		return getNotaFinal() >= 60.0;
	}
	
	
	

}
