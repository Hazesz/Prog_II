package prog_ii.buscacep;

import java.io.IOException;
import java.util.ArrayList;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author ihenr
 */
public class TelaControlador{
    private Buscador buscador;
    @FXML private TextField txtNome;
    @FXML private TextField txtTelefone;
    @FXML private TextField txtCep;
    @FXML private TextField txtRua;
    @FXML private TextField txtNumero;
    @FXML private TextField txtCidade;
    @FXML private TextField txtEstado;
    
    private ArrayList<Cliente> clientes;
    
    @FXML
    private TableView<Cliente> tabelaClientes;
    @FXML
    private TableColumn<Cliente, Integer> colunaCodigo;         
    @FXML
    private TableColumn<Cliente, String> colunaNome;
    @FXML
    private TableColumn<Cliente, String> colunaCidade;
    @FXML
    private TableColumn<Cliente, String> colunaEstado;
    @FXML
    private TableColumn<Cliente, String> colunaTelefone;
    
    @FXML
    public void initialize(){
        clientes = new ArrayList<>();
        tabelaClientes.setItems(FXCollections.
        observableArrayList(clientes));
        
        buscador = new Buscador();

        colunaCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colunaTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));

        colunaCidade.setCellValueFactory( cid -> {
                                    return new SimpleStringProperty(
                                        cid.getValue().getEndereco().getCidade()
                                    );
                    }
        );
        colunaEstado.setCellValueFactory( cid -> {
                                    return new SimpleStringProperty(
                                        cid.getValue().getEndereco().getEstado()
                                    );
                    }
        );
    }
    
   @FXML
   public void salvarCliente(){
       Endereco endereco = new Endereco(txtCep.getText(),
                                        txtRua.getText(),
                                        txtNumero.getText(),
                                        txtCidade.getText(),
                                        txtEstado.getText());
       Cliente cliente = new Cliente(txtNome.getText(),
                                    endereco,
                                    txtTelefone.getText());
        clientes.add(cliente);
        
        tabelaClientes.setItems(FXCollections.
                observableArrayList(clientes));
   }
   
   @FXML
   public void limpar(){
       txtNome.clear();
       txtTelefone.clear();
       txtCep.clear();
       txtRua.clear();
       txtNumero.clear();
       txtCidade.clear();
       txtEstado.clear();
   }
   
   @FXML
   public void buscarCEP(){
       String cep = txtCep.getText();
       try{
        Endereco preencher = buscador.buscar(cep);
        txtRua.setText(preencher.getRua());
        txtNumero.clear();
        txtCidade.setText(preencher.getCidade());
        txtEstado.setText(preencher.getEstado());
       }
       catch(IllegalArgumentException | IOException e){
           System.err.println(e.getMessage());
       }
       
   }


}