package agiota;

public class Main {

	public static void main(String[] args) {
	
		Sistema agiota = new Sistema(800);
		agiota.addClientes("Tidinha", "Erothides Neves Mitozzo");
		agiota.addClientes("Xula", "Xula Tuanna Fontes dos Santos");
		agiota.addClientes("Ez", "Arthur Ezvael");
		agiota.addClientes("Sandra Sapatão","Sandra Alexandrina alguma coisa");
		
		agiota.emprestar("Tidinha", 20);
		agiota.emprestar("Xula", 150);
		agiota.receber("Tidinha", 10);
		agiota.receber("Tidinha", 10);
		System.out.println(agiota);
		System.out.println(agiota.saldo);
		agiota.emprestar("Sandra Sapatão", 800);
		agiota.emprestar("Sandra Sapatão", 200);
		System.out.println(agiota);
		System.out.println(agiota.saldo);
	}
}
