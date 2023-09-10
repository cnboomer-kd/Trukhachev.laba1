package ru.mirea.uibo02.trukhachev;

public class main {
    public static void main(String[] args)
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
}
