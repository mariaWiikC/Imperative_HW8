package com.company;

public class Main
{

    public static void main(String[] args)
    {
        // ex 1
        int value = 1;
        for (int a = 1; a <= 1; a++)
        {
            value = value * 3;
        }
        System.out.println(value);

        // ex 2
        int a = 0; // nonnegative int
        int b = 2; // int
        int p = 1;
        int result = 1;
        while (p <= a)
        {
            result = result * b;

            p++;
        }
        System.out.println(result);
    }
}
