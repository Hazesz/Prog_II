package maquina_de_coxinha;

public class MaquinaTeste {
    public static void main(String[]args){
        Maquina maquina = new Maquina();
        
        maquina.abastecer(7);
        maquina.vender_coxinha();
        maquina.vender_coxinha(5);
        maquina.zerar_maquina();
    }
}   
