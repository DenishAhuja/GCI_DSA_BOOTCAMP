package girlCodeIt;

import java.util.Scanner;

public class Power_log {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		
		System.out.println(power(x,n));
		
	}
	
	static int power(int x , int n) {
		
		if(n == 0) {
			return 1;
		}
		int xn2 = power(x , n/2);
		int xn = xn2 * xn2;
		
		if(n % 2 == 1) {
			xn *= x;
		}
				
		return xn;
		
	}

}
