package solver;


public  class Car{
    int gas;
    int max_gas = 100;
    int pass;
    int max_pass = 2;
    int km;

     void status(){
        System.out.println("a quantidade de passageiros no momento é: " + this.pass);
        System.out.println("o limite maximo de passageiros permitido é: " + this.max_pass);
        System.out.println("a quantidade de gasolina no momento é: " + this.gas);
        System.out.println("a quantidade de gasolina que o tanque suporta é: " + this.max_gas);
        System.out.println("a distancia percorrida ate agora é de " + this.km + " quilometros");
    }

    void embarcar(){
        if(this.pass < this.max_pass){
            this.pass++;
        }else{
            System.out.println("Limite maximo de " + this.max_pass + "atingido, espere alguem desembarcar para solicitar uma vaga.");
        }

    }
    void desembarcar(){
        if(this.pass > 0){
            this.pass--;
        }else{
            System.out.println("Erro, impossivel desembarcar pois há "+ this.pass + " passageiros no carro.");
        }

    }
    
    void abastecer(int a){
        if(this.gas == this.max_gas){
            System.out.println("Impossível abastecer, tanque cheio = " + this.gas);
        }else{
            if(this.gas + a < this.max_gas){
                this.gas = this.gas + a;
            }else if(this.gas + a > this.max_gas){
                int descarte = (this.gas + a ) - this.max_gas;
                this.gas = this.max_gas;
                System.out.println("Tanque abastecido completamente mas foi descartado " + descarte + " de gasolina");
            }else if(this.gas + a == this.max_gas){
                this.gas = this.max_gas;
                System.out.println("Tanque abastecido completamente sem necessidade de descarte de gasolina");
            }
        }

    }
    void dirigir(int x){
       
    	if(this.pass <= 0) {
    		System.out.println("não da pra dirigir sem passageiro/motorista");
    	}else {
    		if(this.gas == 0 ){
    			System.out.println("Carro sem gasolina, não há como dirigir");
    		}else{
    			System.out.println("Dirigindo...");
    			if(this.gas >= x){
    				this.km = x;
    				System.out.print("o carro dirigiu " + this.km + " quilometros");
    				this.gas = this.gas - x;
    			}else{
    				this.km = this.gas;
    				int faltou = x - this.gas;
    				this.gas = this.gas - this.km;
    				System.out.println("o carro dirigiu " + this.km + " quilometos, mas faltou " + faltou + " para atingir o objetivo.");
    			}
    		}
    	}
    }
    
}
