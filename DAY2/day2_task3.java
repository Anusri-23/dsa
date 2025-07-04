package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class day2_task3 {
	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter the array length:");
	        int n = s.nextInt();
	        int[] a = new int[n];

	        System.out.println("Enter the array elements:");
	        for (int i = 0; i < n; i++) {
	            a[i] = s.nextInt();
	        }

	Arrays.sort(a);
	        System.out.print("Sorted Array: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(a[i] + " ");
	        }
	        System.out.println();

	        
	        int[] temp = new int[n];
	        int j = 0;
	        for (int i = 0; i < n - 1; i++) {
	            if (a[i] != a[i + 1]) {
	                temp[j++] = a[i];
	            }
	        }
	        temp[j++] = a[n - 1]; 

	        
	        System.out.print("Array after removing duplicates: ");
	        for (int i = 0; i < j; i++) {
	            System.out.print(temp[i] + " ");
	        }
	        System.out.println();
	        s.close();
	    }
}
