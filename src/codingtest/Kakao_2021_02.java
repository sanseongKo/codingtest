package codingtest;

import java.util.HashMap;

public class Kakao_2021_02 {
	public static void main(String[] args) {
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = {2,3,4};
		String[] answer = solution(orders, course);
		for(int i =0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}
	public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        for(int i =0; i<orders.length; i++) {
        	for(int j = 0; j<course.length; j++) {
        		cal(orders[j], course[i]);
        	}
        }
        return answer;
    }
	
	
	public static String cal(String orders, int course) {
		String result = orders;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		if(result.length() >= course) {
			
		}
		
		return result;
	}
}

//각 orders의 나올수 있는 모든 경우의 수를 arraylist에 담고, 처음부터 비교