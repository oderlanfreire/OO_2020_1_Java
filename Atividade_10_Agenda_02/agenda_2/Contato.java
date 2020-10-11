package agenda_2;

import java.util.*;

public class Contato {
	
	public String nome;
	private ArrayList<Fone> fone;
	
	public Contato(String nome) {
		this.nome = nome;
		fone = new ArrayList<>();	
	} 
	
	public void addTelefone(String id, String numero) {
		if(Fone.validar_Numero(numero) == false) {
			System.out.println("erro: numero invalido");
		}else {
			String serial = id+":"+numero;
			fone.add(new Fone(serial));
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
			Fone fones = fone.get(i);
			saida += "[" + i + ":" + fones + "]";
		}
		return saida;
	}
}