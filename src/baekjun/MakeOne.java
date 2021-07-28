package baekjun;

public class MakeOne {
	public static void main(String[] args) {
		int n = 10;
		System.out.println(solution(n));
	}
	public static int solution(int n) {
		int answer = 0 ;
		int[] arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 0;
		for(int i =2; i<=n;i++) {
			arr[i] = arr[i-1] +1;
			if(i % 3 ==0) arr[i] = Math.min(arr[i], arr[i/3]+1);
			if(i % 2 ==0) arr[i] = Math.min(arr[i], arr[i/2]+1);
		}
		answer = arr[n];
		return answer;
	}
}
