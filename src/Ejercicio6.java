import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        
        // Llenar la matriz
        System.out.println("Ingresa los valores para llenar la matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        
        // Imprimir la matriz
        System.out.println("El cuadrado ingresado es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }
        
        // Verificar si es un cuadrado mágico
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            int sumaColumna = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
                if (i == j) {
                    sumaDiagonal1 += matriz[i][j];
                }
                if (i == 2 - j) {
                    sumaDiagonal2 += matriz[i][j];
                }
            }
            if (sumaFila != sumaColumna) {
                System.out.println("No es un cuadrado magico.");
                return;
            }
        }
        if (sumaDiagonal1 != sumaDiagonal2) {
            System.out.println("No es un cuadrado magico.");
            return;
        }
        System.out.println("Es un cuadrado mágico.");
    }

}

