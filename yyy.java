import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class yyy
{
    public yyy()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }
    
    @Test
    public void test1(){
       Encerrado juego = new Encerrado();
       assertNotNull(juego); 
    }
    
    @Test
    public void test2(){
       Encerrado juego = new Encerrado();
       juego.llenarMatriz();
       char b = 92;
       assertEquals(  "* - - - +" 
                     +"\n"+"  " + b 
                     + "   / |" 
                     +"\n"+"    o   |" 
                     +"\n"+"  /   "+ b
                     + " |"+"\n"
                     +"+ - - - *"
                     ,juego.imprimirTablero()); 
    }
}