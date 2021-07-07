package programmers;

public class Joystick {
	public static void main(String[] args) {
		String name = "JAZ"; 
		System.out.println(solution(name));
	}		
	public static int solution(String name) {
        int answer = 0;
        char[] arr = name.toCharArray();
        char[] arr2 = name.toCharArray();
        int tmp = 0;
        int tmp2 = 0;
        if(arr.equals(arr2))return answer;
        
        
        for(int i =0; i<arr.length;i++) {//65~90  65 66 25
        	arr[i] = 'A';
        	tmp = (int)arr2[i] - (int)arr[i];        	
        	tmp2 = 26 - tmp;
        	if(tmp2<0)tmp2 = tmp2*-1;
        	if(tmp>tmp2) {
        		answer +=tmp2;
        	}else {
        		answer+=tmp;
        	}
        }
        answer += min(name);
        return answer;
    }
	
	public static int min(String name) {
		int result = 0;
		
		return result;
	}
	
}
