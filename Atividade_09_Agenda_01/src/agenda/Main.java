package agenda;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Contato contato = new Contato("");
		while(true) {
			String line = scanner.nextLine();
			String[] ui = line.split(" ");
			if(ui[0].equals("end")) {
				break;
			}else if(ui[0].equals("init")){
				contato = new Contato(ui[1]);
				
			}else if(ui[0].equals("add")){	
				contato.addTelefone(ui[1], ui[2]);
				
			}else if(ui[0].equals("remover")){
				contato.rmTelefone(Integer.parseInt(ui[1]));
				
			}else if(ui[0].equals("show")){
				System.out.println(contato);
			}else {
			
				System.out.println("error");
			}
		}
		scanner.close();
	}

}
