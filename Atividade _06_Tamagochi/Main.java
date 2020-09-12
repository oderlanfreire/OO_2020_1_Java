package tamagochi;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vpet digimon = new Vpet(0,0,0, false);		
		while(true) {
			String line = scanner.nextLine();
			String []ui = line.split(" ");
			if(ui[0].equals("end")) {
				break;
			}else if(ui[0].equals("init")) {
				digimon = new Vpet(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]), Integer.parseInt(ui[3]), true);
			}else if(ui[0].equals("show")) {
				System.out.println(digimon.toString());
			}else if(ui[0].equals("brincar")) {
				digimon.brincar();
			}else if(ui[0].equals("comer")) {
				digimon.comer();
			}else if(ui[0].equals("banhar")) {
				digimon.banho();
			}else if(ui[0].equals("dormir")) {
				digimon.amimir();
			}else {
				System.out.println("Erro: opção inválida");
			}
		}
		scanner.close();
	}

}
