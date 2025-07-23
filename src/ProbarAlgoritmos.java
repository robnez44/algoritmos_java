import sorting.Sorting;

import java.util.Arrays;

import static searching.Searching.*;
import static sorting.Sorting.*;

public class ProbarAlgoritmos {
    public static void main(String[] args) {

        int[] data = {7, 3, 9, 1, 4};
        int target = 9;

        // sequential search
        int indexSeq = sequentialSearch(data, target);
        System.out.println("Sequential: index = " + indexSeq);

        // binary search
        bubbleSort(data); // sort with bubble sort before binary search
        int indexBin = binarySearch(data, target);
        System.out.println("Binary: index = " + indexBin);
        System.out.println();

        // bubble sort
        System.out.print("Numbers with Bubble Sort: ");
        for (int number : data){
            System.out.print(number + " ");
        }
        System.out.println();

        // selection sort
        data = new int[]{9, 2, 3, 1, 7, 5, 11};
        selectionSort(data);
        System.out.print("Numbers with Selection Sort: ");
        for (int number : data){
            System.out.print(number + " ");
        }
        System.out.println();

        // insertion sort
        data = new int[]{40, 20, 70, 10, 30, 10, 90};
        insertionSort(data);
        System.out.print("Numbers with Insertion Sort: ");
        for (int number : data){
            System.out.print(number + " ");
        }
    }
}