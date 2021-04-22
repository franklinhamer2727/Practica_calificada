import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testDistancia() {
        App cord1 = new App(1, 2);
        App cord2 = new App(3, 5);
        App distancia = new App();
        double exp = Math.sqrt(13);
        assertEquals(exp, distancia.distancia(cord1, cord2), 0);

    }
}
