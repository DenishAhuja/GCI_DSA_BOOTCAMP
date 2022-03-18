package girlCodeIt;
import java.util.*;

public class DisplayReverseArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr = new int[n];
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		displayArrReverse(arr , n-1);
		
	}
	
	static void displayArrReverse(int[] arr, int idx) {
		if(idx == 0) {
		        	System.out.println(arr[idx]);
		        	return;
		        }
		                System.out.println(arr[idx]);

		        displayArrReverse(arr,idx - 1);

		    }

}
