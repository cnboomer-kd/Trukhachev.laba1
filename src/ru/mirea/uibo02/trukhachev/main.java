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
        System.out.println("summa = " + data);

        int[] data1 = {0, 1, 2, 3, 4, 5};
        int sum1 = 0;
        int a = 0;
        while(i < data1.length)
        {
            sum += data1[i];
            a++;
        }
        System.out.println("summa = " + data1);
    }
}
