package com.company;

public class Main {

    public static boolean isPrime(int n) {
        for (int i = 2; i < 10; i++)

            if ((n % i == 0) && (n != i))
                return false;
        return true;
    }
    public static void main(String[] args) {
        for (int n = 2; n < 101; n++)
            if (isPrime(n))
                System.out.print(n + " ");
    }
}
