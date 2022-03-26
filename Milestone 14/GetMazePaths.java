package girlCodeIt;

import java.util.*;

public class GetMazePaths {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		ArrayList<String>list = getMazePaths(1,1,n,m);
		System.out.println(list);
		
	}

	
    static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
    	
    	if(dr == sr && dc ==sc) {
    		ArrayList<String>list = new ArrayList<>();
    		
    		list.add("");
    		return list;
    	}
    	ArrayList<String> vpaths = new ArrayList<>();
    	ArrayList<String> hpaths = new ArrayList<>();
    	
    	if(sr < dr) {
    		vpaths = getMazePaths(sr + 1,sc,dr,dc);
    	}
    	
    	if(sc < dc) {
    		hpaths = getMazePaths(sr,sc + 1,dr,dc);
    	}
    	
    	ArrayList<String> mres = new ArrayList<>();
    	
    	for(String c:vpaths) {
    		mres.add("v" + c);
    	}
    	for(String c:hpaths) {
    		mres.add("h" + c);
    	}
    	
    	  	
    	return mres;
    }

    	
}
