package baekjun;

public class Assignment {
	public static void main(String[] args) {
		int[][] scores = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
		System.out.println(solution(scores));
	}
	public static String solution(int[][] scores) {
        String answer = "";
        char[] tmp = new char[scores.length];
        StringBuilder sb = new StringBuilder();
        double sum = 0;
        for(int i = 0 ; i<scores.length; i++) {
        	for(int j = 0; j<scores.length; j++) {
        		if(i != j) {
        			sum += scores[i][j];
        			System.out.println(sum);
        		}
        	}
        	if(sum/(scores.length-1)>=90) {
        		tmp[i] = 'A';
        	}else if(sum/(scores.length-1)<90 && sum/(scores.length-1) >=80) {
        		tmp[i] = 'B';
        	}else if(sum/(scores.length-1)<80 && sum/(scores.length-1) >=70) {
        		tmp[i] = 'C';
        	}else if(sum/(scores.length-1)<70 && sum/(scores.length-1) >=60) {
        		tmp[i] = 'D';
        	}else if(sum/(scores.length-1)<60) {
        		tmp[i] = 'F';
        	}
        	sum = 0;
        }
        for(char i : tmp) {
        	sb.append(i);
        }
        answer = sb.toString();
        return answer;
    }
}
