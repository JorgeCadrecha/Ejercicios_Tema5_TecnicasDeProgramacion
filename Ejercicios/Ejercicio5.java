import java.util.Scanner;

public class Ejercicio5 {
    /*
    5. Palíndromo
Un palíndromo es una palabra cuyo orden de letras sigue siendo el mismo si se lee de izquierda a derecha o de derecha a izquierda. Ejemplos: Kayak, Ana, radar, rotor, etc.

Escriba un algoritmo que pida al usuario una palabra sin acento, en minúsculas y seguida de un carácter en particular para indicar el final (# por ejemplo), y que le diga al usuario si esta palabra es un palíndromo.

Ejemplo de ejecución:

Escriba una palabra y después #

kayak#

kayak es un palíndromo
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba una palabra y después # (Si no pone # al final, no funciona))");
        String palabra = teclado.nextLine();
        String palabraSinAcentos = palabra.replaceAll("[áéíóú]", "");
        String palabraSinAcentosYEnMinusculas = palabraSinAcentos.toLowerCase();
        String palabraSinAcentosYEnMinusculasSinUltimoCaracter = palabraSinAcentosYEnMinusculas.substring(0, palabraSinAcentosYEnMinusculas.length() - 1);
        String palabraSinAcentosYEnMinusculasSinUltimoCaracterAlReves = new StringBuilder(palabraSinAcentosYEnMinusculasSinUltimoCaracter).reverse().toString();
        if (palabraSinAcentosYEnMinusculasSinUltimoCaracter.equals(palabraSinAcentosYEnMinusculasSinUltimoCaracterAlReves)) {
            System.out.println(palabra + " es un palíndromo");
        } else {
            System.out.println(palabra + " no es un palíndromo");
        }
    }
}
