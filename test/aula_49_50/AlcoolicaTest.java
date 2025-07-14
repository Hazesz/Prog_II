package aula_49_50;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

public class AlcoolicaTest {
    
    public AlcoolicaTest() {
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
        Alcoolica bebida = new Alcoolica("Askov", "Vodka", "15.6%");
        System.out.println(bebida.conteudo());
    }
}