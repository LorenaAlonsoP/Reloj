
/**
 * Write a description of class FechaYHora here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FechaYHora
{
    // instance variables - replace the example below with your own
    private CalendarioBasico fecha;
    private ClockDisplay hora;

    /**
     * Constructor for objects of class FechaYHora
     */
    public FechaYHora()
    {
        fecha = new CalendarioBasico ();
        hora = new ClockDisplay ();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getFechaYHora()
    {
        return fecha.obtenerFecha() + " / " + hora.getTime();
    }
    
    /**
     * Fijar fecha y hora
     */
    public void fijarFechaYHora(int dias, int meses, int ano, int horas, int minutos) {
        hora.setTime(horas, minutos);
        fecha.fijarFecha(dias, meses, ano);
    }
    
    /**
     * Avanzar fecha
     */
    public void avanzarFechaYHora()
    {
        hora.timeTick();
        if (hora.getTime().equals("00:00")) {
            fecha.avanzarFecha();
        }
    }
}
