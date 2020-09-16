package junkfood;

import java.util.ArrayList;

public class Machine {
	
	private float saldoCliente;
	private float lucro;
	private ArrayList <Espiral> espirais = new ArrayList<>();
	private int totalProdutos;
	
	public Machine(int numEspiral, int totalProdutos) {
		this.espirais = new ArrayList<>();
		setTotalProdutos(totalProdutos);
		for(int i  = 0; i<numEspiral; i++) {
			espirais.add(new Espiral("Empty", 0, 0));
		}
	}
	public int getTamanho() {
		return espirais.size();
	}
	
	public boolean inserirDinheiro(float value) {
		if(value <= 0) {
			System.out.println("Erro: não há como inserir 0 reais ou valor negativo");
			return false;
		}
		setSaldoCliente(value);
		System.out.println("Saldo: " + this.saldoCliente);
		return true;
	}
	
	public void pedirTroco() {
		if(this.saldoCliente > 0) 
			System.out.println("seu troco é: " + this.saldoCliente);
			 this.saldoCliente = 0;
	}
	
	public boolean vender(int i) {
		if(i < 0 || i > espirais.size()) {
			System.out.println("Erro: Indice invalido");
			return false;
		}
		if(espirais.get(i).valor > this.saldoCliente) {
			System.out.println("Dinheiro insuficiente");
			return false;
		}
		if(espirais.get(i).quantidade == 0) {
			System.out.println("Produto indisponivel");
			return false;
		}
		this.saldoCliente = this.saldoCliente - espirais.get(i).valor;
		espirais.get(i).quantidade = espirais.get(i).quantidade - 1; 
		setLucro(espirais.get(i).valor);
		System.out.println("voce comprou um " + espirais.get(i).nome);
		return true;
	}
	
	public boolean alterarEspiral(int i, String nome, int qtd, float valor) {
		if(i > espirais.size()) {
			System.out.println("Erro: impossivel inserir produto nesse lugar");
			return false;
		}
		if(qtd <= 0 || valor <= 0) {
			System.out.println("Erro: valor ou quantidade invalida");
			return false;
		}
		if(qtd > totalProdutos) {
			System.out.println("Erro: quantidade de produtos excede o limite");
		}

		espirais.set(i , new Espiral(nome, qtd, valor));
		return true;
	}

	public void Resetar(int numEspiral, int totalProdutos){
		this.espirais = new ArrayList<Espiral>();
		setTotalProdutos(totalProdutos);
		for(int i = 0; i < numEspiral; i++) {
			espirais.add(new Espiral("Empty", 0, 0));
		}
	}

	public float getSaldoCliente() {
		return saldoCliente;
	}


	public void setSaldoCliente(float saldoCliente) {
		if(this.saldoCliente > 0) {
			this.saldoCliente = this.saldoCliente + saldoCliente;
		}else {
			this.saldoCliente = saldoCliente;
		}
	}
	
	public float getLucro() {
		return lucro;
	}
	
	public void setLucro(float lucro) {
		this.lucro = lucro;
	}
	
	public int getTotalProdutos() {
		return totalProdutos;
	}
	
	public void setTotalProdutos(int totalProdutos) {
		this.totalProdutos = totalProdutos;
	}
	
	public String toString() {
		int i = 0;
		String saida = "saldo: " + this.saldoCliente + "\n";
				for(Espiral espiral : espirais) {
					saida += i + " " + espiral;
					i++;
				}
		return saida;
	}

}
