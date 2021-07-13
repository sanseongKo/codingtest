package codingtest;

public class Kakao_2019_04 {
	public static void main(String[] args) {
		int[] food_times = {3, 1, 2};
		long k = 5;
		System.out.println(solution(food_times, k));
	}
	public static int solution(int[] food_times, long k) {
        
        int index = 0;
        long time = 0;
        while(true) {
        	time += 1;
        	if(time == k) {
        		return index;
        	}
        	food_times[index] = food_times[index]-1;
        	if(index == food_times.length-1) {
        		index = 0 ;
        	}else {
        		index += 1;
            }
        	
        }
        
    }
}
