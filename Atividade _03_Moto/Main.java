package motoca;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Moto moto = new Moto(1);
		while(true){
			String line = scanner.nextLine();
			String []ui = line.split(" ");
			
			if(ui[0].equals("end")) {
				break;
			}else if(ui[0].contentEquals("init")) {
				moto = new Moto(Integer.parseInt(ui[1]));
			}else if(ui[0].contentEquals("embarcar")) {
				int idade = (Integer.parseInt(ui[2]));
				moto.subir(new Pessoa(ui[1],idade));
			}else if(ui[0].contentEquals("desembarcar")) {
				moto.descer();
			}else if(ui[0].contentEquals("comprar")) {
				moto.comprarTempo(Integer.parseInt(ui[1]));
			}else if(ui[0].equals("dirigir")) {
				moto.dirigir(Integer.parseInt(ui[1]));
			}else if(ui[0].equals("buzinar")) {
				moto.buzinar();
			}else if(ui[0].equals("mostrar")) {
				moto.mostrar();
			}else {
				System.out.println("Erro: Opção inválida!");
			}
		}
		scanner.close();
	}

}
