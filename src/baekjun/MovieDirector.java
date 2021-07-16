package baekjun;

public class MovieDirector {
	public static void main(String[] args) {
		int n = 1;
		System.out.println(solution(n));
	}
	public static int solution(int n) {
		int answer = 0;
		StringBuilder sb = new StringBuilder();
		String sub = "666";
		if(n == 1)return 666;
		sb.append(Integer.toString(n-1));
		System.out.println(sb.toString());
		sb.append(sub);
		answer = Integer.parseInt(sb.toString());
		return answer;
	}
}
