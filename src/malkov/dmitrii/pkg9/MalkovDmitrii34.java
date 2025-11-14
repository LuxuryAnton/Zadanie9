/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malkov.dmitrii.pkg9;

/**
 *
 * @author Student
 */import java.util.Random;
public class MalkovDmitrii34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
         Random random = new Random();
        int[] A = new int[6];
        int count = 0;
        
        System.out.println("Сгенерированный массив:");
        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(201) - 100;
            System.out.print(A[i] + " ");
            
            if (A[i] > 0) {
                count++;
            }
        }
        
        System.out.println("\nКоличество положительных элементов: " + count);
    }
}

