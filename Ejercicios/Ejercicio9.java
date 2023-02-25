import java.util.Scanner;

public class Ejercicio9 {
    /*
    9. Tres en raya
Crear un algoritmo para jugar a tres en raya: en una cuadrícula de tres celdas
por tres, los jugadores se turnan para escribir su símbolo (X y O) en una celda vacía.
El primer jugador que logre alinear (en fila, columna o diagonal) tres de sus símbolos, gana.
     */


    public static void main(String[] args) {
        final int TAMAÑO = 3;
        char[][] tablero = new char[TAMAÑO][TAMAÑO];
        int i, j;
        char jugador = 'X';
        boolean ganador = false;
        for (j = 0; j < TAMAÑO; j++) {
            for (i = 0; i < TAMAÑO; i++) {
                tablero[j][i] = ' ';
            }
        }
        do {
            System.out.println("Turno del jugador " + jugador);
            for (j = 0; j < TAMAÑO; j++) {
                for (i = 0; i < TAMAÑO; i++) {
                    System.out.print(tablero[j][i]);
                    if (i < TAMAÑO - 1) {
                        System.out.print("|");
                    }
                }
                System.out.println();
                if (j < TAMAÑO - 1) {
                    System.out.println("-----");
                }
            }
            System.out.println("¿Qué columna? ⬇");
            i = new Scanner(System.in).nextInt() - 1;
            System.out.println("¿Qué línea? ->");
            j = new Scanner(System.in).nextInt() - 1;
            if (tablero[j][i] == ' ') {
                tablero[j][i] = jugador;
                if (jugador == 'X') {
                    jugador = 'O';
                } else {
                    jugador = 'X';
                }
            } else {
                System.out.println("Esa celda ya está ocupada");
            }
            for (j = 0; j < TAMAÑO; j++) {
                if (tablero[j][0] == tablero[j][1] && tablero[j][1] == tablero[j][2] && tablero[j][0] != ' ') {
                    ganador = true;
                }
            }
            for (i = 0; i < TAMAÑO; i++) {
                if (tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i] && tablero[0][i] != ' ') {
                    ganador = true;
                }
            }
            if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != ' ') {
                ganador = true;
            }
            if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[0][2] != ' ') {
                ganador = true;
            }
        } while (!ganador);
        System.out.println("Ha ganado el jugador " + jugador);
    }
}
