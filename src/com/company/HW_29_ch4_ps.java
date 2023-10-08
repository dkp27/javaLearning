package com.company;

public class HW_29_ch4_ps {
    public static void main(String[] args) {

        // Problem 1
        /*

         float [] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
         float sum = 0;
        for (float element:marks) {
            sum = sum+element;
        }
            System.out.println(sum);
        */

        // Problem 2
        /*
        float [] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
        float num =99.5f;
        boolean isInArray = false;
        for (float element : marks){
            if (num==element){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("The value is present in the array");
        }
        else {
            System.out.println("The value is not present in the array");
        }
     */

        // Problem 3
      /*
        float [] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
        float sum = 0;
        for (float element:marks) {
            sum = sum+element;
        }
        System.out.println(sum);
        System.out.println(sum/marks.length);
        */

        // Problem 4
         /*
        int [][] mat1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int [][] mat2 = {{2, 6, 13},
                         {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};
         for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
        System.out.println("");
        }
          */

        // Problem 5
           /*
        int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;

        for (int i=0;i<n;i++){
            // swap a[i] and a[l-1-i]
            //a b temp
            // |4| |3| ||
            temp = arr[i];
            arr[i]= arr[l-1-i];
            arr[l-1-i] =temp;
        }
        for (int element:arr){
            System.out.println(element);
        }
          */

        // Problem 6
/*
        int [] arr = {1,2,300,4,5555,6};
        int max = 0;  // ( Integer.MIN_VALUE/Integer.MAX_VALUE = 0)
        for (int e:arr){
            if (e>max){
                max = e;
            }
        }
        System.out.println("The value of the maximum element in this array is :" + max);
*/
// Problem 7
        /*
        int [] arr = {1,2,300,4,-5555,-6};
        int min = Integer.MAX_VALUE;
        for (int e:arr){
            if (e<min){
                min = e;
            }
        }
        System.out.println("The value of the maximum element is :" + min);
*/
// Problem 7
        boolean isSorted = true;
        int [] arr = {1, 1, 3, 4, 5, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }

    }
}
