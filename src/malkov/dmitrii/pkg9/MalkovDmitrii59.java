/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malkov.dmitrii.pkg9;

/**
 *
 * @author Student
 */import java.util.Arrays;
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

