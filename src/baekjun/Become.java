package baekjun;

public class Become {
	public static void main(String[] args) {
		int k = 2;
		int n = 3;
		System.out.println(solution(k, n));
	}
	public static int solution(int k , int n) {
		int answer = 0;
		if(n == 1) return 1;
		int[] arr = new int[n];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = i+1;
		}//0類縑憮曖 餌塋熱菟
		if(k == 0) return arr[n-1];
		for(int j = 1; j<=k;j++) {
			for(int i = 1; i<arr.length; i++) {
				arr[i] = arr[i-1]+arr[i];
			}
		}
		
		return answer = arr[n-1];
	}
	
}
//1 4 10 20 35 -> 2類 3 6 10 15
//1 3 6 10 15 -> 1類 2 3 4 5
//1 2 3 4 5 -> 0類


