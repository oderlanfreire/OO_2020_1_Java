package motoca;
public class Moto {
	int potencia;
	Pessoa pass;
	int tempo = 0;
	
	
	public Moto(int potencia) {
		this.potencia = potencia;
	}
	
	public void subir(Pessoa pass) {
		if(this.pass == null){
			this.pass = pass;
		}else {
			System.out.println("ja existe alguem no veiculo");
		}
	}
	public void buzinar() {
		if(this.pass != null) {
			System.out.print("P");
			for(int i = 0; i < potencia; i++){
				System.out.print("e");
			}
			System.out.println("m");
		}else {
			System.out.println("Erro: moto vazia!");
		}
	}
	
	public void descer() {
		if(this.pass != null) {
			System.out.println("desembarcou");
			this.pass = null;
		}else {
			System.out.println("não há ninguém na moto");
		}
	}
	public void comprarTempo(int preco) {
		this.tempo += preco;
	}
	
	
	public void dirigir(int tempo) {
		if(this.pass == null) {
			System.out.println("não tem ninguem na moto");
			return;
		}
		if(this.pass.idade < 4) {
			System.out.println("idade insuficiente para andar na moto");
		}else if(this.pass.idade > 10) {
			System.out.println("muito velho para andar na moto");
		}else {
			if(this.tempo < tempo) {
				System.out.println("andou " + this.tempo + " min e acabou o tempo");
				this.tempo= this.tempo - tempo;
			}else {
				this.tempo = this.tempo - tempo;
				System.out.println("dirigindo... " + tempo);
			}
		}
	} 
	public void mostrar() {
		System.out.print("Potencia: " + this.potencia + " Tempo: " + this.tempo + " Pessoa: [ ");
		if(this.pass == null) {
			System.out.print(this.pass);
		}else {
			System.out.print(this.pass.nome + " : " + this.pass.idade);
		}
		System.out.println(" ]");
		
	}
}
