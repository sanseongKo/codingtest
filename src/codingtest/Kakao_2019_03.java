package codingtest;

import java.util.HashSet;

public class Kakao_2019_03 {
	static StringBuilder sb = new StringBuilder();
	static HashSet<String> set = new HashSet<String>();
	public static void main(String[] args) {
		String[][] relation =  {{"100","ryan","music","2"},
								{"200","apeach","math","2"},
								{"300","tube","computer","3"},
								{"400","con","computer","4"},
								{"500","muzi","music","3"},
								{"600","apeach","music","2"}};
		System.out.println(solution(relation));
	}
	public static int solution(String[][] relation) {
        int answer = 0;
        String[] tmp= new String[relation.length];
      
        boolean flag = true;
        
        //relation[0][0] [1][0] [2][0]
        for(int i =0; i<relation[i].length;i++) {
        	for(int j = 0; j<relation.length; j++) {
        		flag = check(relation[j][i], tmp);
        		if(!flag) {
        			break;
        		}else {
        			tmp[j] = relation[j][i];
        			
        		}
        		
        	}
        	
        	if(flag == true) {
        		for(int j = 0; j<tmp.length;j++) {
        			set.add(tmp[j]);
        		}
        	answer++;
        	}
        }
        
        	
        return answer;
    }
	public static boolean check(String relation, String[] tmp) {
		boolean result = true;
			for(int i = 0 ;i<tmp.length;i++) {
				if(tmp[i].equals(relation)) {
					return result = false;
				}
			}
		
		return result;
	}
	public static String builder(String[][] relation) {
		String result = "";
		for(int i =0; i<relation.length;i++) {
			for(int j =0; j<relation[i].length;j++) {
				if(set.contains(relation[i][j])) {
					break;
				}else {
					sb.append(relation[i][j]);
				}
			}
			
		}
		return result;
	}
}
//중복제거 여러개일경우도 가능