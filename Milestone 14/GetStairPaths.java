package girlCodeIt;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPaths {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<String>list = getStairPaths(n);
		System.out.println(list);
		
		
	}
	
     static ArrayList<String> getStairPaths(int n) {
    	 
    	 if(n == 0) {
    		 ArrayList<String>list = new ArrayList<>();
    		 list.add("");
    		 return list;
    	 }
    	 
    	 if(n < 0) {
    		 ArrayList<String>list = new ArrayList<>();
    		 return list;
    	 }
    	 
    	 ArrayList<String>path1 = getStairPaths(n-1);
    	 ArrayList<String>path2 = getStairPaths(n-2);
    	 ArrayList<String>path3 = getStairPaths(n-3);

    	 ArrayList<String>paths = new ArrayList<>();
    	 
    	 for(String recr : path1) {
    		 paths.add(1 + recr);
    	 }
    	 for(String recr : path2) {
    		 paths.add(2 + recr);
    	 }
    	 for(String recr : path3) {
    		 paths.add(3 + recr);
    	 }

    	 return paths;
    	 
     }


}
