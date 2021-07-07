package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class MockExam {
	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		int[] tmp = solution(answers);
		for(int i =0; i<tmp.length; i++) {
			System.out.println(tmp[i]);
		}
	}
	public static int[] solution(int[] answers) {
        
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int s1num = 0;
        int s2num = 0;
        int s3num = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i =0; i<answers.length; i++){
            if(s1[i%s1.length] == answers[i]) s1num++;
            if(s2[i%s2.length] == answers[i]) s2num++;
            if(s3[i%s3.length] == answers[i]) s3num++;
        }
        int max = Math.max(Math.max(s1num, s2num), s3num);
        if(max == s1num)list.add(1);
        if(max == s2num)list.add(2);
        if(max == s3num)list.add(3);
        int[] answer = new int[list.size()];
        for(int p =0; p<list.size(); p++) {
        	answer[p] = list.get(p);
        }
        Arrays.sort(answer);
        return answer;
    }
}
