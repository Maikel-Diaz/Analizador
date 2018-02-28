import java.io.*;
import java.util.*;
/**
 * Write a description of class AnalizadorAccesosAServidor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnalizadorAccesosAServidor
{
    private ArrayList<Acceso> accesosRegistrados;

    /**
     * Constructor for objects of class AnalizadorAccesosAServidor
     */
    public AnalizadorAccesosAServidor()
    {
        accesosRegistrados = new ArrayList<>();

    }
    
    public void analizarArchivoDeLog(String archivoParaLeer)
    {
        accesosRegistrados.clear();
        File archivoLeyendo = new File(archivoParaLeer);
        try {
            Scanner sc = new Scanner(archivoLeyendo);
            while (sc.hasNextLine()) {
                String lineaActual = sc.nextLine();               
                String[] datos = lineaActual.split(" ");
                Acceso accesoActual = new Acceso(Integer.parseInt(datos[0]), 
                                                 Integer.parseInt(datos[1]), 
                                                 Integer.parseInt(datos[2]),
                                                 Integer.parseInt(datos[3]), 
                                                 Integer.parseInt(datos[4]));               
                
                accesosRegistrados.add(accesoActual);
            }
            sc.close();
        }
        catch (Exception a) {
            System.out.println("No se pudo leer el archivo introducido, cambie de archivo o vuelva a intentarlo.");
        }
    }
    
    public int obtenerHoraMasAccesos() 
    {
        int devolver = -1;
        if (!accesosRegistrados.isEmpty()) {
            int[] accesosHora = new int[24];
            for (Acceso accesoActual : accesosRegistrados) {
                int horaAccesoActual = accesoActual.getHora();
                accesosHora[horaAccesoActual] =+ 1;
            }
            int nAccesosMasAlto = accesosHora[0];
            int horaAccesosMasAlto = 0;
            for (int i = 0; i < accesosHora.length; i++) {
                if (accesosHora[i] >= nAccesosMasAlto) {
                    nAccesosMasAlto = accesosHora[i];
                    horaAccesosMasAlto = i;
                }
            }
            devolver = horaAccesosMasAlto;                      
        }
        return devolver;
    }
}
