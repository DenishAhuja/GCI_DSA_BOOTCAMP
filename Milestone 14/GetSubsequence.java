package girlCodeIt;
import java.util.*;

public class GetSubsequence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		ArrayList<String> list = gss(str);
		
		System.out.println(list);
		
	}

	static ArrayList<String> gss(String str) {
		
		if(str.isEmpty()) {
			ArrayList<String>list = new ArrayList<>();
			list.add(str);
			return list;
		}
		
		char ch = str.charAt(0);
		
		ArrayList<String>recr = gss(str.substring(1));
		
		
		ArrayList<String>mres = new ArrayList<>();
		
		for(String check : recr) {
			mres.add(check);
		}
		for(String check : recr) {
			mres.add(ch + check);
		}
		
		return mres;
	}
	
	
}
