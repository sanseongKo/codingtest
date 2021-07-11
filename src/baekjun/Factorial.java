package baekjun;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(solve(4));
	}
	static int answer =1;
	public static int solve(int num) {
		
		if(num == 0) {
			return answer;
		}
		answer *= num;
		
		
		
		return solve(num-1);
		
	}
	
}
