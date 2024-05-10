/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.laboratorio4p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class admin extends usuario {

    private int experiencia;

    public admin() {
    }

    public admin(int experiencia, String nombre, String apellido, String username, String contrasena) {
        super(nombre, apellido, username, contrasena);
        this.experiencia = experiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return super.toString() + "admin{" + "experiencia=" + experiencia + '}';
    }

}
