package maquina;
/**
 *
 * @author ihenr
 */
public class Maquina {
   private int estoque;
   
   public Maquina(){
       estoque = 0;
   }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
   
    public void abastecer(int quant){
        if(quant > 0){
            estoque = estoque + quant;
        }
    }
    
    public void venderCoxinha(){
        if(estoque > 0){
            estoque--;
        }
    }
    
    public void venderCoxinha(int quant){
        if(estoque > 0 && quant <= estoque){
            estoque = estoque - quant;
        }
    }
    
    public void zerarMaquina(){
        estoque = 0;
    }
}
