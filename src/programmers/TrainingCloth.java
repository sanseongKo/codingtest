package programmers;

public class TrainingCloth {
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] tmp = new int[n];
        for(int i = 0; i<lost.length; i++) {
        	tmp[lost[i]-1] -=1;   
        }
        for(int i = 0; i<reserve.length; i++) {
        	tmp[reserve[i]-1] +=1;//
        }
        for(int i =0; i<n; i++) {
        	if(i == 0&&tmp[i] == -1&&tmp[i+1] == 1) {//
        		tmp[i] = 0;
        		tmp[i+1] = 0;
        		continue;
        	}
        	if(tmp[i] == -1) {
        		if(i != 0&&tmp[i-1] == 1) {
        			tmp[i] = 0;
        			tmp[i-1] =0;
        		}else if(i != n-1&&tmp[i+1] == 1) {
        			tmp[i] = 0;
        			tmp[i+1] = 0;
        		}
        	}
        }
        for(int i =0 ;i<n; i++) {
        	if(tmp[i]==0||tmp[i]==1) {
        		answer++;
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		int n = 5;  
		int[] lost = {2,4};   
		int[] reserve = {3};
		System.out.println(solution(n, lost, reserve));
	}
}
