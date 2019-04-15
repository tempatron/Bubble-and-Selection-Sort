package com.tempatron;

public class Main {

    public static void main(String[] args) {

        //bubble sort // Quadratic complexity n^2
        int[] num = { 64, 34, 25, 12, 22, 11, 90 };

        for(int lastUnsortedIndex = num.length - 1 ; lastUnsortedIndex > 0 ; lastUnsortedIndex --  ){
            for(int i = 0 ; i < lastUnsortedIndex ; i++){
                if(num[i] > num[i+1]){
                    swap(num,i,i+1);
                }
            }
        }

        printArray(num);

        int[] num1 = { 64, 34, 25, 12, 22, 11, 90 };

        for(int lastUnsortedIndex = num1.length - 1 ; lastUnsortedIndex > 0 ; lastUnsortedIndex --) {
            int largest = 0;
            for(int i = 1 ; i <= lastUnsortedIndex ; i++ ){
                if(num1[i] > num1[largest]){
                    largest = i;
                }
            }
            swap(num1,lastUnsortedIndex,largest);
        }

        printArray(num1);
    }

  private static void swap(int[] array,int i , int j){
        if(i == j) {

        }else{
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
