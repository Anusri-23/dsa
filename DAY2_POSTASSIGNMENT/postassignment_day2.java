package dsa;

import java.util.Scanner;

public class postassignment_day2 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array length:");
        int n = s.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        boolean found = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] + a[j] == 8) {
                    System.out.println("TARGET ACQUIRED");
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("TARGET NOT FOUND");
        }
        s.close();
    }
}
