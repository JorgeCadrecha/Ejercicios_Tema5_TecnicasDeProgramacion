import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    /*
    8. Micro guerra de barcos
Realizar un algoritmo que permita jugar a los barcos con las siguientes simplificaciones:

Solo hay un jugador.

Solo hay cuatro filas y cuatro columnas.

Solo hay un barco que ocupa una única celda (este espacio se elige al azar).

Ejemplo de ejecución:

????

????

????

????

¿Qué columna? 2

¿Qué línea? 2

Agua

????

?~??

????

????

¿Qué columna? 4

¿Qué línea? 1

Agua

??~

?~??

????

????

¿Qué columna? 1

¿Qué línea? 3

Tocado y hundido

Ha ganado
     */

    public static void main(String[] args) {
        final int TAMAÑO = 4;
        int[][] tab2d = new int[TAMAÑO][TAMAÑO];
        int i, j, val, col, lin;
        int[] barco = new int[2];
        boolean tocado = false;
        Random random = new Random();
        barco[0] = random.nextInt(TAMAÑO);
        barco[1] = random.nextInt(TAMAÑO);

        for (j = 0; j < TAMAÑO; j++) {
            for (i = 0; i < TAMAÑO; i++) {
                tab2d[j][i] = 0;
            }
        }
        do {
            for (j = 0; j < TAMAÑO; j++) {
                for (i = 0; i < TAMAÑO; i++) {
                    val = tab2d[j][i];
                    if (val == 0) {
                        System.out.print("?");
                    } else if (val == 1) {
                        System.out.print("~");
                    }
                    if (i < TAMAÑO - 1) {
                        System.out.print("|");
                    }
                }
                System.out.println();
                if (j < TAMAÑO - 1) {
                    System.out.println("-----");
                }
            }
            //que aparezcan los que ya has seleccionado




            System.out.println("¿Qué columna? ");
            col = new Scanner(System.in).nextInt();
            System.out.println("¿Qué línea? ");
            lin = new Scanner(System.in).nextInt();
            if (barco[0] == col && barco[1] == lin) {
                System.out.println("Tocado y hundido");
                tocado = true;
            } else {
                System.out.println("Agua");
            }
        } while (!tocado);
        System.out.println("Ha ganado");
    }
}
