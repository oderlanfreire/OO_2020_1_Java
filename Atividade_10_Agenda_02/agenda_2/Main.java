package agenda_2;

public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato("Erothides Neves Mitozzo");
        Contato contato2 = new Contato("Leticia dos Santos");
        Contato contato3 = new Contato("Agathar Nunes");
    
    
        contato1.addTelefone("claro", "9548567");
        contato1.addTelefone("casa", "4845457");
        contato1.addTelefone("tim", "787945");
    
        contato2.addTelefone("vivo", "9655557");
        contato2.addTelefone("nextel", "545657");
        contato2.addTelefone("claro", "89665557");

        contato3.addTelefone("casa", "3765456"); 
        contato3.addTelefone("claro", "648654213"); 
        contato3.addTelefone("tim", "455623181");
        contato3.addTelefone("oi", "9876443111");
    
        Agenda agenda = new Agenda();

        agenda.addContato("Tidinha", contato1);
        agenda.addContato("Lilly Santos", contato2);
        agenda.addContato("Afonsinha", contato3);

        for(Contato contato : agenda.search("a")){
            System.out.println(contato);
        }

        System.out.println();

        Contato contatos = agenda.getContato("Afonsinha");
        System.out.println(contatos.toString());

        System.out.println();

        for(Contato contato : agenda.getContatos()){
            System.out.println(contato);
        }
        System.out.println();
        
        contato1.rmTelefone(2);
        contato3.rmTelefone(0);

        for(Contato contato : agenda.getContatos()){
            System.out.println(contato);
        }
   }
}
    

