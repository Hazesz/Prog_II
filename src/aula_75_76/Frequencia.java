package aula_75_76;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Frequencia{
    public static void main(String[]args) throws IOException{
        final String arquivo = "C:\\Users\\ihenr\\Documents"
                + "\\NetBeansProjects\\Prog_II\\Java\\src\\aula_75_76\\"
                + "HinoNacional.txt";
        String texto = Files.readString(Path.of(arquivo));
        
        texto = texto.toLowerCase();
                
        texto = texto.replace(" o ", " ");
        texto = texto.replace(" a ", " ");
        texto = texto.replace(" e ", " ");
        
        String palavras[] = texto.split(" "); //separa as palavras quando vê " "
                                              //transformando em Strings
        
        Map<String,Integer> tabela = new HashMap(); //Cria uma tabela hash, dizendo oq ela vai armazenar
        
        for(String p : palavras){
        if(tabela.containsKey(p)){
            tabela.put(p, tabela.get(p)+1); //get pega a chave e adiciona um valor
        }
        else{
            tabela.put(p, 1); //put adiciona o elemento na tabela, e o valor inicial correspondente
        }
    }
        System.out.println(tabela.get("pátria"));
    }
}
