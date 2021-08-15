package toss;

public class Toss3 {
	public static void main(String[] args) {
		String amountText = "100,+300";

System.out.println(solution(amountText));
	}
	public static boolean solution(String amountText) {
        boolean answer = true;
        char[] charr = amountText.toCharArray();
        int k = 0;
        for(int i = charr.length-1; i>=0; i--) {
        	if(charr[i]<48 || charr[i] >57||charr[i] != ',') {
        		k++;
        	}
        	if(charr[i] == ',' && (charr.length-i-k)%4 !=0) {
        		return false;
        	}else if(charr[i] == ',' && i ==0) {
        		return false;
        	}else if(i == 0 && charr[i] == '0') {
        		return false;
        	}
        }
        return answer;
    }
}
