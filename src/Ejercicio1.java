public class Ejercicio1 {
    public static void main(String[] args) {
        int[] vector = new int[100];

        // Bucle para llenar vector
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
        }

        // Ordenar el vector en orden descendente
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] < vector[j]) {
                    int n = vector[i];
                    vector[i] = vector[j];
                    vector[j] = n;
                }
            }
        }

        // Bucle para imprimir en pantalla
        System.out.println("Vector en orden descendente:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}
