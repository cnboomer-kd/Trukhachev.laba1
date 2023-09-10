package ru.mirea.uibo02.trukhachev;

import java.util.Arrays;
import java.util.Random;

public class main {
    public static void main(String[] args)
    {
        tsk3(args);
        tsk4(args);
        tsk5(args);
        tsk6(args);
    }

    public static void tsk3(String[] args)
    {
        int[] data = {0, 1, 2, 3, 4, 5};
        int sum = 0;
        for(int i = 0; i < data.length; i++)
        {
            sum += data[i];
        }
        System.out.println("summa for = " + sum);

        int[] data1 = {0, 1, 2, 3, 4, 5};
        int sum1 = 0;
        int a = 0;
        while(a < data1.length)
        {
            sum1 += data1[a];
            a++;
        }
        System.out.println("summa while = " + sum1);

        int[] data2 = {0, 1, 2, 3, 4, 5};
        int sum2 = 0;
        int b = 0;
        do
        {
            sum2 += data2[b];
            b++;
        }
        while
        (
                b < data2.length
        );
        System.out.println("summa do while = " + sum2);
    }

    public static void tsk4(String[] args)
    {
        for (int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }
    }

    public static void tsk5(String[] args)
    {
        int n = 10;
        double sum = 0.0;

        for (int i = 1; i <= n; i++)
        {
            sum += 1.0 / i;
            System.out.printf("%.2f ", sum);
        }
        System.out.println();
    }

    public static void tsk6(String[] args)
    {
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Generated array: ");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted by math: ");
        System.out.println(Arrays.toString(array));
    }
}
