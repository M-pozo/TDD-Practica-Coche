public class Coche {
    public int velocidad;

    public void acelerarMiguelPozo(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerarMiguelPozo(int deceleracion) {
        velocidad -= deceleracion;
        if (velocidad < 0) velocidad = 0;
    }
}
