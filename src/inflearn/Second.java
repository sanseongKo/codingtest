package inflearn;

public class Second {
	 
	
	public static void main(String[] args) {
		int N = 56;
		System.out.println(solution(N));
	}
	public static int solution(int N) {
        int answer = 0;
        String tmp = Integer.toString(N);
        char[] ch = tmp.toCharArray();
        int[] temp = new int[ch.length];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<ch.length; i++) {
        	temp[i] = (int)ch[i];
        	
        }
        for(int i=0; i<temp.length-1; i++) {
        	temp[temp.length-1] +=1;
        	for(int j = 0; j<temp.length-1; j++) {
        	if(temp[j] == temp[j+1]) {
        		temp[j+1] += 1;
        	}
        	}
        }
        for(int i = 0; i<temp.length; i++) {
        	ch[i] = (char)temp[i];
        	sb.append(ch[i]);
        }
        String tmp1 = sb.toString();
        
        answer = Integer.parseInt(tmp1);
		return answer;
    }
}
