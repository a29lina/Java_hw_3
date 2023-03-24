package hw_java3;

import java.util.ArrayList;

public class second {
    public static void main(String[] args) {

        // Пусть дан произвольный список целых чисел, удалить из него чётные числа.

        int[] arr = { 7, 4, 6, 9, 10, 13, 18, 32, 55, 46, 1, 10, 8 };

        ArrayList<Integer> lst = new ArrayList<Integer>();
        
        for (int i : arr) {
            if(i%2==1){
                lst.add(i);
            }
        }

        System.out.println(lst);


    }

}
