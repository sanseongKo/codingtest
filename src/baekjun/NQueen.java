package baekjun;

public class NQueen {
	static int[][] board;
	public static void main(String[] args) {
		int n = 3;
		System.out.println(solution(n));
	}
	public static int solution(int n) {
		int answer = 0;
		board = new int[n][n];
		for(int i =0; i<board.length;i++) {
			for(int j = 0; j<board[i].length;j++) {
				
			}
		}
		return answer;
	}
}

/*
 * 4*4라면
 *2 1 1 1
 *1 1 1 2
 *1 2 1 1
 *1 1 2 1    
 *row의 숫자가 같을 경우 column의 수가 같을 경우 대각선일 경우(|x1-x2| = |y1-y2|) 의 경우 해당 칸에 둘 수 없음
 *다만 처음 잡은 곳을 제외하고 직후 놓이는 곳 이후 및 이후에 놓이는 퀸 이후의 가능여부를 어떻게 확인할 것인가?
*/