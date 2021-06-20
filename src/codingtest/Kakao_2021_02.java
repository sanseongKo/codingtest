package codingtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Stack;

public class Kakao_2021_02 {
	public static void main(String[] args) {
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = {2,3,4};
		String[] answer = solution(orders, course);
		for(int i =0 ; i<answer.length; i++) {
		System.out.println(answer[i]);
		}
		
	}
	public static String[] solution(String[] orders, int[] course) {
       Stack<String> stack = new Stack<String>();
        ArrayList<String> array = new ArrayList<String>();
        for(int i =0; i<orders.length; i++) {
        	for(int j = 0; j<course.length; j++) {
        		stack = cal(orders[i], course[j]);
        		for(int k=0; k<stack.size(); k++) {
        		array.add(stack.pop());
        		}
        	}
        }
        String[] answer = new String[array.size()];
        for(int i=0; i<array.size(); i++) {
        	answer[i] = array.get(i);
        }
       
        return answer;
    }
	
	
	public static Stack<String> cal(String orders, int course) {
		String result = orders;
		String str ="";
		char[] ch = orders.toCharArray();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Stack<String> stack = new Stack<>();
		if(result.length() >= course) {
			for(int i =0; i<ch.length; i++) {
				str += ch[i];
				
				for(int j = i+1; j<orders.length(); j++) {
					if(str.equals("")) {
						str += ch[i];
					}
					str += ch[j];
					
					if(str.length() == course) {
						if(map.get(str) != null) {
							map.put(str, map.get(str)+1);
						}else {
						map.put(str, 1);
						}
						str = "";
					}
					//ch[0]+ch[1], ch[0]+ch[2] ... ch[0], ch[ch.length-1]
				}
			}
		}
		
		for(Entry<String, Integer> elem : map.entrySet()) {
			Integer maxValue = Collections.max(map.values());
			 if(map.get(elem.getKey()) == maxValue){
				
				stack.add(elem.getKey());
				System.out.println("!: " +stack.peek());
			}
		}
		
		return stack;
	}
}


//1. ���� �� �ִ� ����� ���� ��� ������
//2. hashmap�� �ְ� Ű�� ���� �־� �ΰ� Ű���� ���� ��� ��簪�� 1������Ű��
//3. �̺κ��� ����, �־���� �ؽ����� ���ڿ� ���̺��� ���� ���� ���� ������ �Ѵ�. 

//�� orders�� ���ü� �ִ� ��� ����� ���� arraylist�� ���, ó������ ��