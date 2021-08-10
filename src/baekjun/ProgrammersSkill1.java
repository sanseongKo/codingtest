package baekjun;

public class ProgrammersSkill1 {
	public static void main(String[] args) {
		String s = "\"try hello world\"";
		System.out.println(solution(s));
	}
	public static String solution(String s) {
        String answer = "";
        char[] charr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < charr.length; i++) {
        	if((i+1)%2 == 0) {
        		charr[i] = (char) (charr[i] - 32);
        	}
        }
        for(int i = 0 ; i<charr.length; i++) {
        	sb.append(charr[i]);
        }
        answer = sb.toString();
        return answer;
    }
}
