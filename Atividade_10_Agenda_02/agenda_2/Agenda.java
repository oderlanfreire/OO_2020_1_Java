package agenda_2;

import java.util.*;



public class Agenda {
    private Map<String, Contato> contatos = new TreeMap<>();

    public ArrayList<Contato> search(String nome){
        ArrayList <Contato> contato = new ArrayList<>();
        for(Contato objeto : contatos.values()){
            if(objeto.toString().contains(nome)){
                contato.add(objeto);
            }
        }
        return contato;
    }

    void addContato(String nome, Contato fone) {
        if(contatos.keySet().contains(nome)){
            return;
        }
        if(contatos.values().contains(fone)){
            return;
        }

        contatos.put(nome, fone);

    }

    boolean rmContato(String nome){
        if(contatos.keySet().contains(nome)){
            contatos.remove(nome);
            return true;
        }
        return false;
    }

    Contato getContato(String nome) {
    if(!contatos.keySet().contains(nome)){
        System.out.println("contato inexistente");
    }
    return contatos.get(nome);
}

   
     ArrayList<Contato> getContatos() {
        ArrayList <Contato> contato = new ArrayList<>();
        for(Contato objeto : contatos.values()){
                contato.add(objeto);
        }
        return contato;
    }



}
