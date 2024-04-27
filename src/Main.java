import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Importamos la clase scanner para ingresar datos del usuario
        Scanner s = new Scanner(System.in);


        // Le pedimos al usuario que nos diga cuantos numeros quiere ingresar
        System.out.println("¿Cuántos números quieres ingresar?");
        int tamanioArreglo = s.nextInt();

        //Declaramos un arreglo que contendrá como máximo 100 numeros
        int[] numeros = new int[tamanioArreglo];

        // Usamos un ciclo for para rellenar nuestro arreglo
        for(int i = 0; i < tamanioArreglo; i++){
            System.out.println("Número " + (i + 1) + ":");
            numeros[i] = s.nextInt();
        }
        System.out.println("Valores ingresados correctamente");

        //Declaramos una variable posicion que nos indicara en que posicion del indice se encuentra el numero y una variable que nos inidica si se encontró la condicion
        int posicion = 0;
        boolean encontrado = false;

        // Usamos un ciclo for para comprobar si el número par está en una posición de índice par, debes detener la iteración.
        for (int numero: numeros) {
            if(numero % 2 == 0 && posicion % 2 == 0){
                System.out.println("El número: " + numero + " está en la posición: " + posicion + ", por lo que cumple las condiciones");
                encontrado = true;
                break;
            }
            posicion += 1;
        }

        // En caso de que no se haya encontrado ningún valor, le haremos saber al usuario
        if(!encontrado){
            System.out.println("No se encontró ningún valor que cumpla la condición: 'Número par que está en una posición de índice par'");
        }
    }
}