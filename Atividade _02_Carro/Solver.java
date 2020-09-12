package solver;

import java.util.Scanner;

public class Solver {
    
    public static void main(final String[] args){
        final Scanner scanner = new Scanner(System.in);
        final Car carro = new Car();
        while(true){
            final String line = scanner.nextLine();
            final String []ui = line.split(" ");
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("embarcar")){
               carro.embarcar();
                
            }else if(ui[0].equals("desembarcar")){
                carro.desembarcar();
            }else if(ui[0].equals("abastecer")){
                final int a = Integer.parseInt(ui[1]);
                carro.abastecer(a);
            }else if(ui[0].equals("dirigir")){
                final int x = Integer.parseInt(ui[1]);
                carro.dirigir(x);
            }else if(ui[0].equals("show")){
                carro.status();
            }else{
                System.out.println("Comando inválido");
            }
        }
       scanner.close();
    }
}