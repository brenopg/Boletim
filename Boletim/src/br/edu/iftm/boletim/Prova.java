package br.edu.iftm.boletim;

public class Prova {
	
	private String descricao = "";
	private double nota_max = 0.0;
	private double nota_obtida = 0.0;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		if(descricao != null)
		{
			this.descricao = descricao;
		}
	}
	
	
	public double getNota_max() {
		return nota_max;
	}
	public void setNota_max(double nota_max) {
		if(nota_max >= 0 && nota_max <= 100 && nota_max >= getNota_obtida())
		{
			this.nota_max = nota_max;
		}
	}
	
	public double getNota_obtida() {
		return nota_obtida;
	}
	
	public void setNota_obtida(double nota_obtida) {
		if(nota_obtida > 0 && nota_obtida <= getNota_max())
		{
			this.nota_obtida = nota_obtida;
		}
	}
	
	
	

}
