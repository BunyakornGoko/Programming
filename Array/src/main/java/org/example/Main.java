package org.example;
import array.*;

import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Print_array();
        Loop_array();
        Loop_array2d();
    }

    public static void Print_array() {
        int[] x = {1, 4, 3};
        System.out.println(Arrays.toString(x));
    }

    public static void Loop_array() {
        int[] a = {1, 4, 3};
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.println(a[i]);
        }
        System.out.println("---------------------");
    }

    public static void Loop_array2d() {
        int[][] x = {{1, 2, 3}, {4, 5, 6}, {7, 8}};
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.println(x[i][j]);
            }
        }
    }
}