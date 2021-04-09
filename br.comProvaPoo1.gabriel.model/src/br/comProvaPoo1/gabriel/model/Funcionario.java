package br.comProvaPoo1.gabriel.model;
import java.util.Scanner;


//Cria��o da classe Funcion�rio
public class Funcionario extends Pessoa{
	
	Scanner input = new Scanner(System.in);
	//Atributos
	public int matricula;
	public double salario;
	
	//M�todo Getter Salario
	public double getSalario(){
		return this.salario;
	}
	
	//M�todo Setter Salario com While para n�o permitir que entre com valor negativo
	public void setSalario(double valor){
		while(valor < 0){
			System.out.println("Valor do salario nao pode ser negativo. Informe um novo valor.");
			valor = input.nextDouble();
		}
		this.salario = valor;
	}
	
	//M�todo Getter matricula
	public int getMatricula(){
		return this.matricula;
	}
	
	//M�todo Setter matricula
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	
	
	//Contrutor sem par�metros
	public Funcionario(){
		super();
	}
	
	
	//Construtor com par�metros
	public Funcionario(String nome, String sobrenome){
		super(nome, sobrenome);
	}
	
	
	
	public double getSalarioPrimeiraParcela() {
		return 0.6*this.salario;
	}
	
	public double getSalarioSegundaParcela() {
		return 0.4*this.salario;
	}
}
