package Controller;

import java.util.Scanner;

import model.ContaBanco;

public class ControlConta {

	
	public void cadastrarConta() {
		
	Scanner scan = new Scanner(System.in);
	
	ContaBanco c = new ContaBanco();
	
	System.out.println("Sistema de cadastro de cliente !!! ");
	
	
	System.out.println("Digite o numero da agencia ");
	c.setAgencia(scan.nextLine());
	
	System.out.println("Digite o numero da conta ");
	c.setConta(Integer.parseInt(scan.nextLine()));
	
	System.out.println("Digite o nome do cliente  ");
	c.setNome(scan.nextLine());
	
	System.out.println("Digite o saldo depositado ");
	c.setSaldo(Double.parseDouble(scan.nextLine()));
	
	System.out.println(" Cliente cadastrado !!!");
	
	System.out.println(c);
		
	}
	
	
	
	
}
