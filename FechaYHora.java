
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
     * 
     */
}
