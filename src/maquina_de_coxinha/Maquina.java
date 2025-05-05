package maquina_de_coxinha;
/**
 *
 * @author ihenr
 */
public class Maquina {
    private int coxinha;
    public Maquina(){
        coxinha = 0;
    }
    
    public void setCoxinha(int coxinha){
        this.coxinha = coxinha;
    }
    public int getCoxinha(){
        return coxinha;
    }
    
    public void abastecer(int quant){
        if(quant >= 0){
            coxinha += quant;
        }
        System.out.println("Quantidade de Coxinhas: " + coxinha);
    }
    
    public void vender_coxinha(){
        if(coxinha > 0){
        coxinha--;
        }
        System.out.println("Quantidade de Coxinhas: " + coxinha);
    }
    public void vender_coxinha(int comprado){
        if(comprado > coxinha){
            System.out.println("Falha Catastrofica");
            System.out.println("Quantidade de coxinha menor que a requerida!");
        }
        if(comprado <= coxinha){
            coxinha = coxinha - comprado;
        }
        System.out.println("Quantidade de Coxinhas: " + coxinha);
    }
    
    public void zerar_maquina(){
        for(int zerar = 0; zerar <= coxinha; zerar ++){
            if(coxinha >= 0){
                coxinha --;
            }
        }
        System.out.println("Quantidade de Coxinhas: " + coxinha);
    }
}
