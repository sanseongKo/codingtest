package codingtest;

public class Kakao_2021_01 {
	public static void main(String[] args) {
		System.out.println(solution("123_.def"));
		
	}
	public static String solution(String new_id) {
        String answer = "";
        String id = new_id.toLowerCase();
        answer = delete(id);
        answer = overlap(answer);
       
        answer = first_last_dot_delete(answer);
        System.out.println(answer);
        if(answer.isEmpty()) {
        	answer = "a";
        }
        
        answer = deleteOver15(answer);
        
        if(answer.length()<3) {
        	char[] a = answer.toCharArray();
        	if(answer.length() == 1) {
        		for(int i = 0; i<2; i++) {
        			answer += a[0];
        		}
        		
        	}
        	if(answer.length() == 2) {
        		answer += a[1];
        	}
        }
       
        return answer;
    }
	public static String delete(String id) {
		String result = "";
		char[] n = id.toCharArray();
		for(int i =0; i<id.length(); i++) {
        	if(n[i]>= 'a' && n[i] <='z' || n[i]>= '0' && n[i] <= '9' || n[i]=='.' || n[i]=='-' || n[i]=='_') {
        		result += n[i];
        	}
        }
		return result;
	}
	public static String overlap(String id) {
		String result = "";
		char[] n = id.toCharArray();
		for(int i =0; i<id.length(); i++) {
        	if(n[i] == '.') {
        		
        		if( i-1 >=0&& n[i-1] == '.') {
        			
        			continue;
        		}
        		
        		result += '.';
        	}else {
        		result += n[i];
        	}
        }
		return result;
	}
	public static String first_last_dot_delete(String id) {
		String result = "";
		char[] n = id.toCharArray();
		System.out.println("here"+id);
		
		if(n[0] == '.' && n[id.length()-1] == '.') {
			for(int i = 1; i<id.length()-1; i++ ) {
				result += n[i];
			}
			return result;
		}
		if(n[0] == '.') {
			for(int i = 1; i<id.length(); i++ ) {
				 result += n[i];
			}
			return result;
		}
		if(n[id.length()-1] =='.') {
			for(int i = 0; i<id.length()-1; i++ ) {
				result += n[i];
			}
			return result;
		}else {
			result = id;
		}
		
		return result;
	}
	public static String deleteOver15(String id) {
		String result ="";
		char[] n = id.toCharArray();
		
		if(id.length() > 15) {
			for(int i =0; i<15; i++) {
			result += n[i];
			}
		}else {
			result = id;
		}
		result = first_last_dot_delete(result);
		
		return result;
	}
	
   



}
//1. �ƽ�Ű 
//2. ���� ���� ���� ���� -,_,.����
//3. equals �ݺ�
//4. ���� �� . -> ����
//5. if empty -> a
//6. 15�̻��� ��� 15���� ��� ���� �� 4�� Ȯ��
//7. 2�� ���� �ϰ�� ������ ���� �ݺ� 3�ڰ� �ɶ�����.