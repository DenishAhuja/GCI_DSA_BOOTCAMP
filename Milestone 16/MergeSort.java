package girlCodeIt;

import java.util.*;

public class MergeSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int[]arr = new int[l];
		
		for(int i=0; i<l; i++) {
			arr[i] = sc.nextInt();
		}
		int[]ans = mergeSort(arr);
		System.out.println(Arrays.toString(ans));
		
	}
	
	static int[] mergeSort(int[]arr) {
		
		if(arr.length == 1) {
			return arr;
		}
		
		int mid = arr.length/2;
		
		int[]left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[]right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left , right);
		
	}
	
	static int[]merge(int[]f , int[]s){
		int[]mix = new int[f.length + s.length];
		
		int i = 0;
		int j = 0;
		int k = 0;
				
		while(i < f.length && j < s.length) {
			if(f[i] < s[j]) {
				mix[k] = f[i];
				i++;
			}
			else {
				mix[k] = s[j];
				j++;
			}
			k++;
			
		}
		
		while(i < f.length) {
			mix[k] = f[i];
			i++;
			k++;
		}
		
		while(j < s.length) {
			mix[k] = s[j];
			j++;
			k++;
		}
		
		
		return mix;
	}

}
