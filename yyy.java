import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class yyy{
    public yyy(){
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
       Encerrado GOT = new Encerrado();
       assertNotNull(GOT); 
    }
    
    @Test
    public void test2(){
       Encerrado GOT = new Encerrado();
       assertEquals( "♦┬♣" +"\n"+
                     "├B☻" +"\n"+
                     "♣┴♦" +"\n",GOT.imprimirTablero());
    }
    
    @Test
    public void test3(){
       Encerrado GOT = new Encerrado();
       assertTrue(GOT.sePuedeConquistar("G","B","♦"));
    }
    
    @Test
    public void test4(){
       Encerrado GOT = new Encerrado();
       assertTrue(GOT.sePuedeConquistar("R","B","♦"));
    }
    
    @Test
    public void test5(){
       Encerrado GOT = new Encerrado();
       assertTrue(GOT.sePuedeConquistar("L","B","♣"));
    }
       
    @Test
    public void test6(){
       Encerrado GOT = new Encerrado();
       assertTrue(GOT.sePuedeConquistar("S","B","♣"));
    }
    
    @Test
    public void test7(){
       Encerrado GOT = new Encerrado();
       assertFalse(GOT.sePuedeConquistar("S","R","♦"));
    }

    @Test
    public void test8(){
       Encerrado GOT = new Encerrado();
       GOT.conquistar("G","B");
       assertEquals( "G┬♣" +"\n"+
                     "├♦☻" +"\n"+
                     "♣┴♦" +"\n",GOT.imprimirTablero());
    }
    
    @Test
    public void test9(){
       Encerrado GOT = new Encerrado();
       GOT.conquistar("R","B");
       assertEquals( "♦┬♣" +"\n"+
                     "├♦☻" +"\n"+
                     "♣┴R" +"\n",GOT.imprimirTablero());
    }
    
    @Test
    public void test10(){
       Encerrado GOT = new Encerrado();
       GOT.conquistar("S","B");
       assertEquals( "♦┬S" +"\n"+
                     "├♣☻" +"\n"+
                     "♣┴♦" +"\n",GOT.imprimirTablero());
    }
    
    @Test
    public void test11(){
       Encerrado GOT = new Encerrado();
       GOT.conquistar("L","B");
       assertEquals( "♦┬♣" +"\n"+
                     "├♣☻" +"\n"+
                     "L┴♦" +"\n",GOT.imprimirTablero());
    }
    
    
}