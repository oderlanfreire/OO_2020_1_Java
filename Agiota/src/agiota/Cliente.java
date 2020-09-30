package agiota;

class Cliente implements Comparable<Cliente>{
	public String codenome;
	public String fullName;
	private int  saldo;
	
	public Cliente(String codenome, String fullName) {
		this.codenome = codenome;
		this.fullName = fullName;
		this.saldo = 0;
	}
	
	public void debitar(int value) {
		this.saldo -= value;
	}
	
	public void creditar(int value) {
		this.saldo += value;
	}
	
	public String toString() {
		return codenome + ":" + saldo;
	}
	
	public int compareTo(Cliente other) {
		return this.codenome.compareTo(other.codenome);
	}

}
