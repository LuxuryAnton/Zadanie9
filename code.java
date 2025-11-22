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

ДРУГОЙ CODE



import java.util.Arrays;
       import java.util.Random;
       import java.util.Scanner;
public class MalkovDmitrii59 {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);{
        Random random = new Random();
        
    
        double[] payments = new double[20];
        System.out.println("Сгенерированные платежи для 20 квартир:");
        
        for (int i = 0; i < payments.length; i++) {

            if (random.nextInt(100) < 10) {
                payments[i] = 0;
            } else {
                payments[i] = Math.round(random.nextDouble() * 10000 * 100.0) / 100.0;
            }
            System.out.printf("Квартира %2d: %8.2f руб.\n", (i + 1), payments[i]);
        }
        

        double totalSum = calculateTotalSum(payments);
        System.out.printf("\nОбщая сумма платежей: %.2f руб.\n", totalSum);
        

        int[] unpaidApartments = findUnpaidApartments(payments);
        if (unpaidApartments.length > 0) {
            System.out.println("Квартиры, которые не оплатили: " + Arrays.toString(unpaidApartments));
        } else {
            System.out.println("Все квартиры оплатили коммунальные услуги.");
        }
        
        System.out.print("\nВведите пороговое значение для поиска: ");
        double threshold = scanner.nextDouble();
        
        int[] highPaymentsApartments = findHighPaymentApartments(payments, threshold);
        if (highPaymentsApartments.length > 0) {
            System.out.println("Квартиры с платежами выше " + threshold + " руб.: " + 
                             Arrays.toString(highPaymentsApartments));
        } else {
            System.out.println("Нет квартир с платежами выше " + threshold + " руб.");
        }
        
        scanner.close();
    }
        public static double calculateTotalSum(double[] payments){
        double sum = 0;
        for (double payment : payments) {
            sum += payment;
        }
        return sum;
    }

    public static int[] findUnpaidApartments(double[] payments) {
        int count = 0;
        for (int i = 0; i < payments.length; i++) {
            if (payments[i] == 0) {
                count++;
            }
        }
        
        int[] unpaidApartments = new int[count];
        int index = 0;
        for (int i = 0; i < payments.length; i++) {
            if (payments[i] == 0) {
                unpaidApartments[index] = i + 1;
                index++;
            }
        }
        return unpaidApartments;
    }
    
    public static int[] findHighPaymentApartments(double[] payments, double threshold) {
        int count = 0;
        for (int i = 0; i < payments.length; i++) {
            if (payments[i] > threshold) {
                count++;
            }
        }
        
        int[] highPayments = new int[count];
        int index = 0;
        for (int i = 0; i < payments.length; i++) {
            if (payments[i] > threshold) {
                highPayments[index] = i + 1;
                index++;
            }
        }
        return highPayments;
    }
}
