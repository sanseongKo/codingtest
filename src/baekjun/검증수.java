package baekjun;

public class °ËÁõ¼ö {
	public static void main(String[] args) {
		int check = 3;
		System.out.println(solution(check));
	}
	public static int solution(int check) {
		int answer = 0;
		System.out.println(check);
		String num = Integer.toString(check);
		int sum = 0;
		
		for(int i =0; i<num.length();i++) {
			sum += num.indexOf(i)*num.indexOf(i);
			System.out.println(sum);
			System.out.println(Math.pow(check, 2));
			
		}
		return answer = sum%10;
	}
}
