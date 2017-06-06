package edu.mum.cs435;

/**
 * Created by john on 6/5/17.
 */
public class Powerset2 {

    public static void main(String[] args) {

        int S[] = {1, 4, 3};
        int k = 6;

        System.out.println(subsetSum(S, k));
    }

    public static boolean subsetSum(int arr[], int k) {

        boolean T[][] = new boolean[arr.length + 1][k + 1];

        for (int i = 0; i <= arr.length; i++) {
            T[i][0] = true;
        }

        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= k; j++) {
                if (j - arr[i - 1] >= 0) {
                    T[i][j] = T[i - 1][j] || T[i - 1][j - arr[i - 1]];
                } else {
                    T[i][j] = T[i - 1][j];
                }
            }
        }
        return T[arr.length][k];

    }
}
