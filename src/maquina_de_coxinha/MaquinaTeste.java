package maquina_de_coxinha;

public class MaquinaTeste {
    public static void main(String[]args){
        Maquina maquina = new Maquina();
        
        maquina.abastecer(7);
        maquina.venderCoxinha();
        maquina.venderCoxinha(5);
        maquina.zerarMaquina();
    }
}   
