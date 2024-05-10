/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.laboratorio4p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class gerente extends usuario {

    private String carrera;

    public gerente() {
    }

    public gerente(String carrera, String nombre, String apellido, String username, String contrasena) {
        super(nombre, apellido, username, contrasena);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    @Override
    public String toString() {
        return super.toString() + "gerente{" + "carrera=" + carrera + '}';
    }

}
