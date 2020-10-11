package agenda_2;

public class Main {
    public static void main(String[] args) {
        // criação de contatos
        Contato contato1 = new Contato("Erothides Meneghel");
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
        
    
        //craição de agenda e adição de contatos
        Agenda agenda = new Agenda();

        agenda.addContato("Tildinha", contato1);
        agenda.addContato("Lilly Santos", contato2);
        agenda.addContato("Afonsinhar", contato3);
        
        //busca por numero
        for(Contato contato : agenda.search("57")){
            System.out.println(contato);
        }

        System.out.println();
        
        //busca por contato
        Contato contatos = agenda.getContato("Afonsinhar");
        System.out.println(contatos.toString());

        System.out.println();
        
        //impressão de todos os contatos
        for(Contato contato : agenda.getContatos()){
            System.out.println(contato);
        }
        System.out.println();
        
        //remoção de numero de telefone
        contato1.rmTelefone(2);
        contato3.rmTelefone(0);
        
        
        
        //impressão de todos os contatos
        for(Contato contato : agenda.getContatos()){
            System.out.println(contato);
        }
   }
}
    

