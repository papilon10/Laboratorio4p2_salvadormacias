/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.laboratorio4p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class empleado extends usuario{
    
    private Double dinero_actual;

    public empleado() {
    }

    public empleado(Double dinero_actual, String nombre, String apellido, String username, String contrasena) {
        super(nombre, apellido, username, contrasena);
        this.dinero_actual = dinero_actual;
    }

    public Double getDinero_actual() {
        return dinero_actual;
    }

    public void setDinero_actual(Double dinero_actual) {
        this.dinero_actual = dinero_actual;
    }

    @Override
    public String toString() {
        return super.getNombre()+ "empleado{" + "dinero_actual=" + dinero_actual + '}';
    }
    
    
}
