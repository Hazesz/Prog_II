package maquina;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author ihenr
 */
public class TelaControlador {
    
    @FXML
    private TextField campo;
    private Maquina maquina;
    @FXML
    private TextField campoQuantidadeAbastecer;
    @FXML
    private TextField campoQuantidadeVender;
    
    @FXML
    private void initialize(){
        maquina = new Maquina();
    }
    
    @FXML
    private void abastecerQuant(){
        try{
            int quant = Integer.parseInt(campoQuantidadeAbastecer.getText());
            maquina.abastecer(quant);
            campo.setText(String.valueOf(maquina.getEstoque()));
        }catch(NumberFormatException e){
            campo.setText("Quantidade Invalida");
        }
    }
    
    @FXML
    private void vender(){
        maquina.venderCoxinha();
        campo.setText(String.valueOf(maquina.getEstoque()));
    }
    @FXML
    private void venderQuantidade() {
        try {
            int quant = Integer.parseInt(campoQuantidadeVender.getText());
            maquina.venderCoxinha(quant);
            campo.setText(String.valueOf(maquina.getEstoque()));
        } catch (NumberFormatException e) {
            campo.setText("Quantidade inválida");
        }
    }
    
    @FXML
    private void zerar(){
        maquina.zerarMaquina();
        campo.setText(String.valueOf(maquina.getEstoque()));
    }
}
