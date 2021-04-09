package br.comProvaPoo1.gabriel.model;
import java.util.Scanner;


//Criação da classe Funcionário
public class Funcionario extends Pessoa{
	
	Scanner input = new Scanner(System.in);
	//Atributos
	public int matricula;
	public double salario;
	
	//Método Getter Salario
	public double getSalario(){
		return this.salario;
	}
	
	//Método Setter Salario com While para não permitir que entre com valor negativo
	public void setSalario(double valor){
		while(valor < 0){
			System.out.println("Valor do salario nao pode ser negativo. Informe um novo valor.");
			valor = input.nextDouble();
		}
		this.salario = valor;
	}
	
	//Método Getter matricula
	public int getMatricula(){
		return this.matricula;
	}
	
	//Método Setter matricula
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	
	
	//Contrutor sem parâmetros
	public Funcionario(){
		super();
	}
	
	
	//Construtor com parâmetros
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
