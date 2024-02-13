/**
 * @author Oscar
 * @version 1.0
 * @since   2024-02-05
 */

import java.util.ArrayList;

public class Concesionario {

    /**
     * Declarar arraylist autos.
     */
    private ArrayList<Auto> autos;

    /**
     * Crear nueva clase concesionario.
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }

    /**
     * Metodo para agregar un nuevo auto al concesionario
     * @param auto
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * Metodo para obtener un listado con los coches disponibles
     * @return
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }

    /**
     * Crear metodo para imprimir por pantalla los autos del concesionario.
     */
    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}

