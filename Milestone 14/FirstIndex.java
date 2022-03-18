package girlCodeIt;
import java.util.*;

public class FirstIndex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr = new int[n];
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();

		int ans = firstIndex(arr , 0 , x);
		System.out.println(ans);
		
		
	}
	
	static int firstIndex(int[] arr, int idx, int x){
	
		if(idx == arr.length) {
			return -1;
		}
		
		if(arr[idx] == x) {
			return idx;
		}
		
		
		
		return firstIndex(arr , idx +1 , x);
		
		
	}

}
