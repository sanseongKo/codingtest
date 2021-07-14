package baekjun;

public class BlackJack {
	public static void main(String[] args) {
		int m = 500;
		int[] cards = {93, 181, 245, 214, 315, 36, 185, 138, 216, 295};
		System.out.println(solution(m, cards));
	}
	public static int solution(int m, int[] cards) {
		int answer = 0;
		int min = m;
		int sum = 0;
		int tmp = 0;
		int currentNum = 0;
		for(int i =0; i<cards.length-2;i++) {
			for(int j = i+1; j<cards.length-1;j++) {
				for(int k = j+1; k<cards.length;k++) {
					sum = cards[i]+cards[j]+cards[k];
					tmp = Math.abs(m-sum);
					if(tmp<min) {
						min = tmp;
						currentNum = sum;
					}
				}
			}
		}
		answer = currentNum;
		return answer;
	}
}
