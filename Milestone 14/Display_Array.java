package girlCodeIt;

import java.util.Scanner;

public class Display_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr = new int[n];
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		displayArr(arr , n-1);
	}
	
	static void displayArr(int[] arr, int idx){
        if(idx == 0) {
        	System.out.println(arr[idx]);
        	return;
        }
        
        displayArr(arr,idx - 1);
        System.out.println(arr[idx]);
    }

}
