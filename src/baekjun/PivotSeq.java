package baekjun;

public class PivotSeq {
	static int[] tmp;
	public static void main(String[] args) {
		System.out.println(solution(10));
	}
	public static int solution(int n) {
		int answer = 0;
		tmp = new int[n];
		tmp[0]=0; tmp[1]=1;
		sum(2, n-1);
		answer = tmp[n-1];
		return answer;
	}
	public static void sum(int start, int end) {
		if(start == end) return;
		tmp[start] = tmp[start-1]+tmp[start-2];
		sum(start+1, end);
	}
}
