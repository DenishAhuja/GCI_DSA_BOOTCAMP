package girlCodeIt;
import java.util.*;

public class PrintDecreasing {

	public static void main(String[] args) {

//		Milestone 17(a)
//		q1
		
		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        printDecreasing(n);
	    }

	    public static void printDecreasing(int n){
	        
	        //base condition
	        
	        if(n==1){
	            System.out.println(1);
	            return;
	        }
	        
	        else{
	            System.out.println(n);
	            printDecreasing(n-1);
	        }
	        
	    }

	}