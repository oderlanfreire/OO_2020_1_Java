package banco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Conta conta = new Conta(0);
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String line = scanner.nextLine();
			String []ui = line.split(" ");
			if(ui[0].equals("end")) {
				break;
			}else if(ui[0].equals("show")){
				conta.mostrarConta();
			}else if(ui[0].equals("init")) {
				conta = new Conta(Integer.parseInt(ui[1]));
			}else if(ui[0].equals("depositar")) {
				conta.credito(Float.parseFloat(ui[1]));
			}else if(ui[0].equals("sacar")){
				conta.debito(Float.parseFloat(ui[1]));
			}else if(ui[0].equals("tarifas")){
				conta.tarifa(Float.parseFloat(ui[1]));
			}else if(ui[0].equals("estornar")){
				for(int i = 1; i < ui.length; i++)
					conta.estornarTarifa(Integer.parseInt(ui[i]));
			}else if(ui[0].equals("extratop")){
				int n = Integer.parseInt(ui[1]);
				conta.extratoParcial(n);
			}else if(ui[0].equals("extrato")){
				conta.mostrarExtrato();
			}else {
				System.out.println("Erro de operação");
			}
		}
		scanner.close();
	}

}
