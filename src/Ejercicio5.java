import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        Random num = new Random();

        // Generar una matriz aleatoria de 4x4
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = num.nextInt(10);
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }

        // Calcular la transpuesta de la matriz
        int[][] transpuesta = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }

        // Mostrar la matriz transpuesta
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(transpuesta[i][j] + "|");
            }
            System.out.println();
        }

        // Comprobar si la matriz es antisimétrica
        boolean Antisimetrica = true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] != -transpuesta[j][i]) {
                    Antisimetrica = false;
                    break;
                }
            }
            if (!Antisimetrica) {
                break;
            }
        }

        // Mostrar el resultado
        if (Antisimetrica) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }
}
