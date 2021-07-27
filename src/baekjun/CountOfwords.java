package baekjun;

public class CountOfwords {
	public static void main(String[] args) {
		String n = "The Curious Case of Benjamin Button";
		System.out.println(solution(n));
	}
	public static int solution(String n) {
		int answer = 1;
		char[] arr = n.toCharArray();
		for(int i = 0; i<n.length();i++) {
			if(n.length() == 0) {
				return 0;
			}
			if(arr[i] == ' ') {
				answer++;
			}
		}
		return answer;
	}
}
