package girlCodeIt;
import java.util.*;

public class MaxofAnArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[]arr = new int[n];
			
			for(int i=0; i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
	        
		int ans = maxOfArray(arr , 0);
		System.out.println(ans);
	}

     static int maxOfArray(int[] arr, int idx){
    	 
    	 if(idx == arr.length-1) {
    		 return arr[idx];
    	 }
    	 
    	 int maxInsubArray = maxOfArray(arr, idx + 1);
    	 
    	 if(arr[idx] > maxInsubArray) {
    		 return arr[idx];
    	 }else {
    		 return maxInsubArray;
    	 }
    	 
     }


	
   
}
