public class Ejercicio6 {
    /*
    * 6. ¿Qué hace?
¿Qué contiene la tabla generada por el algoritmo siguiente?

Algo QueHace
# ??
Constante TAMAÑO       : entero <- 3
Variable i, j, val: entero
Variable tab2d: entero[TAMAÑO][TAMAÑO]
Inicio
 val <- 1
 Para j <- 0 a TAMAÑO - 1
   Para i <- 0 a TAMAÑO - 1
     tab2d[j][i] <- val
     val <- val + 1
   FPara
 FPara
Fin
Modificar el algoritmo anterior para que la tabla tenga cuatro filas y cuatro columnas con los valores de uno a dieciséis, completando en primer lugar la primera columna, luego la segunda, posteriormente la tercera y por último la cuarta.

 Modificar el algoritmo nuevamente, para tener los siguientes valores en la tabla:

0   1   2   3
1   2   3   4
2   3   4   5
3   4   5   6
    */

    public static void main(String[] args) {
        final int TAMAÑO = 3;
        int i, j , val;
        int[][] tab2d = new int[TAMAÑO][TAMAÑO];
        val = 1;
        for (j = 0; j < TAMAÑO; j++) {
            for (i = 0; i < TAMAÑO; i++) {
                tab2d[j][i] = val;
                val++;
            }
        }
        for (j = 0; j < TAMAÑO; j++) {
            for (i = 0; i < TAMAÑO; i++) {
                System.out.print(tab2d[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println("\n-----Version 2---------\n");

        final int TAMAÑO2 = 4;
        int[][] tab2d2 = new int[TAMAÑO2][TAMAÑO2];
        val = 1;
        for (j = 0; j < TAMAÑO2; j++) {
            for (i = 0; i < TAMAÑO2; i++) {
                tab2d2[j][i] = val;
                val++;
            }
        }
        for (j = 0; j < TAMAÑO2; j++) {
            for (i = 0; i < TAMAÑO2; i++) {
                System.out.print(tab2d2[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println("\n-----Version 3---------\n");

        final int TAMAÑO4 = 4;
        int[][] tab2d4 = new int[TAMAÑO4][TAMAÑO4];
        val = 0;
        for (j = 0; j < TAMAÑO4; j++) {
            for (i = 0; i < TAMAÑO4; i++) {
                tab2d4[j][i] = val;
                val++;
            }
            val = j + 1;
        }
        for (j = 0; j < TAMAÑO4; j++) {
            for (i = 0; i < TAMAÑO4; i++) {
                System.out.print(tab2d4[j][i] + " ");
            }
            System.out.println();
        }

    }
}
