package baekjun;

public class FindFraction {
	public static void main(String[] args) {
		int number = 14;
		System.out.println(solution(number));
	}
	public static String solution(int number) {
		String answer = "";
		if(number == 1)return "1/1";
		int i = 1; 
		int j = 2;
		int count = 2;
		while(true) {
		if(i == 1) {
			while(j > 1) {
				i++;//2, 2 , 3 , 4
				j--;//1, 3 , 2 , 1
				count++;//3, 6, 7, 8
				System.out.println("i: "+i +" j: "+j+" count: "+ count);
				if(count == number) return answer = Integer.toString(i) +"/"+Integer.toString(j);
			}
			i++;
			count++;
			System.out.println("i: "+i);
			
		}else if(j ==1){
			while(i>1) {
				j++;//2, 3, 2
				i--;//2, 1, 4
				count++;//4, 5 
				System.out.println("i: "+i +" j: "+j+" count: "+ count);
				if(count == number) return answer = Integer.toString(i) +"/"+Integer.toString(j);
			}
			j++;
			count++;
			System.out.println("j: "+j);
		}
		
		
		}
		
	}
}
//1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2
