package agiota;

public class Transacao {
	public int id;
	public String codenome;
	public int valor;
	
	public Transacao(int id, String codenome, int valor) {
		this.id = id;
		this.codenome = codenome;
		this.valor = valor;
	}
	
	public String toString() {
		return "[" + this.id + ":" + this.codenome + ":" + this.valor + "]";
	}
}
