import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random num = new Random();

        // Rellenar la matriz con valores aleatorios de 0 a 10
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = num.nextInt(10);
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }

        // Calcular la matriz traspuesta 
        int[][] matrizTraspuesta = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTraspuesta[j][i] = matriz[i][j];
            }
        }

        //Mostrar la matriz transpuesta
        System.out.println("Matriz traspuesta:");
        for (int i = 0; i < matrizTraspuesta.length; i++) {
            for (int j = 0; j < matrizTraspuesta[i].length; j++) {
                System.out.print(matrizTraspuesta[i][j] + "|");
            }
            System.out.println();
        }
    }
}
 