import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoche {
    @Test
    public void testCrearCocheVelocidadCeroMiguelPozo(){
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }

    @Test
    public void testAcelerarCocheVelocidadAumentaMiguelPozo(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerarMiguelPozo(30);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }

    @Test
    public void testDecelerarCocheVelocidadDisminuyeMiguelPozo(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerarMiguelPozo(20);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }
    @Test
    public void testAlDecelerarCocheVelocidadNoPuedeSerMenorQueCeroMiguelPozo(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerarMiguelPozo(80);
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }

}
