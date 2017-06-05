package edu.mum.cs435;

public class Main {

    static int[] sort(int[] A) {

        int zeros = 0;
        int ones = 0;
        int twos = 0;

        for (int i = 0; i < A.length; i++) {

            if (A[i] == 0)
                zeros++;
            else if (A[i] == 1)
                ones++;
            else
                twos++;
        }


        for (int i = 0; i < zeros; i++)
            A[i] = 0;

        for (int i = zeros; i < zeros + ones; i++)
            A[i] = 1;

        for (int i = zeros + ones; i < A.length; i++)
            A[i] = 2;

        return A;
    }

    public static void main(String[] args) {

        int[] A = {2, 1, 0, 1, 2, 1, 2, 1, 0, 1};

        for (int i : sort(A))
            System.out.println(i);

    }
}
