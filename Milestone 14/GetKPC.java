package girlCodeIt;
import java.util.*;

public class GetKPC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		ArrayList<String>list = getKPC(str);
		System.out.println(list);
		
	}
	
	static String[]arr = {".;" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz"}; 
	
	static ArrayList<String> getKPC(String str) {
		
		if(str.isEmpty()) {
			ArrayList<String>list = new ArrayList<>();
			list.add(str);
			return list;
		}
		
		char ch = str.charAt(0);
		String rem = str.substring(1);
		
		ArrayList<String>recr = getKPC(rem);
		
		ArrayList<String>mres = new ArrayList<>();
		
		String subarr = arr[ch - '0'];
		
		for(int i=0; i<subarr.length(); i++) {
			char chsubarr = subarr.charAt(i);
			
			for(String x: recr) {
				mres.add(chsubarr + x);
			}
		}
		
		
		
		return mres;
		
	}

}
