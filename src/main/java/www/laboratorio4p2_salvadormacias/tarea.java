/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.laboratorio4p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class tarea {

    public String nombre;
    public String descripcion;
    public int tiempo;
    public Double pago;

    public tarea() {
    }

    public tarea(String nombre, String descripcion, int tiempo, Double pago) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tiempo = tiempo;
        this.pago = pago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Double getPago() {
        return pago;
    }

    public void setPago(Double pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "tarea{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", tiempo=" + tiempo + ", pago=" + pago + '}';
    }

}
