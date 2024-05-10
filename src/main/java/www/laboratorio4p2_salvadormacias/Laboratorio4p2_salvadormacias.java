/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package www.laboratorio4p2_salvadormacias;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Apple
 */
public class Laboratorio4p2_salvadormacias {

    public static ArrayList lista = new ArrayList();
    public static ArrayList<usuario> lista_usuarios = new ArrayList<>();
    public static Scanner lea = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salida = false;
        lista.add(new admin(10, "pepe", "hernandez", "pepito123", "PEPE10"));
        lista.add(new gerente("administracion", "oscar", "sanchez", "oscar_san", "molly77"));
        lista.add(new empleado(0.0, "fredy", "matamoros", "darkFredy", "fredy2000"));
        
        do {
            System.out.println("---Bienvenido---");
            System.out.println("1. iniciar sesion");
            System.out.println("2. salir");
            int opcion = lea.nextInt();
            if (opcion == 1) {
                System.out.println("---Inicio de sesion---");
                System.out.println("Ingrese el nombre del usuario: ");
                String user= str.nextLine();
                String
                

            } else if (opcion == 2) {

            } else {

                System.out.println("opcion ingresada es invalida...");
            }

        } while (salida != true);

    }
}
