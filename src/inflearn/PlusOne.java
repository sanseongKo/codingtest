package inflearn;

public class PlusOne {
	
	public static void main(String[] args) {
		int[] digits = {1,9,9};
		int[] result = solution(digits);
		for(int i=0; i<result.length; i++) {
		System.out.println(result[i]);
		}
	}
	
	public static int[] solution(int[] digits) {
		
		for(int i = digits.length-1; i>=0 ;i--) {
			digits[i]++;
			
			if(digits[i]<10) {
				return digits;
			}
			
			digits[i] = 0;
			
		}
		int[] tmp = new int[digits.length + 1];
		tmp[0] = 1;
		for(int i=0; i<digits.length; i++) {
			tmp[i+1] = digits[i];
		}
		return tmp;
	}
	
}
