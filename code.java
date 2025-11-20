package MalkovDmitriiZadanie9Razdel1;

/**
 *
 * @author Student
 */
import java.util.Random;
public class code {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int[][] matrix = new int[9][9];
        Random random = new Random();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = random.nextInt(31) + 19;
            }
        }
        
        System.out.println("Матрица 10x8:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        
        int[] minInColumns = new int[9];
        for (int j = 0; j < 9; j++) {
            int min = matrix[0][j];
            for (int i = 1; i < 9; i++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            minInColumns[j] = min;
        }
        
        int maxOfMin = minInColumns[0];
        for (int j = 1; j < 9; j++) {
            if (minInColumns[j] > maxOfMin) {
                maxOfMin = minInColumns[j];
            }
        }
        
        System.out.println("\nМинимальные элементы в столбцах:");
        for (int j = 0; j < 9; j++) {
            System.out.printf("Столбец %d: %d\n", j + 1, minInColumns[j]);
        }
        
        System.out.printf("\nМаксимальный из минимальных элементов: %d\n", maxOfMin);
    }
}
