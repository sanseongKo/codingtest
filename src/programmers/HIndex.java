package programmers;

import java.util.Arrays;

public class HIndex {
	public static void main(String[] args) {
		int[] citations = {2,2,2,2,2};
		System.out.println(solution(citations));
	}
	public static int solution(int[] citations) {
        int answer = 0;
        int h = citations.length;
        Arrays.sort(citations);
        for(int i =0; i<citations.length; i++){
        	if(citations[i] >= h) {
        		return answer = h;
        	}
        	h--;
        }
        return answer;
        
    }
}

//h���ο�� h���̻� h == h
//�������� h���� �׷� �ִ밪�� h

