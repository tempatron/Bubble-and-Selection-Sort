package com.tempatron;

public class Main {

    public static void main(String[] args) {

        //bubble sort // Quadratic complexity n^2
        int[] num = {23,10,99,01,55,78,-22};

        for(int lastUnsortedIndex = num.length - 1 ; lastUnsortedIndex > 0 ; lastUnsortedIndex --  ){
            for(int i = 0 ; i < lastUnsortedIndex ; i++){
                if(num[i] > num[i+1]){
                    swap(num,i,i+1);
                }
            }
        }

        for(int i = 0 ; i < num.length ; i++){
            System.out.println(num[i]);
        }
    }

    public static void swap(int[] array,int i , int j){
        if(i == j) {
            return;
        }else{
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
