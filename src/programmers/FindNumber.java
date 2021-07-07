package programmers;

import java.util.HashSet;

public class FindNumber {
	private static int cnt = 0;
	private static String[] map;
	private static String[] result;
	private static boolean[] visit;
	private static HashSet<Integer> set;
	public static void main(String[] args) {
		String numbers= "17";
		System.out.println("sol: "+solution(numbers));
	}
	public static int solution(String numbers) {
        int answer = 0;
        
        visit = new boolean[numbers.length()];
        map = new String[numbers.length()];
        map = numbers.split("");
        
        set = new HashSet<>();
        
        for(int i =1; i<=numbers.length(); i++) {
        result = new String[i];
        	cycle(0, i, numbers.length());
        }
        
        return answer = set.size();
    }
	
	public static void cycle(int start, int end, int length) {
		
		if(start == end) {
			findPrime();
		}else {
			for(int i =0; i<length; i++) {
				if(!visit[i]) {
					visit[i] = true;
					result[start] = map[i]; // map: [1,7]
					System.out.print("start: "+ start+" map: "+map[i]+" ");
					System.out.println("result: "+result[start]);
					cycle(start+1, end, length);
					visit[i] = false;
				}
			}
		}
	}
	public static void findPrime() {
		String str = "";
		for(int i = 0; i<result.length; i++) str+= result[i];
		
		System.out.println("str: "+str);
		int num = Integer.parseInt(str);
		
		if(num == 1 || num == 0) {
			return;
		}
		boolean flag = false;
		for(int i = 2; i<Math.sqrt(num); i++) {
			if(num % i ==0) {
				flag = true;
			}
		}
		if(!flag)set.add(num);//7, 
	}
}
