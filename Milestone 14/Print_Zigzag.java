package girlCodeIt;

import java.util.Scanner;

public class Print_Zigzag {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		pzz(n);
		
	}
	
	static void pzz(int n){
        
		if(n == 1) {
			System.out.print(111);
			return;
		}
		
		System.out.print(n+" ");
		pzz(n-1);
		System.out.print(n+" ");
		pzz(n-1);
		System.out.print(n+" ");
		
		
	}

}
