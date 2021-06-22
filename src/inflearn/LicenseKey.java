package inflearn;

public class LicenseKey {
	public static void main(String[] args) {
		String s = "8-5g-3-J";
		int k = 4;
		System.out.println(solution(s, k));
	}
	public static String solution(String s, int k) {
		String answer = "";
		String tmp ="";
		tmp = s.toUpperCase();
		tmp = tmp.replace("-", "");
		StringBuilder sb = new StringBuilder(tmp);//8F3Z2E9W	0 1 2 3 "4" 4 5 6 7
		System.out.println(sb.toString());
		for(int i =sb.length()-k; i>0; i=i-k) {
			sb.insert(i, "-");
		}
		answer = sb.toString();
		return answer;
	}
}
