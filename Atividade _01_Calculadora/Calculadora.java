package calculadora;

public class Calculadora {
	int bateria;
	int maxBateria = 0;
	float display;
	
	
	public Calculadora(int maxBateria) {
		this.maxBateria = maxBateria;
		this.bateria = 0;
		this.display = 0;
	}
	
	public void carga(int carga) {
		this.bateria = this.bateria + carga;
	}
	
	//operações
	
	public boolean gastoDeBateria() {
		if(this.bateria == 0) {
			System.out.println("bateria descarregada, por favor recarregue!");
			return false;
		}else {
			this.bateria--;
			return true;
		}
	}
	public void sum(int a, int b) {
		if(gastoDeBateria()) {
			this.display = a + b;
		}
	}
	public void div(int a, int b) {
		if(!gastoDeBateria()) {
			return;
		}
		if(b != 0) {
			this.display = (float) a / b;
			
		}else {
			System.out.println("Erro, divisão por 0!");
		}
	}
	public void sub(int a, int b) {
		if(gastoDeBateria()) {
			this.display = a - b;
		}
	}
	public void mult(int a, int b) {
		if(gastoDeBateria()) {
			this.display = a * b;
		}
	}
	public void restoDiv(int a, int b) {
		if(gastoDeBateria()) {
			this.display = a % b;
		}
	}
	public void mostrar() {
		System.out.println("display = " + this.display + ", carga = " + this.bateria);
	}
}
