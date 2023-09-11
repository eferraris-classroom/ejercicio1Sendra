
/*
1. Hacer un programa que calcule el promedio de los números pasados por argumento a través de la consola, y lo muestre por la pantalla.
 */

package ar.edu.undef.fie;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No proporcionó elementos");
            return;
        }

        System.out.println("Ingresó los siguientes argumentos: ");
        for (String argumento : args) {
            System.out.print(argumento + " ");
        }

        int cantidad = 0;

        int suma = 0;

        for (String argumento : args){
            int numero = Integer.parseInt(argumento);
            cantidad++;
            suma += numero;
        }
        float promedio = (float) suma / cantidad;

        System.out.println(" ");
        System.out.println("El promedio de los valores ingresados como argumentos es de: " + promedio);
    }
}


