package com.xsis.quiz;

public class Logic04 {
    public static void main(String[] args) {
        float arr[] = {2, 5, 3.5f, 10, 6.5f};
        System.out.println("Angka terbesarnya adalah =  " + largest(arr));
    }



    // Method to find maximum in arr[]
    static float largest(float[] arr)
    {
        int i;
        // Initialize maximum element
        float max = arr[0];
        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

}

