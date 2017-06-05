package edu.mum.cs435;

public class Main {

    public static void main(String[] args) {
        System.out.println(gcd(9, 6));
    }

    public static int gcd(int m, int n) {

        int min = m < n ? m : n;

        for (int i = min; i >= 1; i--) {

            if (m % i == 0 && n % i == 0)
                return i;
        }

        return 0;
    }
}
