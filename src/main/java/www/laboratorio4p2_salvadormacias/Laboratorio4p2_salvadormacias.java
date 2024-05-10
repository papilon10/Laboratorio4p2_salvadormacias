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
        lista_usuarios.add(new admin(10, "pepe", "hernandez", "pepito123", "PEPE10"));
        lista_usuarios.add(new gerente("administracion", "oscar", "sanchez", "oscar_san", "molly77"));
        lista_usuarios.add(new empleado(0.0, "fredy", "matamoros", "darkFredy", "fredy2000"));

        do {
            System.out.println("---Bienvenido---");
            System.out.println("1. iniciar sesion");
            System.out.println("2. salir");
            int opcion = lea.nextInt();
            if (opcion == 1) {
                System.out.println("---Inicio de sesion---");
                System.out.println("Ingrese el nombre del usuario: ");
                String user = str.nextLine();
                System.out.println("Ingrese la contrasena: ");
                String contrasena = str.nextLine();
                System.out.println("sesion iniciada correctamente");

                boolean salida_admin = false;
                do {
                    System.out.println("---menu administrador---");
                    System.out.println("1. crear usuario ");
                    System.out.println("2. eliminar usuario ");
                    System.out.println("3. listar usuarios ");
                    System.out.println("4. crear tarea ");
                    System.out.println("5. eliminar tarea ");
                    System.out.println("6. listar tareas ");
                    System.out.println("7. salir");
                    int opcion_admin = lea.nextInt();
                    switch (opcion_admin) {
                        case 1: {
                            System.out.println("---crear usuario---");
                            System.out.println("[1.admin/2.gerente/3.empleado]");
                            int op_crearUsuario = lea.nextInt();
                            if (op_crearUsuario == 1) {
                                System.out.println("Ingrese el nombre: ");
                                String nombre = str.nextLine();
                                System.out.println("Ingrese el apellido: ");
                                String apellido = str.nextLine();
                                System.out.println("Ingrese el nombre de usuario: ");
                                String username = str.nextLine();
                                System.out.println("Ingrese la contrasena: ");
                                String contrasena_admin = str.nextLine();
                                System.out.println("Ingrese los anos de experiencia: ");
                                int experiencia = lea.nextInt();
                                lista.add(new admin(experiencia, nombre, apellido, username, contrasena_admin));
                                System.out.println("administrador creado exitosamente....");

                            } else if (op_crearUsuario == 2) {
                                System.out.println("Ingrese el nombre: ");
                                String nombre = str.nextLine();
                                System.out.println("Ingrese el apellido: ");
                                String apellido = str.nextLine();
                                System.out.println("Ingrese el nombre de usuario: ");
                                String username = str.nextLine();
                                System.out.println("Ingrese la contrasena: ");
                                String contrasena_gerente = str.nextLine();
                                System.out.println("Ingrese la carrera cursada: ");
                                String carrera = str.nextLine();
                                lista.add(new gerente(carrera, nombre, apellido, username, contrasena));
                                System.out.println("gerente creado exitosamente.....");

                            } else if (op_crearUsuario == 3) {
                                System.out.println("Ingrese el nombre: ");
                                String nombre = str.nextLine();
                                System.out.println("Ingrese el apellido: ");
                                String apellido = str.nextLine();
                                System.out.println("Ingrese el nombre de usuario: ");
                                String username = str.nextLine();
                                System.out.println("Ingrese la contrasena: ");
                                String contrasena_empleado = str.nextLine();
                                Double dinero=0.0;
                                System.out.println("Ingrese el dinero actual: ");
                                dinero = lea.nextDouble();
                                lista.add(new empleado(dinero, nombre, apellido, username, contrasena));
                                System.out.println("empleado creado exitosamente....");
                                
                            } else {
                                System.out.println("opcion ingresada es invalida...");
                            }

                        }
                        break;
                        case 2: {

                        }
                        break;
                        case 3: {

                        }
                        break;
                        case 4: {

                        }
                        break;
                        case 5: {

                        }
                        break;
                        case 6: {

                        }
                        break;
                        case 7: {
                            salida_admin = true;
                            System.out.println("se abandora el menu de administrador...");

                        }
                        break;
                        default: {
                            System.out.println("Opcion ingresada es invalida...");

                        }
                        break;

                    }

                } while (salida_admin != true);

            } else if (opcion == 2) {
                salida = true;
                System.out.println("se abandonara el programa...");

            } else {

                System.out.println("opcion ingresada es invalida...");
            }

        } while (salida != true);

    }
}
