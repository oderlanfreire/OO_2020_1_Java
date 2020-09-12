package banco;

import java.util.ArrayList;

public class Conta{
	private int nextId = 0;
	private float saldo;
	private int numero;
	private ArrayList<Operacao> extrato = new ArrayList<>();
	
	public Conta(int numero) {
		this.numero = numero;
	}
	
	private void addOperacao(String label, float valor) {
		Operacao operacao = new Operacao(nextId, label, valor, saldo);
		saldo += valor;
		nextId ++;
		extrato.add(operacao);
	}
	
	public void debito(float valor) {
		if(saldo < valor) {
			System.out.println("Erro: saldo insuficiente!");
			System.out.println("Impossivel fazer a operação.");
		}else {
			addOperacao("saque", -valor);
			System.out.println("Contando dinheiro...");
			System.out.println("Saque concluido com sucesso");
		}
	}
	
	public void credito(float valor) {
		if(valor <= 0) {
			System.out.println("ERRO!");
			System.out.println("Impossivel fazer a operação.");
		}else if(valor > 0){
			addOperacao("deposito", valor);
			System.out.println("Dinheiro depositado com sucesso");
		}
	}
	
	public void tarifa(float valor) {
		if(valor < 0) {
			System.out.println("ERRO: Valor de tarifa inválido");
		}else if(valor == 0) {
			System.out.println("Tarifa zerada");
		}else {
			addOperacao("tarifa", -valor);
		}
	}
	public void estornarTarifa(int i) {
		if(i > extrato.size() || i < 0) {
			System.out.println("indice inválido");
		}else {
			Operacao op = extrato.get(i);
				if(op.descricao.contains("tarifa")) {
					op.valor = op.valor*(-1);
					addOperacao("estorno", op.valor);
				}else if (op.descricao != "tarifa"){
					System.out.println("Erro: Índice " + i + " não é tarifa");
				}
		}
	}
	
	public void extratoParcial(int n) {
		System.out.println("Extrato Parcial");
		System.out.println("---------------------------");
		for(int i = extrato.size()-1; i > extrato.size()-1 - n; i--) {
			System.out.println(extrato.get(i).indice + " " + extrato.get(i).descricao + " " + extrato.get(i).valor);
		}
	}
	
	public void mostrarExtrato() {
		System.out.println("Historico de operações de Conta: " + this.numero);
		System.out.println("--------------------------");
		for(int i = 0; i < extrato.size()-1; i++) {
			System.out.println(extrato.get(i).indice + " " + extrato.get(i).descricao + " " + extrato.get(i).valor);
		}
	}
	public void mostrarConta() {
		System.out.println("Conta: " + this.numero + " saldo: " + this.saldo);
	}
	
}
