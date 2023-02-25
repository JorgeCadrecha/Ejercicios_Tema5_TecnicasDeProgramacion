import java.util.Scanner;

public class Ejercicio3 {
    /*
    3. Nota media (versión 4)
Producir un algoritmo agregando notas en una tabla. Al final, mostrar todas las calificaciones y su media.

Ejemplo de ejecución del algoritmo:

¿Nota?

12

¿Nota?

15

¿Nota?

8

¿Nota?

7

¿Nota?

-1

La media de las notas (12; 15; 8; 7) es 10,5.
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] tabla = new int[10];
        int valor=0;
        int suma = 0;
        int contador = 0;
        do {
            System.out.println("¿Nota? (-1 para terminar))");
            valor = teclado.nextInt();
            if (valor >= 0 ) {
                tabla[contador] = valor;
                suma += valor;
                contador++;
            }
        } while (valor != -1);
        System.out.print("La media de las notas (");

        for (int i = 0; i < contador; i++) {
            System.out.print(tabla[i]);
            if (i < contador - 1) {
                System.out.print("; ");
            }
        }
        System.out.println(") es " + (double) suma / contador);
    }
}
