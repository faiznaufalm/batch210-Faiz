package com.xsis.quiz;


//jawaban belum sesuai pertanyaan

public class Logic10 {
    public static void main(String[] args) {
        double arr[] = {34.5, 80, 115, 44.5};
        System.out.println("Angka terbesarnya dalam array =  " + largest(arr));
    }



    // Method to find maximum in arr[]
    static double largest(double[] arr)
    {
        int i;
        // Initialize maximum element
        double max = arr[0];
        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

}
