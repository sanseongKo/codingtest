package programmers;

public class 연산자끼워넣기 {
	static int[] number;	
	static int[] operator;	
	public static void dfs(int num, int idx) {
		 
		for (int i = 0; i < 4; i++) {
			
			if (operator[i] > 0) {
	        
				operator[i]--;
					
				switch (i) {
				
				case 0 : dfs(num + number[idx], idx + 1); break;
				case 1 : dfs(num - number[idx], idx + 1); break; 
				case 2 : dfs(num * number[idx], idx + 1); break;
				case 3 : dfs(num / number[idx], idx + 1); break;
					
				}
				
				operator[i]++;
			}
		}
	}
}
