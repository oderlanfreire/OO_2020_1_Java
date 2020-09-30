package agenda;

public class Telefone {
	public String id;
	public String numero;
	
	public Telefone(String id, String numero) {
		this.id = id;
		this.numero = numero;
	}
	
	public static boolean validar_Numero(String numero) {
		String validos = "0123456789().-";
		for(int i = 0; i < numero.length(); i++) {
			char c = numero.charAt(i);
			if(validos.indexOf(c) == -1) {
				return false;
			}
		}
		return true;
	}
	
	public String toString() {
		return id + ":" + numero;
	}
}
