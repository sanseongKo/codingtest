package baekjun;

public class Hive {
	public static void main(String[] args) {
		int room = 20;
		System.out.println(solution(room));
	}
	public static int solution(int room) {
		
		if(room == 1) return 1;
		int i = 0;
		int rooms = 1;
		while(room>rooms) {
			i++;
			rooms = rooms + (6*i);
			
		}
		
		return i+1;
	}
}
/*
1 - 1
2~7 - 2 5 6 1, 1 6 1+6*1
8~19 - 3 11 18 3 2, 7 18 7+6*2
20~37 -4 17 36 6 3, 19 36 
38~61 - 5 60 10 4, 37 60  
*/
