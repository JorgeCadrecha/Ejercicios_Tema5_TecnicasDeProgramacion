import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {

    private HashMap<String, Empleado> tablaNombres;
    private HashMap<Integer, Empleado> tablaNumerosEmpleado;
    private HashMap<Integer, Empleado> tablaNumerosSeguridadSocial;

    public Ejercicio10() {
        tablaNombres = new HashMap<>();
        tablaNumerosEmpleado = new HashMap<>();
        tablaNumerosSeguridadSocial = new HashMap<>();
    }

    public void agregarEmpleado(String nombre, int numeroEmpleado, int numeroSeguridadSocial) {
        Empleado empleado = new Empleado(nombre, numeroEmpleado, numeroSeguridadSocial);
        tablaNombres.put(nombre, empleado);
        tablaNumerosEmpleado.put(numeroEmpleado, empleado);
        tablaNumerosSeguridadSocial.put(numeroSeguridadSocial, empleado);
    }

    public Empleado buscarPorNombre(String nombre) {
        return tablaNombres.get(nombre);
    }

    public Empleado buscarPorNumeroEmpleado(int numeroEmpleado) {
        return tablaNumerosEmpleado.get(numeroEmpleado);
    }

    public Empleado buscarPorNumeroSeguridadSocial(int numeroSeguridadSocial) {
        return tablaNumerosSeguridadSocial.get(numeroSeguridadSocial);
    }

    private class Empleado {
        private String nombre;
        private int numeroEmpleado;
        private int numeroSeguridadSocial;

        public Empleado(String nombre, int numeroEmpleado, int numeroSeguridadSocial) {
            this.nombre = nombre;
            this.numeroEmpleado = numeroEmpleado;
            this.numeroSeguridadSocial = numeroSeguridadSocial;
        }

        public String getNombre() {
            return nombre;
        }

        public int getNumeroEmpleado() {
            return numeroEmpleado;
        }

        public int getNumeroSeguridadSocial() {
            return numeroSeguridadSocial;
        }
    }

    public static void main(String[] args) {
        Ejercicio10 registro = new Ejercicio10();
        Scanner sc = new Scanner(System.in);

        String nombre;
        int numEmpleado, numSeguridadSocial;
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
                    numEmpleado = sc.nextInt();
                    System.out.println("Número de seguridad social: ");
                    numSeguridadSocial = sc.nextInt();

                    registro.agregarEmpleado(nombre,numEmpleado,numSeguridadSocial);
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
                            Empleado empleado = registro.buscarPorNombre(nombre);
                            System.out.println("Empleado encontrado por nombre: " + empleado.getNombre() + ", " + empleado.getNumeroEmpleado() + ", " + empleado.getNumeroSeguridadSocial());

                            break;

                        case 2:
                            System.out.println("Número de Empleado: ");
                            numEmpleado = sc.nextInt();
                            empleado = registro.buscarPorNumeroEmpleado(numEmpleado);
                            System.out.println("Empleado encontrado por número de empleado: " + empleado.getNombre() + ", " + empleado.getNumeroEmpleado() + ", " + empleado.getNumeroSeguridadSocial());
                            break;
                        case 3:
                            System.out.println("Número de Seguridad Social: ");
                            numSeguridadSocial = sc.nextInt();
                            empleado = registro.buscarPorNumeroSeguridadSocial(numSeguridadSocial);
                            System.out.println("Empleado encontrado por número de seguridad social: " + empleado.getNombre() + ", " + empleado.getNumeroEmpleado() + ", " + empleado.getNumeroSeguridadSocial());

                            break;
                        default:
                            System.out.println("Opción incorrecta");
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

