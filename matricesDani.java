// VERSION 1.0 de AITOR

import java.util.Scanner;

public class matricesDani {
    public static void main(String[] args) {
        // VERSION 1.0 de AITOR

        int filas = 2;
        int columnas = 4;
        int[][] matriz = new int[filas][columnas];

        int filas1 = 2;
        int columnas2 = 4;
        int[][] matriz2 = new int[][]{new int[filas1]};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce los valores de la matriz:");

        // Recorremos las filas
        for (int j = 0; j < filas; j++) {
            // Recorremos las columnas de la fila actual
            for (int i = 0; i < columnas; i++) {
                System.out.print("Valor para la posición [" + j + "][" + i + "]: ");
                matriz[j][i] = scanner.nextInt();
            }
        }

        System.out.println("Matriz introducida por el usuario:");

        // Recorremos las filas
        for (int j = 0; j < filas; j++) {
            // Recorremos las columnas de la fila actual
            for (int i = 0; i < columnas; i++) {
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.println();
        }
    }
}