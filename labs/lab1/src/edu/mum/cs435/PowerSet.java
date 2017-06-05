package edu.mum.cs435;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ganijon on 6/5/17.
 * I have to improve powerSet to use BitSet, instead of String
 */
public class PowerSet {

    public static void main(String[] args) {

        int S[] = {1, 4, 3};
        int k = 8;

        System.out.println(BruteForce(S, k));
    }

    private static boolean BruteForce(int S[], int k) {

        Set<Set<Integer>> ps = powerSet(S);

        for (Set<Integer> set : ps) {

            int sum = 0;

            for (int i : set)
                sum += i;

            if (sum == k)
                return true;
        }

        return false;
    }

    private static Set<Set<Integer>> powerSet(int[] set) {

        Set<Set<Integer>> power = new HashSet<>();

        int elements = set.length;

        //the number of members of a power set is 2^n
        int powerElements = (int) Math.pow(2, elements);

        for (int i = 0; i < powerElements; i++) {

            String binary = toBinary(i, elements);

            power.add(fromBinary(binary, set));
        }

        return power;
    }

    static Set<Integer> fromBinary(String binary, int[] set) {

        Set<Integer> innerSet = new HashSet<>();

        for (int j = 0; j < binary.length(); j++) {
            if (binary.charAt(j) == '1')
                innerSet.add(set[j]);
        }
        return innerSet;
    }

    static String toBinary(int binary, int digits) {
        String binaryString = Integer.toBinaryString(binary);
        String zeros = "";
        for (int i = binaryString.length(); i < digits; i++) {
            zeros += "0";
        }
        return zeros + binaryString;
    }
}
