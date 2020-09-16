package junkfood;

public class Espiral {
	
	String nome;
	int quantidade;
	float valor;
	
	public Espiral(String nome, int quantidade, float valor) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	public String toString() {
		return "[ " + this.nome + ":" + this.quantidade + ":" + this.valor + " ]\n";
	}
}
