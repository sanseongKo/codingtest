package programmers;

public class Greedy1 {
	public static void main(String[] args) {
		int n = 3;
		int[] lost = {3};
		int[] reserve = {1};
		System.out.println(solution(n, lost, reserve));
	}
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int count = 0;
		boolean[] flag = new boolean[n+1];
		for(int i=0; i<flag.length; i++) {
			
		}
		for(int i = 0; i<lost.length; i++) {
			flag[lost[i]] = true;
		
		}//lost 숫자에 트루로(true가 잃어비림)
		for(int i =0; i<reserve.length; i++) {
			
			if(reserve[i] != 0 && flag[reserve[i]-1] != false && flag[reserve[i]-1] == true) {
				flag[reserve[i]-1] = false;
			
				continue;
			}
			
			if(reserve[i] != n && flag[reserve[i]+1] == true ) {
				flag[reserve[i]+1] = false;
				continue;
			}
		}
		for(int i =1; i<flag.length; i++) {
				
			
			if(flag[i] == false) {
				
				count++;
			}
		}
		answer = count;
		return answer;
	}

}
