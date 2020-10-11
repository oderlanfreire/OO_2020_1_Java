package agenda_2;

public class Fone {
    String id;
    String numero;

    public Fone(String serial) {
        String[] quebrarserial = serial.split(":");
        this.id = quebrarserial[0];
        this.numero = quebrarserial[1];
    }


    public static boolean validar_Numero(String numero){
        String validos = "0123456789().-";
        for(int i = 0; i < numero.length(); i++){
            char c = numero.charAt(i);
            if(validos.indexOf(c) == -1){
                return false;
            }
        }
        return true;
    }

    public String toString(){
        return this.id + ":" + this.numero;
    }

    

}
