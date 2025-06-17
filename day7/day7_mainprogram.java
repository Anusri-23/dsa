package dsa;

import java.util.Scanner;
public class day7_mainprogram {
	
	public class MainProgram {
	    void sort(int[] arr) {
	        for (int i = 1; i < arr.length; i++) {
	            int current = arr[i];
	            int j = i - 1;

	            while (j >= 0 && arr[j] > current) {
	                arr[j + 1] = arr[j];
	                j--;
	            }
	            arr[j + 1] = current;
	        }
	    }

	    void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	Scanner s =new Scanner(System.in);
	    	System.out.println("\n Enter the array length:");
			int size = s.nextInt();
			int a[]=new int[size];
			System.out.println("\n Enter the array elements:");
			for(int i=0;i<size;i++)
			{
				a[i]=s.nextInt();
			}

	        day7_mainprogram sorter = new day7_mainprogram();
	        sorter.sort(a);
	        sorter.printArray(a);
	        s.close();
	    }



	}

	public void sort(int[] a) {
		// TODO Auto-generated method stub
		
	}

	public void printArray(int[] a) {
		// TODO Auto-generated method stub
		
	}

}
