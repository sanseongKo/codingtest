package codingtest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Kakao_2021_02 {
	static Set<String> orderSet = new HashSet<String>(); 
		public static void main(String[] args) {
			String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
			int[] course = {2,3,4};
			System.out.println(solution(orders, course));
		}
	public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        //만약 contains로 푼다면? 콘테인즈로
        Set<String> orderSet = new HashSet<String>();
        ArrayList<char[]> orderList = new ArrayList<>();
        //모든 것을 담는다.
        
        for(String order: orders) {
        	char[] orderArr = order.toCharArray();//{A,B,C,F,G}가 담기고
        	for(int i = 0; i<course.length; i++) {
            	boolean[] visited = new boolean[orderArr.length];
            	orderSet = combination(orderArr, visited, 0, course[i], 0);
            	
            }
        	
        }
        
        return answer;
    }
	
	
	public static Set<String> combination(char[] orderArr,boolean[] visited, int start, int course, int r) {//{A,B,C,F,G}가 담기고 
		StringBuilder sb = new StringBuilder();
		sb.append(orderArr[start]);
		System.out.println(sb.toString());
		if(r==course) {
			orderSet.add(sb.toString());
			System.out.println(orderSet);
			return orderSet;
		}
		if(start == orderArr.length) {
			return orderSet;
		}else {
			for(int i = start; i< orderArr.length; i++) {
				visited[i] = true;
				combination(orderArr, visited, start+1, course, r+1);
				visited[i] = false;
			}
		}
		
		
		
		
		return orderSet;
	}
}





//조건:
//알파벳 중복 x
//오름차순으로 정렬 course배열 2~10
//오름차순으로 정렬 return
//많이 주문된 것이 중복이면 모두 배열에 담아 리턴


//풀이:
//우선 모든 조합을 배열에 담아줘야 한다.(재귀)
//맵으로 넣어줘서 같을 경우 안에 카운트 늘려주기