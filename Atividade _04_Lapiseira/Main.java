package lapiseira;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Lapiseira lapiseira = new Lapiseira(0);
		while(true) {
			String line = scanner.nextLine();
			String[]ui = line.split(" ");
			if(ui[0].equals("end")) {
				break;
			}else if(ui[0].equals("init")) {
				lapiseira = new Lapiseira(Float.parseFloat(ui[1]));
			}else if(ui[0].equals("inserir")) {
				lapiseira.inserirGrafite(new Grafite(Float.parseFloat(ui[1]), ui[2], Integer.parseInt(ui[3])));
			}else if(ui[0].equals("remover")) {
				lapiseira.removerGrafite();
			}else if(ui[0].equals("escrever")) {
				lapiseira.escrever(Integer.parseInt(ui[1]));
			}else if(ui[0].equals("show")) {
				lapiseira.mostrar();
			}else {
				System.out.println("Erro: Opção inválida");
			}
		}
		scanner.close();
	}

}
