/*
 * 10. Registro de Empleados
Los empleados de una cierta compañía se representan en la base de datos de la compañía por su nombre,número de empleado y número de la seguridad social.Construir una estructura de tablas hash que permita acceder al registro de un empleado por cualquiera de estos tres datos.(Nota:No se dispone de memoria suficiente para duplicar los registros de los empleados).

 */

import java.util.*;

public class Ejercicio10 {
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
                    empleados.put(nombre, numEmpleado + " " + numSeguridadSocial);
                    break;
                case 2:
                    System.out.println("Nombre: ");
                    nombre = sc.next();
                    System.out.println(empleados.get(nombre));
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