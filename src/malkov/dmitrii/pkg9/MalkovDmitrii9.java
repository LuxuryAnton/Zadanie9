/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malkov.dmitrii.pkg9;

/**
 *
 * @author Student
 */
public class MalkovDmitrii9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] array = {3, 7, 2, 9, 4, 8, 5};
        
        System.out.println("Исходный массив:");
        
        int maxIndex = 0;
        int maxValue = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
        
        System.out.println("Максимальный элемент: " + maxValue);
        System.out.println("Индекс максимального элемента: " + maxIndex);
        
        for (int i = maxIndex + 1; i < array.length; i++) {
            array[i] = 0;
        }
        
        System.out.println("Результат:");
    }
    
    }
