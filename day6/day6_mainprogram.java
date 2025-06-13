package dsa;

import java.util.Arrays;
public class day6_mainprogram {
	int []arr=new int[5];
	int rear;
	int front;
	public day6_mainprogram () {
		rear=-1;
		front=-1;
	}
	public void enqueue(int num)
	{
		if(rear==4)
		{
			System.out.println("Empty queue");
		}
		else
		{
			arr[++front]=0;
		}
	}
	public void display() {
		System.out.println(Arrays.toString(arr));
	
			
		}
		
		}
	
	
	
	


