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
        //���� contains�� Ǭ�ٸ�? ���������
        Set<String> orderSet = new HashSet<String>();
        ArrayList<char[]> orderList = new ArrayList<>();
        //��� ���� ��´�.
        
        for(String order: orders) {
        	char[] orderArr = order.toCharArray();//{A,B,C,F,G}�� ����
        	for(int i = 0; i<course.length; i++) {
            	boolean[] visited = new boolean[orderArr.length];
            	orderSet = combination(orderArr, visited, 0, course[i], 0);
            	
            }
        	
        }
        
        return answer;
    }
	
	
	public static Set<String> combination(char[] orderArr,boolean[] visited, int start, int course, int r) {//{A,B,C,F,G}�� ���� 
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





//����:
//���ĺ� �ߺ� x
//������������ ���� course�迭 2~10
//������������ ���� return
//���� �ֹ��� ���� �ߺ��̸� ��� �迭�� ��� ����


//Ǯ��:
//�켱 ��� ������ �迭�� ������ �Ѵ�.(���)
//������ �־��༭ ���� ��� �ȿ� ī��Ʈ �÷��ֱ�