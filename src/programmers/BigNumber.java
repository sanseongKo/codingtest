package programmers;

public class BigNumber {
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		String number="4177252841";
		int k = 4;
		System.out.println(solution(number, k));
	}
	public static String solution(String number, int k) {
        char max = '0';
        int cnt = number.length()-k;
        
        int idx = 0;
        idx = findMax(idx, cnt, number, max);
        
        	
        
        return sb.toString();
    }
	public static int findMax(int idx, int k, String number, char max) {//9 a= 1
		
		max = number.charAt(idx);
		
		for(int a = idx; a<number.length()-k; a++) {
			if(max<number.charAt(a)) {
    			max = number.charAt(a);	
    			idx = a;
    		}	
    	}
		System.out.println("max: "+max);
    	sb.append(max);
    	
    	
    	return findMax(0, 0, number.substring(idx), max);
	}

}
