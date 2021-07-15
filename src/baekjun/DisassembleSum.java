package baekjun;

public class DisassembleSum {
	public static void main(String[] args) {
		int n = 216;
		System.out.println(solution(n));
		//216-27 
	}
	public static int solution(int n) {
		int answer = 0;
		String str = Integer.toString(n);
		int min = 9*str.length();
		for(int i = n-min;i<=n;i++) {
			str = Integer.toString(i);
			int disSum = i;
			int k = i;
			for(int  j = 0; j<str.length();j++) {
				
				disSum += k%10;

				k = k/10;

			}
			
			if(disSum == n)return i;
		}
		return answer;
	}
	
}
