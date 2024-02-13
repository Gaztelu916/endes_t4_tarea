/**
 * @author Oscar
 * @version 1.0
 * @since   2024-02-05
 */


import java.util.ArrayList;

public class Auto {

    /**
     * Marca del auto.
     */
    private String marca;

    /**
     * Modelo del auto.
     */
    private String modelo;

    /** Instancia clase auto
     *
     * @param marca
     * @param modelo
     */
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Obtiene marca del automovil.
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del automóvil.
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el modelo del automovil
     * @return modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del automovil
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Devuelve un string con los valores de la clase auto.
     * @return marca y modelo del auto
     */
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}


