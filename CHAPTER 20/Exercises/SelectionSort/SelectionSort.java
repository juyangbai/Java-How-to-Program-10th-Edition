package JuyangBai.Java;

import java.security.SecureRandom;
import java.util.Arrays;

public class SelectionSort {

    // Sort Method
    public static <T> void selectionSort(T[] data)
    {
        for (int i = 0; i < data.length; i++)
        {
            int smallest = i;
            for (int index = i + 1; index < data.length; index++)
            {
                if(data[smallest] == minimum(data[smallest], data[index]))
                    smallest = smallest;
                else
                    smallest = index;
            }

            swap(data, i, smallest);
/*            printPass(data,i + 1, smallest);*/
        }
    }

    private static <T> T minimum(T datum, T datum1) {
        T min = datum;
        if(datum.toString().compareTo(datum1.toString()) < 0)
            return datum;
        else
            return datum1;
    }

/*    // Comparator
    private static <T extends Comparable<T>> T minimum(T x, T y)
    {
        T min = x;
        if(y.compareTo(x) < 0)
            min = y;
        return min;
    }*/

    // Swap method
    private static <T> void swap(T[] data, int first, int second)
    {
        T temp = data[first];
        data[first] = data[second];
        data[second] = temp;
    }

    // Print method
    private static <T> void printPass(T[] data, int pass, int index)
    {
        System.out.printf("after pass %2d: ", pass);
        for (int i = 0; i < index; i++)
            System.out.printf("%d   ", data[i]);


        System.out.printf("%d*  ", data[index]);
        for (int i = 0; i < data.length; i++)
            System.out.printf("%d   ", data[i]);

        System.out.printf("%n              ");
        for (int j = 0; j < pass; j++)
            System.out.print("--    ");
        System.out.println();
    }

    public static void main(String[] args) {
        // write your code here
/*        SecureRandom generator = new SecureRandom();*/
/*        Integer[] data = new Integer[10];  //create array
        for(int i = 0; i < data.length; i++)
            data[i] = 10 + generator.nextInt(90);   //populate array*/

        Double[] data1 = new Double[10];
        for(int i = 0; i < data1.length; i++)
            data1[i] = 10 + Math.random() * (20 - 10);

        System.out.printf("Unsorted array: %n%s%n%n", Arrays.toString(data1)); //display array

        selectionSort(data1);
        System.out.printf("Sorted array: %n%s%n%n", Arrays.toString(data1)); //display array
    }
}
