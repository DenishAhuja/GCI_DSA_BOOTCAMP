package girlCodeIt;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {


		int[]arr = {5,4,3,2,1};
		quick(arr , 0 , arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	static void quick(int[]arr , int low , int high) {
		
		//low and high defines the range on which we are iterating in the array
		
		
		//base condition
		
		if(low >= high)return;
		
		//whereas s and e defines the pointer of the range low to high 
		//which passes through each element in the range of the low to high.
		
		int s = low;
		int e = high;
		
		int m = s + (e-s)/2;
		int pivot = arr[m];
		
		
		while(s <= e) {
			while(arr[s] < pivot) {
				s++;
			}
			while(arr[e] > pivot) {
				e--;
			}
			
			if(s <= e) {
				int temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
				s++;
				e--;
			}
		}
		
		quick(arr , low ,e);
		quick(arr , s ,high);
	}

}
