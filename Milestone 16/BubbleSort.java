package girlCodeIt;

import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {

		int[]arr = {4,56,3,67,8,3,1,0};
		bubbleS(arr , arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
	static void bubbleS(int[]arr , int x) {
		
		if (x == 1)
            return;
      
        for (int i=0; i<x-1; i++) {
        	
        	if (arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        	
        }
            
        bubbleS(arr, x-1);
		
	}
}
