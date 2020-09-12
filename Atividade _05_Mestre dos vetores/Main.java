package mestre_vetores;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList <Integer> combo = new ArrayList<>();
		
		while(true) {
			String line = scanner.nextLine();
			String []ui = line.split(" ");
			
			if(ui[0].equals("add")) {
				for(int i = 1; i < ui.length; i++) {
					combo.add(Integer.parseInt(ui[i]));
				}
			}else if(ui[0].equals("get")) {
					int i = Integer.parseInt(ui[1]);
					System.out.println(combo.get(i));
			}else if(ui[0].equals("set")) {
				int i = Integer.parseInt(ui[1]);
				int v = Integer.parseInt(ui[2]);
				combo.set(i, v);			
			}else if(ui[0].equals("rmi")) {
				int i = Integer.parseInt(ui[1]);
				combo.remove(i);
			}else if(ui[0].equals("find")){
				System.out.print("[ ");
				for(int i = 1; i < ui.length; i++)
					System.out.print(combo.indexOf(Integer.parseInt(ui[i])) + " ");
				System.out.print("]");
			} else if(ui[0].equals("rma")) {
				for(int j = 1; j < ui.length; j++) {
					for(int i = 0; i < combo.size(); i++) {
						int a = Integer.parseInt(ui[j]);
						if(a == combo.get(i)) {
							combo.remove(i);
							i--;
						}
					}
				}
			}else if(ui[0].equals("ins")) {
				int i = Integer.parseInt(ui[1]);
				int v = Integer.parseInt(ui[2]);
				if(i < 0) {
					continue;
				}
				if(i > combo.size()) {
					i = combo.size();
					combo.add(i, v);
				}else if(i<combo.size() && i >= 0){
					combo.add(i, v);
				}
			}else if(ui[0].equals("rshow")) {
				System.out.print("[ ");
				for(int i = combo.size() - 1; i > -1; i--) {
					System.out.print(combo.get(i) + " ");
				}
				System.out.println("]");
			}else if(ui[0].equals("show")) {
				System.out.print("[ ");
				for(int v :  combo) {
					System.out.print(v + " ");
				}
				System.out.println("]");
			}else if(ui[0].equals("end")){
				break;
			}else {
				System.out.println("falha");
			}
		}
		scanner.close();
	}
}
