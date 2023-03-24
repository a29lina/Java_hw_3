package hw_java3;

import java.util.Arrays;

public class first {
    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 2, 5, 6, 8, 21, 56, 23, 18};

        for (int i = 0; i < arr.length - 1; i++) {
            int minP = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if ((arr[j]) < (arr[minP])) minP = j;
                }
                int temp = arr[i];
                arr[i] = arr[minP];
                arr[minP] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }


}