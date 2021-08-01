package baekjun;

public class SumOfN {
	public static void main(String[] args) {
		
	}
	public static long sum(int[] n) {
		int answer = 0;
		for(int i: n) {
			answer += i;
		}
		return answer;
	}
}
