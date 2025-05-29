/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_23_24;

/**
 *
 * @author ihenr
 */
public class ManipulacaoString {
    int somador;
    
    public ManipulacaoString(){
    somador = 0;
    }
    public int receptor(String txt,int ...var){
        if("SOM".equals(txt)){
        for(int i = 0; i < var.length; i++){
          somador += var[i]; 
        }
        }
        if("MULT".equals(txt)){
           somador = 1; 
            for(int i = 0; i < var.length; i++){
                somador *= var[i];
            }
        }
        return somador;
}
}
