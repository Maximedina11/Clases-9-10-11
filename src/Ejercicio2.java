import java.util.Scanner;
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random num = new Random();

        // Pedir el tamaño del vector
        System.out.print("Introduce el tamaño del vector: ");
        int N = leer.nextInt();

        // Crea el vector y se rellena con numeros aleatorios
        int[] vector = new int[N];
        for (int i = 0; i < N; i++) {
            vector[i] = num.nextInt(10);
        }

        // Mostrar el vector
        System.out.print("El vector es: ");
        for (int i = 0; i < N; i++) {
            System.out.print(vector[i] + "|");
        }
        System.out.println();

        // Pedir el número a buscar
        System.out.print("Introduce el número a buscar: ");
        int numero = leer.nextInt();

        // Buscar el número en el vector y contar cuántas veces se encuentra en cada posición
        boolean repetido = false;
        int pos = -1;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (vector[i] == numero) {
                repetido = true;
                count++;
                if (pos == -1) {
                    pos = i;
                }
            }
            if (vector[i] == numero) {
                System.out.println("El número " + numero + " se encuentra en la posición " + i + " del vector.");
            }
        }

        // Mostrar el resultado de la búsqueda
        if (repetido) {

            System.out.println("El número " + numero + " se encuentra repetido " + count + " veces en el vector.");
        } else {
            System.out.println("El número " + numero + " no se encuentra en el vector.");
        }
    }
}
