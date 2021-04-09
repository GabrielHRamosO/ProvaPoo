package br.comProvaPoo1.gabriel.model;


//Cria��o da classe Professor
public class Professor extends Funcionario{
	
	
	//Contrutor sem par�metros
	public Professor(){
		super();
	}
	
	
	//Construtor com par�metros
	public Professor(String nome, String sobrenome){
		super(nome,sobrenome);
	}
	
	//M�todo sobrescrevendo os m�todos de divisao de parcelas
	@Override
	public double getSalarioPrimeiraParcela() {
		return super.getSalario();
	}
	
	public double getSalarioSegundaParcela() {
		return 0;
	}
}
