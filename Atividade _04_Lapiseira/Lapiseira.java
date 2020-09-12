package lapiseira;

public class Lapiseira {
	float calibre;
	Grafite graf;
	
	public Lapiseira(float calibre) {
		this.calibre = calibre;
	}
	
	public void inserirGrafite(Grafite graf) {
		if(this.graf == null) {
			this.graf = graf;
			if(this.graf.calibre != this.calibre) {
				System.out.println("Calibre incompativel!");
				this.graf = null;
				return;
			}				
		}else {
			System.out.println("Erro: Já existe grafite.");
		}
	}
	public boolean removerGrafite() {
		if(this.graf != null) {
			this.graf = null;
			return true;
		}else {
			System.out.println("Erro: não há grafite pra remover.");
			return false;
		}
	}
	public void escrever(int escreve) {
		if(this.graf == null) {
			System.out.println("Erro: Sem grafite.");
		}else {
			int x = escreve * 2;
			if(this.graf.tamanho > x) {
				this.graf.tamanho = this.graf.tamanho - x;
			}else if(this.graf.tamanho < x) {
				this.graf = null;
				System.out.println("Erro: Folha ficou pela metade.");
				System.out.println("Erro: O grafite acabou.");
			}else {
				this.graf = null;
				System.out.println("Erro: o grafite acabou");
			}
		}
	}
	
	public void mostrar() {
		System.out.print("Calibre: " + this.calibre + " ");
		if(this.graf == null) {
			System.out.print("Grafite: " + this.graf);
		}else {
			System.out.println("Grafite: [" + this.graf.calibre + ":" + this.graf.dureza + ":" + this.graf.tamanho +"]");
		}
	}
}
