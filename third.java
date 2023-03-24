package hw_java3;

import java.util.ArrayList;
import java.util.Collections;

public class third {
    public static void main(String[] args) {
        
        //Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

        int[] nmbrs = { 1, 4, 5, 9, 8, 6, 3, 10 };
        ArrayList<Integer> lst = new ArrayList<Integer>();

        int summa = 0;
        for (int i : nmbrs) {
            lst.add(i);
            summa += i;
        }

        double avrg = summa/lst.size();
        System.out.println("Максимальное число = " + Collections.max(lst));
        System.out.println("Минимальное число = " + Collections.min(lst));
        System.out.println("Среднее значение = " + avrg);

    }

}
