package baekjun;

public class Wheight {
	public static void main(String[] args) {
		int[][] volumes = {{55,185}, {58,183},{88,186},{60,175},{46, 155}};
		int[] tmp = solution(volumes);
		for(int i =0;i<tmp.length;i++) {
			System.out.println(tmp[i]);
		}
	}
	public static int[] solution(int[][] volumes) {
		int[] answer = new int[volumes.length];
		
		for(int i = 0; i<volumes.length; i++) {
			int rank = 1;
			for(int j =0; j<volumes.length;j++) {
				if(volumes[i][0]>volumes[j][0]&&volumes[i][1]>volumes[j][1]) {
					
				}
				else if(volumes[i][0]<volumes[j][0]&&volumes[i][1]<volumes[j][1]) {
					rank++;
				}
			}
			answer[i] = rank;
		}
		return answer;
	}
}
