package br.comProvaPoo1.gabriel.model;

//Criação da Classe Pessoa
public class Pessoa {
	 //Atributos
	 public String nome;
	 public String sobrenome;
	 
		//Método getter do nome
	public String getNome() {
		return nome;
	}
	
	   //Método setter do nome    	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	   //Método getter do sobrenome
	public String getSobrenome() {
		return sobrenome;
	}
	   //Método setter do sobrenome
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	} 
	
	    //Método getter para concatenar nome com sobrenome
	public String getNomeCompleto() {
		return (this.nome + " " + this.sobrenome).toString();
	}
	
       //Construtor sem Parâmetro
	public Pessoa() {
	}
	
	  //Construtor recebendo como parâmetro nome e sobrenome
	public Pessoa (String nome, String sobrenome){
	   this.nome = nome;
	   this.sobrenome = sobrenome;
	}	
}

