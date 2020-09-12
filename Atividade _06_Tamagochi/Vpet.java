package tamagochi;

public class Vpet {
	int energiaMax;
	int saciedadeMax;
	int limpezaMax;
	int energia;
	int saciedade;
	int limpeza;
	int diamantes = 0;
	int idade = 0;
	boolean vivo = false;
	
	public Vpet(int energiaMax, int saciedadeMax, int limpezaMax, boolean vivo) {
		this.energiaMax = energiaMax;
		this.saciedadeMax = saciedadeMax;
		this.limpezaMax = limpezaMax;
		this.energia = energiaMax;
		this.saciedade = saciedadeMax;
		this.limpeza = limpezaMax;
		this.vivo = vivo;
	}
	
	public void brincar() {
		if(this.vivo == false){
			System.out.println("Seu digimon morreu, nenhuma ação pode ser feita a não ser mostrar os dados");
		}else {
			System.out.println("Brincando...");
			this.energia = this.energia - 1;
			this.saciedade = this.saciedade - 1;
			this.limpeza = this.limpeza - 2;
			this.diamantes = this.diamantes + 1;
			this.idade++;
				
		}
		if(this.limpeza == 0) {
			System.out.println("Seu digimon morreu de sujeira");
			this.vivo = false;
		}else if(this.energia == 0) {
			System.out.println("Seu digimon morreu de exaustão");
			this.vivo = false;
		}else if(this.saciedade == 0) {
			System.out.println("Seu digimon morreu de fome");
			this.vivo = false;
		}
	}
	public void comer() {
		if(this.vivo == false) {
			System.out.println("Seu digimon morreu, nenhuma ação pode ser feita a não ser mostrar os dados");
		
		}else if(this.saciedade >= saciedadeMax) {
			System.out.println("o digimon esta sem fome, não vai comer agora");
			this.saciedade = saciedadeMax;
		}else {
				System.out.println("Comendo...");
					this.saciedade = this.saciedade + 4;
					this.energia = this.energia - 1;
					this.limpeza = this.limpeza - 2;
					this.idade++;
					if(this.saciedade > saciedadeMax) {
						this.saciedade = saciedadeMax;
					}
			}
			if(this.limpeza == 0) {
				System.out.println("Seu digimon morreu de sujeira");
				this.vivo = false;
			}else if(this.energia == 0) {
				System.out.println("Seu digimon morreu de exaustão");
				this.vivo = false;
			}
	}
	public void amimir() {
		if(this.vivo == false) {
			System.out.println("Seu digimon morreu, nenhuma ação pode ser feita a não ser mostrar os dados");
		}else if(this.energia >= energiaMax) {
			System.out.println("o digimon esta sem sono, não vai dormir agora");
			this.energia = energiaMax;
		}else if(this.energia > (energiaMax - 4) || this.energia > (energiaMax - 3) || this.energia > (energiaMax - 2) || this.energia > (energiaMax - 4)){
			System.out.println("o digimon esta sem sono, não vai dormir agora");
		}else {
			System.out.println("A mimir...");
			this.energia = energiaMax;
			this.idade++;
		}
	}
	public void banho() {
		if(this.vivo == false) {
			System.out.println("Seu digimon morreu, nenhuma ação pode ser feita a não ser mostrar os dados");
		}else {
			System.out.println("Banhando...");
			this.limpeza = limpezaMax;
			this.energia = this.energia - 3;
			this.saciedade = this.saciedade - 1;
			this.idade = this.idade +2;
		} 
	}
	public String toString() {
		return "[energia: " + this.energia + "/" + energiaMax 
				+ ", saciedade: " + this.saciedade + "/" + saciedadeMax 
				+ ", limpeza: " + this.limpeza + "/" + limpezaMax + ", diamantes: " +
				this.diamantes + ", idade: " + this.idade + ", vivo: " + this.vivo + " ]";
	
	}
	
}


