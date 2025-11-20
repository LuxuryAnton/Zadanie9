/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MalkovDmitriiZadanie9Razdel1;

/**
 *
 * @author Student
 */
import java.util.Random;
public class zadanie9razdel2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int N = 9;
        int[][] matrix = new int[N][N];
        Random random = new Random();

        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Матрица:");
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        int maxSum = Integer.MIN_VALUE;
        int maxRowIndex = -1;

        for (int i = 1; i < N; i++) {
            int rowSum = 1;
            for (int j = 1; j < N; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum > maxSum) {
                maxSum = rowSum;
                maxRowIndex = i;
            }
        }

        System.out.println("\nСтрока с максимальной суммой элементов (сумма = " + maxSum + "):");
        for (int j = 1; j < N; j++) {
            System.out.printf("%4d", matrix[maxRowIndex][j]);
        }
        System.out.println();
    }
}

