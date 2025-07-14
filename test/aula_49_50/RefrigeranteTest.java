package aula_49_50;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

public class RefrigeranteTest {
    
    public RefrigeranteTest() {
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
        Refrigerante refri = new Refrigerante("Fanta", "Fanta Laranja", "Laranja");
        System.out.println(refri.conteudo());
    }
}