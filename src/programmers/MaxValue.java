package programmers;

import java.util.Arrays;

public class MaxValue {
	public static void main(String[] args) {
		int[] numbers = {6, 10, 2};
		System.out.println(solution(numbers));
	}
	

	public static String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        
        for(int i =0; i<numbers.length; i++) {
        	arr[i] = String.valueOf(numbers[i]);
        }
        
//        Arrays.sort(arr, new Comparator<String>() {
//        	@Override
//        	public int compare(String o1, String o2) {
//        		return ((o2+o1).compareTo(o1+o2));//String���� o2+o1�� o1+o2���� ũ�� ����1 ������ 0 �ƴϸ� -1 ex)610 > 106 return 1 �׷� �ڸ��ٲ�
//        	}
//        });
        Arrays.sort(arr, (o1,o2) -> (o2+o1).compareTo(o1+o2));
        
        if(arr[0].equals("0")) {
        	return "0";
        }
        for(String s:arr) {
        	answer += s;
        }
        return answer;
    }

}
