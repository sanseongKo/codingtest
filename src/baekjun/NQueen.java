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
 * 4*4���
 *2 1 1 1
 *1 1 1 2
 *1 2 1 1
 *1 1 2 1    
 *row�� ���ڰ� ���� ��� column�� ���� ���� ��� �밢���� ���(|x1-x2| = |y1-y2|) �� ��� �ش� ĭ�� �� �� ����
 *�ٸ� ó�� ���� ���� �����ϰ� ���� ���̴� �� ���� �� ���Ŀ� ���̴� �� ������ ���ɿ��θ� ��� Ȯ���� ���ΰ�?
*/