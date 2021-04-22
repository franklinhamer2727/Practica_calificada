import static org.junit.Assert.assertEquals;
import org.junit.Test;
  
    
public class Complejo1Test {
    

  
    @Test
    public void testSuma() {
        Complejo1 n1 = new Complejo1(1,2);
        Complejo1 n2 = new Complejo1(1,2);
        Complejo1 sum = new Complejo1();
        Complejo1 expe = new Complejo1(2.0,4.0);
        sum.suma(n1, n2);
        assertEquals(expe.getParteReal(), sum.getParteReal(),0);
        assertEquals(expe.getParteImaginaria(),sum.getParteImaginaria(),0);


        
    }
    @Test
    public void testResta() {
        Complejo1 n1 = new Complejo1(1,2);
        Complejo1 n2 = new Complejo1(1,2);
        Complejo1 res = new Complejo1();
        Complejo1 expe = new Complejo1(0,0);
        res.resta(n1, n2);
        assertEquals(expe.getParteReal(), res.getParteReal(),0);
        assertEquals(expe.getParteImaginaria(),res.getParteImaginaria(),0);
    }
    @Test
    public void testProducto() {
        Complejo1 n1 = new Complejo1(1,2);
        Complejo1 n2 = new Complejo1(1,2);
        Complejo1 pro = new Complejo1();
        Complejo1 expe = new Complejo1(-3,4);
        pro.producto(n1, n2);
        assertEquals(expe.getParteReal(), pro.getParteReal(),0);
        assertEquals(expe.getParteImaginaria(),pro.getParteImaginaria(),0);
        
    }
    @Test
    public void testCociente() {
        Complejo1 n1 = new Complejo1(1,2);
        Complejo1 n2 = new Complejo1(1,2);
        Complejo1 coc = new Complejo1();
        Complejo1 expe = new Complejo1(1,0);
        coc.cociente(n1, n2);
        assertEquals(expe.getParteReal(), coc.getParteReal(),0);
        assertEquals(expe.getParteImaginaria(),coc.getParteImaginaria(),0);
        
    }
}
    