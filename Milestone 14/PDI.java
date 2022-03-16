package girlCodeIt;

import java.util.Scanner;

public class PDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		pdi(n);
		
	}

	 static void pdi(int n){
        
        if(n==0) {
        	return;
        }
        
            System.out.println(n);
            pdi(n-1);
            System.out.println(n);


        
        
    }
	
}
