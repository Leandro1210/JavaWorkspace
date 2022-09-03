package colaboradores;

import java.util.Date;

public class Pessoa {
	public String nome;
	public String sexo;
	public String rg;
	public Date dataNasc;
	
	public Pessoa(String nome, String sexo, String rg, Date dataNasc){
		this.nome = nome;
		this.sexo = sexo;
		this.rg = rg;
		this.dataNasc = dataNasc;
	}
	
	public Pessoa(String nome, String sexo, Date dataNasc){
		this.nome = nome;
		this.sexo = sexo;
		this.dataNasc = dataNasc;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome != null) {
			this.nome = nome;
		}
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		if(sexo != null) {
			this.sexo = sexo;
		}
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		if(rg != null) {
			this.rg = rg;
		}
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		if(dataNasc != null) {
			this.dataNasc = dataNasc;
		}
	}
	
	public String toString() {
		return "Pessoa [nome=" + this.getNome() + ", sexo=" + this.getSexo() + ", rg=" + this.getRg() + ", dataNasc=" + this.getDataNasc() + "]";
	}
}
