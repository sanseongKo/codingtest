package baekjun;

public class BytonicSequence {
	public static void main(String[] args) {
		int[] n = {1, 5, 2, 1, 4, 3, 4, 5, 2, 1};
		System.out.println(solution(n));
	}
	public static int solution(int[] n) {
		int[] seq = new int[n.length];
		int[] seq2 = new int[n.length];
		int count = 0;
		for(int i = 0; i<n.length;i++) {
			seq[i] = dp1(n, i);
		}
		for(int i= n.length -1 ; i>=0;i--) {
			seq2[i] = dp2(n, i);
		}
		for(int i = 0; i<seq.length;i++) {
			seq[i] = seq[i]+seq2[i];
			if(i>0) {
				count = Math.max(seq[i], seq[i-1]);
			}
		}
		return count;
	}
	public static int dp1(int[] n, int end) {
		int count =0;
		for(int i =0; i<=end; i++) {
			if(i == 0) {
				count++;
			}else if(n[i]>n[i-1]){
				count++;
			}
			
		}
		return count;
	}
	public static int dp2(int[] n, int end) {
		int count =0;
		for(int i = n.length-1; i>=end; i--) {
			if(i == 0) return count;
			if(n[i]<n[i-1]) {
				count++;
			}
			
		}
		return count;
	}

}

//하나를 삼고 그보다 큰수, 그다음수보다 큰수를 찾는 거하나, 작은거 찾는거하나 
