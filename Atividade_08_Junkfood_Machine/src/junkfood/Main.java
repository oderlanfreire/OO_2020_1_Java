package junkfood;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Machine machine = new Machine(0 ,0);
		
		while(true) {
			String line = scanner.nextLine();
			String []ui = line.split(" ");
			if(ui[0].equals("end")) {
				break;
			}else if(ui[0].equals("init")) {
				machine = new Machine(Integer.parseInt(ui[1]), Integer.parseInt(ui[2])); 
			}else if(ui[0].equals("pagar")) {
				machine.inserirDinheiro(Float.parseFloat(ui[1]));
			}else if(ui[0].equals("carregar")) {
				machine.alterarEspiral(Integer.parseInt(ui[1]), ui[2], Integer.parseInt(ui[3]), Float.parseFloat(ui[4]));
			}else if(ui[0].equals("troco")) {
				machine.pedirTroco();
			}else if(ui[0].equals("comprar")) {
				machine.vender(Integer.parseInt(ui[1]));
			}else if(ui[0].equals("resetar")) {
				machine.Resetar(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
			}else if(ui[0].equals("show")) {
				System.out.println(machine);
			}else {
				System.out.println("Opção invalida");
			}
		}
		scanner.close();
	}

}
