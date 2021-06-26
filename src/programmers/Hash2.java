package programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hash2 {
	public static void main(String[] args) {
		String[] pb = {"119", "97674223", "1195524421"};
		System.out.println(solution(pb));
	}
	//해시에 담긴걸 자신은 빼고 확인해줘야함
	public static boolean solution(String[] phoneBook) {
		
		Map<String, Integer> map = new HashMap<>(); 
		Set<String> hashSet = new HashSet<String>();
	       for(int i=0; i<phoneBook.length-1; i++) {
	            for(int j=i+1; j<phoneBook.length; j++) {
	                if(phoneBook[i].startsWith(phoneBook[j])) {return false;}
	                if(phoneBook[j].startsWith(phoneBook[i])) {return false;}
	            }
	        }
	        return true;
	    }
}
