package baekjun;

public class OctalToBinary {
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		System.out.println(solution(314));
	}
	public static int solution(int num) {
		int answer = 0;
		String str = Integer.toBinaryString(num);
		
		return Integer.parseInt(str);
	}
	
}

//8 -> 1000 
//10 ->001000 