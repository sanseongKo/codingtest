package baekjun;

public class Wine {
	public static void main(String[] args) {
		int[] n = {6, 10, 13, 9, 8, 1};
		System.out.println(solution(n));
	}
	public static int solution(int[] n) {
		int answer=0;
		int[] dp = new int[n.length+1];
		int[] arr = new int[n.length+1];
		for(int i = 1; i<=n.length;i++) {
			arr[i] = n[i-1];
		}
		dp[1] = arr[1];
		dp[2] = arr[1]+arr[2];
		for (int i = 3; i <= n.length; i++) {
			dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]));

		}
		answer = dp[n.length];
		return answer;
	}
}
