
/**
 * Write a description of class Acceso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Acceso
{
    // instance variables - replace the example below with your own
    private int anyo;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;

    /**
     * Constructor for objects of class Acceso
     */
    public Acceso(int anyo, int mes, int dia, int hora, int minutos)
    {
        // initialise instance variables
        this.anyo = anyo;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minutos = minutos;
    }
    
     public int getAño() 
    {
        return anyo;
    }
    
    public int getMes()
    {
        return mes;
    }
    
    public int getDia()
    {
        return dia;
    }
    
    public int getHora()
    {
        return hora;
    }
    
    public int getMinutos()
    {
        return minutos;
    }
}
