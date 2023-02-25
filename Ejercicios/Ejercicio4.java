import java.util.Scanner;

public class Ejercicio4 {
    /*
    4. Máquina de votar
Cree un algoritmo que pida a los usuarios que voten (los usuarios se turnarán para usar su máquina de votación). Se proponen varios candidatos. Al final del día, el presidente de la mesa de votación introduce un código especial para finalizar la votación (68753421) y se muestran los resultados. Eso sí, este ejercicio es teórico, ya que la seguridad no está garantizada y un usuario puede votar varias veces...

Ejemplo de ejecución del algoritmo:

Elija entre:

1 - Emilia TERREROS

2 - Gerardo ESCODAR

3 - María AGUAVIVA

4 - Nadia LETUX

4

ha votado

Elija entre:

1 - Emilia TERREROS

2 - Gerardo ESCODAR

3 - María AGUAVIVA

4 - Nadia LETUX

1

ha votado

Elija entre:

1 - Emilia TERREROS

2 - Gerardo ESCODAR

3 - María AGUAVIVA

4 - Nadia LETUX

3

ha votado

Elija entre:

1 - Emilia TERREROS

2 - Gerardo ESCODAR

3 - María AGUAVIVA

4 - Nadia LETUX

4

ha votado

Elija entre:

1 - Emilia TERREROS

2 - Gerardo ESCODAR

3 - María AGUAVIVA

4 - Nadia LETUX

3

ha votado

Elija entre:

1 - Emilia TERREROS

2 - Gerardo ESCODAR

3 - María AGUAVIVA

4 - Nadia LETUX

4

ha votado

Elija entre:

1 - Emilia TERREROS

2 - Gerardo ESCODAR

3 - María AGUAVIVA

4 - Nadia LETUX

4

ha votado

Elija entre:

1 - Emilia TERREROS

2 - Gerardo ESCODAR

3 - María AGUAVIVA

4 - Nadia LETUX

68753421

Resultados:

Emilia TERREROS: 14,29 %

Gerardo ESCODAR: 0,00 %

María AGUAVIVA: 28,57 %

Nadia LETUX: 57,14 %
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] votos = new int[4];
        int opcion = 0;
        do {
            System.out.println("Elija entre:");
            System.out.println("1 - Emilia TERREROS");
            System.out.println("2 - Gerardo ESCODAR");
            System.out.println("3 - María AGUAVIVA");
            System.out.println("4 - Nadia LETUX");
            System.out.println("5 - Salir");
            opcion = teclado.nextInt();
            if (opcion < 5 && opcion > 0) {
                System.out.println("ha votado\n");
            }
            if (opcion >= 1 && opcion <= 4) {
                votos[opcion - 1]++;
            }
        } while (opcion != 5);
        System.out.println("Resultados:");
        System.out.println("Emilia TERREROS: " + votos[0] * 100.0 / (votos[0] + votos[1] + votos[2] + votos[3]) + " %");
        System.out.println("Gerardo ESCODAR: " + votos[1] * 100.0 / (votos[0] + votos[1] + votos[2] + votos[3]) + " %");
        System.out.println("María AGUAVIVA: " + votos[2] * 100.0 / (votos[0] + votos[1] + votos[2] + votos[3]) + " %");
        System.out.println("Nadia LETUX: " + votos[3] * 100.0 / (votos[0] + votos[1] + votos[2] + votos[3]) + " %");
    }
}
