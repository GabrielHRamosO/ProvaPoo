package br.comProvaPoo1.gabriel.model;

import java.util.Scanner;

//Classe do programa principal
public class Main {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		/*Cria��o de objetos de cada uma das classes, assim como o preenchimento 
		de alguns destes objetos*/
		
		//Cria��o de 2 Pessoas (uma sem dados e a outra com dados preenchidos)
		Pessoa p = new Pessoa();
		Pessoa p1 = new Pessoa("Gabriel", "Henrique");
		
		//Cria��o de 3 Funcion�rios(dois sem dados e um com dados preenchidos)
		Funcionario f = new Funcionario();
		Funcionario f1 = new Funcionario("Murillo", "de Oliveira Goncalves Germano");
		Funcionario f2 = new Funcionario();
		
		
		//Cria��o de 3 Professores(dois sem dados e o outro com dados preenchidos)
		Professor pr = new Professor();
		Professor pr1 = new Professor("Sheiquellann", "Sheron");
		Professor pr2 = new Professor();
		
		
		//Usando m�todo setNome para settar nome aos objetos criados das classes
		// Pessoa, Funcionario e Professor
		p.setNome("Rommel"); p.setSobrenome("Shelldonn");
		
		f.setNome("Marcello"); f.setSobrenome("Germano");
		
		pr.setNome("Carlos"); pr.setSobrenome("Eduardo");
		
		
		//Usando m�todo setMatricula e setSalario para os objetos da classe Funcionario
		f.setMatricula(10); f.setSalario(1000.00);
		
		f1.setMatricula(20); f1.setSalario(2000.00);
		
		//Usando m�todo setMatricula e setSalario para os objetos da classe Professor
		pr.setMatricula(30); pr.setSalario(3000.00);
		
		pr1.setMatricula(40); pr1.setSalario(4000.00);
		
// -----------------------------------------------------------------------------------------------------
//-----------------TESTANDO AS FUNCIONALIDADES DO SISTEMA----------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------		
		
//Imprimindo o nome das pessoas criadas(a primeira pessoa/funcionario/professor com os metodos 
//getNome e getSobrenome,
//a segunda com o m�todo getNomeCompleto)
		
		
// Imprimindo o nome e sobrenome do objeto criado na classe Pessoa,
//Imprimindo o nome completo do 2� objeto criado na classe Pessoa	
		System.out.println("Nomes objetos p e p1: ");
		System.out.println(p.getNome() + " " + p.getSobrenome());
		System.out.println(p1.getNomeCompleto());
		System.out.println();
		
// Imprimindo o nome e sobrenome do objeto criado na classe Funcion�rio,
//Imprimindo o nome completo do 2� objeto criado na classe Funcion�rio	
		System.out.println("Nomes objetos f e f1: ");
		System.out.println(f.getNome() + " " + f.getSobrenome());
		System.out.println(f1.getNomeCompleto());
		System.out.println();

// Imprimindo o nome e sobrenome do objeto criado na classe Professor,
//Imprimindo o nome completo do 2� objeto criado na classe Professor
		System.out.println("Nomes objetos pr e pr1: ");
		System.out.println(pr.getNome() + " " + pr.getSobrenome());
		System.out.println(pr1.getNomeCompleto());
		System.out.println();
		
//--------------------------------------------------------------------------------------------------		
		
		
//Imprimindo com o m�todo getMatricula, as matriculas do objeto "f1" da classe Funcion�rio
//Imprimindo com o m�todo getMatr�cula, a matricula do objeto "pr1" da classe Professor
		System.out.println("Matriculas f1 e pr1:");
		System.out.println(f1.getMatricula());
		System.out.println(pr1.getMatricula());
		System.out.println();
		
//Imprimindo com o m�todo getSalario, o sal�rio total do objeto "f" da classe Funcion�rio, 	
//em seguida imprimindo o valor que ser� recebido na primeira parcela com o m�todo getPrimeiraParcela
//e depois a segunda parcela com o m�todo getSegundaParcela	
		System.out.println("Salario total do objeto f, em seguida valor da primeira e segunda parcela:");
		System.out.println(f.getSalario());
		System.out.println(f.getSalarioPrimeiraParcela());
		System.out.println(f.getSalarioSegundaParcela());
		System.out.println();
		
//Imprimindo com o m�todo getSalario, o sal�rio total do objeto "pr" da classe Professor, 
//Imprimindo qual ser� o valor da primeira parcela e da segunda parcela		
		System.out.println("Salario total do objeto pr, em seguida valor da primeira e segunda parcela");
		System.out.println(pr.getSalario());
		System.out.println(pr.getSalarioPrimeiraParcela());
		System.out.println(pr.getSalarioSegundaParcela());
		System.out.println();
//-----------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------
//----------------   TESTANDO METODO VIA TERMINAL: PROFESSOR  -----------------------------	
//-----------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------
		
		// Entrada de Dados de um Professor via terminal
		System.out.println();
		System.out.println();
		System.out.println("Entre com os dados de um Professor...");
		System.out.print("Informe o nome do Professor: ");
		pr2.nome = input.next();
		System.out.print("Informe o sobrenome do Professor: ");
		pr2.sobrenome = input.next();
		System.out.print("Informe a matricula: ");
		pr2.matricula = input.nextInt();
		System.out.print("Informe o Sal�rio: ");
		pr2.salario = input.nextDouble();
		pr2.setSalario(pr2.salario);
		System.out.println();
		System.out.println();
		
		//Sa�da de Dados via do Professor via Terminal
		System.out.println("Professor: "+ pr2.getNomeCompleto());
		System.out.println("Matr�cula: "+ pr2.getMatricula());
		System.out.println("Sal�rio: "+ pr2.getSalario());
		System.out.println("Primeira Parcela: "+pr2.getSalarioPrimeiraParcela());
		System.out.println("Segunda Parcela: "+pr2.getSalarioSegundaParcela());
		System.out.println();
		System.out.println();
//-----------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------
//----------------   TESTANDO METODO VIA TERMINAL: FUINCIONARIO  --------------------------
//-----------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------		
		
		// Entrada de Dados de um Funcionario via terminal
				System.out.println();
				System.out.println();
				System.out.println("Entre com os dados de um Funcionario...");
				System.out.print("Informe o nome do Funcionario: ");
				f2.nome = input.next();
				System.out.print("Informe o sobrenome do Funcionario: ");
				f2.sobrenome = input.next();
				System.out.print("Informe a matricula: ");
				f2.matricula = input.nextInt();
				System.out.print("Informe o Sal�rio: ");
				f2.salario = input.nextDouble();
				f2.setSalario(f2.salario);
				System.out.println();
				System.out.println();
				
				//Sa�da de Dados via do Funcionario via Terminal
				System.out.println("Funcionario: "+ f2.getNomeCompleto());
				System.out.println("Matr�cula: "+ f2.getMatricula());
				System.out.println("Sal�rio: "+ f2.getSalario());
				System.out.println("Primeira Parcela: "+f2.getSalarioPrimeiraParcela());
				System.out.println("Segunda Parcela: "+f2.getSalarioSegundaParcela());
		
	}

}
