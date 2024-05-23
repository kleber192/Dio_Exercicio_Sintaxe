package model;

public class ContaBanco {

	private String agencia;
	private int conta ;
	private String nome ;
	private double saldo ;
	
	
	
public ContaBanco() {
	
	
	this.agencia = agencia;
	this.conta = conta ;
	this.nome = nome ;
	this.saldo = saldo ;
	
	
}
	
	
public String getAgencia() {
	
	return agencia;
}


public void setAgencia(String agencia) {
	
	
	this.agencia = agencia;
}


public int getConta() {
	return conta;
}


public void setConta(int conta) {
	this.conta = conta;
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public double getSaldo() {
	return saldo;
}


public void setSaldo(double saldo) {
	this.saldo = saldo;
}


@Override
public String toString() {
	
	return "Olá "+nome+", obrigado por criar uma conta em nosso banco, "
			+ "sua agência é "+agencia+", conta "+conta+ " e seu saldo "+saldo+" ja esta disponivel na conta .";
}






}
