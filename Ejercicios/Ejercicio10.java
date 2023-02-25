import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class Ejercicio10 {
    /*
    10. Registro de Empleados
Los empleados de una cierta compañía se representan en la base de datos de la compañía por su nombre,número de empleado y número de la seguridad social.Construir una estructura de tablas hash que permita acceder al registro de un empleado por cualquiera de estos tres datos.(Nota:No se dispone de memoria suficiente para duplicar los registros de los empleados).
     */

    private String nombre;
    private int nEmpleados;
    private int nSeguridadSocial;

    public Ejercicio10(String nombre, int nEmpleados, int nSeguridadSocial) {
        this.nombre = nombre;
        this.nEmpleados = nEmpleados;
        this.nSeguridadSocial = nSeguridadSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnEmpleados() {
        return nEmpleados;
    }

    public void setnEmpleados(int nEmpleados) {
        this.nEmpleados = nEmpleados;
    }

    public int getnSeguridadSocial() {
        return nSeguridadSocial;
    }

    public void setnSeguridadSocial(int nSeguridadSocial) {
        this.nSeguridadSocial = nSeguridadSocial;
    }

    //public static void main(String[] args) {
        /*final int TAMAÑO = 10;
        String[] nombres = new String[TAMAÑO];
        int[] nEmpleados = new int[TAMAÑO];
        int[] nSeguridadSocial = new int[TAMAÑO];
        int i;
        for (i = 0; i < TAMAÑO; i++) {
            nombres[i] = "Empleado " + i;
            nEmpleados[i] = i;
            nSeguridadSocial[i] = i;
        }
        System.out.println("¿Qué empleado quieres buscar?");
        int nEmpleado = new Scanner(System.in).nextInt();
        for (i = 0; i < TAMAÑO; i++) {
            if (nEmpleados[i] == nEmpleado) {
                System.out.println("Nombre: " + nombres[i]);
                System.out.println("Número de empleado: " + nEmpleados[i]);
                System.out.println("Número de la seguridad social: " + nSeguridadSocial[i]);
            }
        }

        */



            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                HashMap<String, String> empleados = new HashMap<String, String>();
                String nombre, numEmpleado, numSeguridadSocial;
                int opcion;
                do {
                    System.out.println("1. Añadir empleado");
                    System.out.println("2. Buscar empleado");
                    System.out.println("3. Salir");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("Nombre: ");
                            nombre = sc.next();
                            System.out.println("Número de empleado: ");
                            numEmpleado = sc.next();
                            System.out.println("Número de seguridad social: ");
                            numSeguridadSocial = sc.next();

                            empleados.put(nombre + numEmpleado + numSeguridadSocial, "Nombre:" + nombre + "\nNúmero de Empleado: "+  numEmpleado + "\nNúmero de Seguridad Social: " + numSeguridadSocial);
                            break;
                        case 2:
                            System.out.println("1. Buscar por nombre");
                            System.out.println("2. Buscar por número de empleado");
                            System.out.println("3. Buscar por número de seguridad social");
                            int opcion2;
                            opcion2 = sc.nextInt();
                            switch (opcion2){
                                case 1:
                                    System.out.println("Nombre: ");
                                    nombre = sc.next();
                                    System.out.println(empleados.get(nombre));
                                    break;

                                case 2:
                                    System.out.println("Número de Empleado: ");
                                    numEmpleado = sc.next();
                                    System.out.println(empleados.get(numEmpleado));
                                    break;
                                case 3:
                                    System.out.println("Número de Seguridad Social: ");
                                    numSeguridadSocial = sc.next();
                                    System.out.println(empleados.get(numSeguridadSocial));
                                    break;

                            }

                            break;
                        case 3:
                            System.out.println("Adios");
                            break;
                        default:
                            System.out.println("Opción incorrecta");
                            break;
                    }
                } while (opcion != 3);
            }
        }
