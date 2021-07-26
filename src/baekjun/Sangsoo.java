package baekjun;

public class Sangsoo {
	public static void main(String[] args) {
		
	}
	public static String solution(String n, String r) {
		String answer = "";
		char[] tmp = n.toCharArray();
		char[] tmp2 = r.toCharArray();
		char tmp1 = 'c';
		tmp1 = tmp[0];
		tmp[0] = tmp[2];
		tmp[2] = tmp1;
		
		tmp1 = tmp2[0];
		tmp2[0] = tmp2[2];
		tmp2[2] = tmp1;
		
		if(Integer.parseInt(tmp.toString()) > Integer.parseInt(tmp2.toString())) {
			answer = tmp.toString();
		}else {
			answer = tmp2.toString();
		}
		return answer;
	}
}
