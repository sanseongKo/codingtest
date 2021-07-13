package baekjun;

public class Snail {
	public static void main(String[] args) {
		int[] move = {100, 99, 1000000000};
		System.out.println(solution(move));
	}
	public static int solution(int[] move) {
		int moving = move[0];
		int sleep = move[1];
		int height = move[2];
		int day = 1;
		int sum = 0;
		while(true) {
			sum += moving;
			
			
			if(height <= sum) return day;
			sum -= sleep;
			day++;
		}
		
	}
}
//2 1 3 2 4 3 5;