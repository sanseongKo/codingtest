package inflearn;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmail {
	public static void main(String[] args) {
		String S = "John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker";
		String C = "Example";
		System.out.println(solution(S, C));
	}
	 public static String solution(String S, String C) {
	        S = S.toLowerCase();
	        C = C.toLowerCase();
		 	String[] name = S.split("; ");
	        int count = 1;
	        StringBuilder sb = new StringBuilder();
	        String answer = "";
	        Set<String> set = new HashSet<>();
	        
	        for(int i =0; i<name.length; i++) {
	        	String[] tmp = name[i].split(" "); 
	        	for(int j = i+1; j<name.length; j++) {
	        		String[] tmp2 = name[j].split(" ");
	        		if(tmp[0].equals(tmp2[0]) && tmp[tmp.length-1].equals(tmp2[tmp2.length-1])) {
	        			count++;
	        			name[j] += Integer.toString(count);
	        			
	        		}
	        		
	        	}
	        	count = 1;
	        }
	        
	        for(int i=0; i<name.length; i++) {
	        	String noHypen = name[i].replace("-", "");
	        	String[] namePart = noHypen.split(" ");
	        	sb.append(namePart[0]);
        		sb.append(".");
        		set.add(namePart[0]);
	        	if(namePart.length == 3) {
	
	        		sb.append(namePart[2]);
	        		set.add(namePart[2]);
	        		
	        	}
	        	else {
	        		
	        		sb.append(namePart[1]);
	        		set.add(namePart[1]);
	        	
	        	}
	        	sb.append("@"+C + ".com; ");
	        }
	        answer = sb.toString();
	        return answer;
	    }
}
