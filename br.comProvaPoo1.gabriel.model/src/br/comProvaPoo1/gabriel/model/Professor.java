package br.comProvaPoo1.gabriel.model;


//Criação da classe Professor
public class Professor extends Funcionario{
	
	
	//Contrutor sem parâmetros
	public Professor(){
		super();
	}
	
	
	//Construtor com parâmetros
	public Professor(String nome, String sobrenome){
		super(nome,sobrenome);
	}
	
	//Método sobrescrevendo os métodos de divisao de parcelas
	@Override
	public double getSalarioPrimeiraParcela() {
		return super.getSalario();
	}
	
	public double getSalarioSegundaParcela() {
		return 0;
	}
}
