package agenda;

import java.util.ArrayList;

public class Contato {
	
	private String nome;
	private ArrayList<Telefone> fone;
	
	public Contato(String nome) {
		this.nome = nome;
		fone = new ArrayList<>();	
	} 
	
	public void addTelefone(String id, String numero) {
		if(Telefone.validar_Numero(numero) == false) {
			System.out.println("erro: numero invalido");
		}else {
		fone.add(new Telefone(id, numero));
		}
	}
	
	public void rmTelefone(int indice) {
		if(indice < 0 || indice >= fone.size()) {
			return;
		}
		fone.remove(indice);
	}
	
	public String getNome() {
		return nome;
	}
	
	public String toString() {
		String saida = "- " + this.nome + " ";
		if(fone.size() > 0) 
			saida += " ";
		for( int i = 0; i < fone.size(); i++) {
			Telefone fones = fone.get(i);
			saida += "[" + i + ":" + fones + "]";
		}
		return saida;
	}
}


