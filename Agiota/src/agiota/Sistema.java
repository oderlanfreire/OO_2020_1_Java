package agiota;

import java.util.Collections;
import java.util.ArrayList;

public class Sistema {
	public ArrayList<Cliente> clientes;
	public ArrayList<Transacao> transacoes;
	public int saldo;
	public int nextTrId;
	
	public Sistema(int saldo) {
		this.saldo = saldo;
		clientes = new ArrayList<>();
		transacoes = new ArrayList<>();
		this.nextTrId = 0;
	}
	
	
	
	public void addClientes(String codenome, String fullname) {
		Cliente cliente = getCliente(codenome);
		if(cliente == null) {
			clientes.add(new Cliente(codenome, fullname));
		}
		Collections.sort(clientes);
		
	}
	
	Cliente getCliente(String codenome) {
		for(Cliente cliente : clientes) {
			if(cliente.codenome.contentEquals(codenome)) {
				return cliente;
			}
		}
		return null;
	}
	
	public boolean emprestar(String codenome, int valor) {
		Cliente cliente = getCliente(codenome);
		if(cliente == null) {
			return false;
		}
		if(this.saldo < valor) {
			System.out.println("Impossivel emprestar esse valor");
			return false;
		}
		if(this.saldo >= valor) 
			cliente.creditar(valor);
			transacoes.add(new Transacao(this.nextTrId, codenome, valor));
			this.saldo -= valor;
			nextTrId++;
			return true;
		
	}
	
	public boolean receber(String codenome, int valor) {
		Cliente cliente = getCliente(codenome);
		if(cliente == null) {
			return false;
		}
		if(this.saldo <= valor)
			cliente.debitar(valor);
			transacoes.add(new Transacao(this.nextTrId, codenome, -valor));
			this.saldo += valor;
			nextTrId++;
			return true;
	}
	
	public boolean matar(String codenome) {
		if(clientes == null) {
			return false;
		}
		
		for(int i = 0; i < clientes.size(); i++) {
			if(clientes.get(i).codenome.equals(codenome)) {
				clientes.remove(i);
				break;
			}
		}
		int i = 0;
		while(i < clientes.size()) {
			if(transacoes.get(i).codenome.equals(codenome)) {
				transacoes.remove(i);
			}else {
				i++;
			}
		}
		return true;
	}

	public String getHistorico() {
		String saida = "";
		for(Transacao TR : transacoes) {
			saida += TR + "\n";
		}
		return saida;
	}
	
	public String toString() {
		return getHistorico();
	}
}
