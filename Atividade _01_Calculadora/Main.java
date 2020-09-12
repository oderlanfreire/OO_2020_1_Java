package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculadora calculadora = new Calculadora(0);
		while(true) {
			String line = scanner.nextLine();
			String []ui = line.split(" ");
			if(ui[0].contentEquals("end")) {
				break;
			}else if(ui[0].equals("init")) {
				calculadora = new Calculadora(Integer.parseInt(ui[1]));
			}else if(ui[0].equals("soma")) {
				int a = Integer.parseInt(ui[1]);
				int b = Integer.parseInt(ui[2]);
				calculadora.sum(a, b);
			}else if(ui[0].equals("sub")) {
				int a = Integer.parseInt(ui[1]);
				int b = Integer.parseInt(ui[2]);
				calculadora.sub(a, b);
			}else if(ui[0].equals("div")) {
				int a = Integer.parseInt(ui[1]);
				int b = Integer.parseInt(ui[2]);
				calculadora.div(a, b);
			}else if(ui[0].equals("multi")) {
				int a = Integer.parseInt(ui[1]);
				int b = Integer.parseInt(ui[2]);
				calculadora.mult(a, b);
			}else if(ui[0].equals("resto")) {
				int a = Integer.parseInt(ui[1]);
				int b = Integer.parseInt(ui[2]);
				calculadora.restoDiv(a, b);
			}else if(ui[0].contentEquals("show")) {
				calculadora.mostrar();
			}else if(ui[0].equals("recarregar")) {
				int carga = Integer.parseInt(ui[1]);
				calculadora.carga(carga);
			}else {
				System.out.println("Comando invalido");
			}
		}
		scanner.close();

	}

}
