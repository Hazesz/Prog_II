package aula_49_50;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

public class SucoTest {
    
    public SucoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    public static void main(String[]args){
        Suco suco = new Suco("Prats", "Suco de Laranja", "Laranja");
        System.out.println(suco.conteudo());
    }
}
