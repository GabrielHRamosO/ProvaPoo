package br.comProvaPoo1.gabriel.model;

//Cria��o da Classe Pessoa
public class Pessoa {
	 //Atributos
	 public String nome;
	 public String sobrenome;
	 
		//M�todo getter do nome
	public String getNome() {
		return nome;
	}
	
	   //M�todo setter do nome    	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	   //M�todo getter do sobrenome
	public String getSobrenome() {
		return sobrenome;
	}
	   //M�todo setter do sobrenome
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	} 
	
	    //M�todo getter para concatenar nome com sobrenome
	public String getNomeCompleto() {
		return (this.nome + " " + this.sobrenome).toString();
	}
	
       //Construtor sem Par�metro
	public Pessoa() {
	}
	
	  //Construtor recebendo como par�metro nome e sobrenome
	public Pessoa (String nome, String sobrenome){
	   this.nome = nome;
	   this.sobrenome = sobrenome;
	}	
}

