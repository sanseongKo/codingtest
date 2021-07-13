package baekjun;

public class BreakEvenPoint {
	public static void main(String[] args) {
		int[] expense = {2100000000, 9, 10};
		System.out.println(solution(expense));
	}
	public static int solution(int[] expense) {
		int answer = 0;
		//x*170 -(1000+(70*x))>0
		if(expense[1]>=expense[2]) return -1;
		int i = 0;
		int sum = expense[0];
		while(sum >=0) {
			i++;
			sum += expense[1];//
			sum -= expense[2];
			
			
		}
		
		return i;
	}
}
