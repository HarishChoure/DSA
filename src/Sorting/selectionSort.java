package Sorting;

import java.util.*;

public class selectionSort {

    public static int[] selectionSortArray(int[] arr){
        int minIndex = 0;
        for(int i  = 0 ; i<arr.length; i++){
            minIndex = i;
            for(int j = i ; j<arr.length; j++){
                if(arr[j]< arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String args[]){
        int[] arr = {12,-9,5,4,78,6,-3};
        selectionSortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
