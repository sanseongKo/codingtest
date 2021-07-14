package baekjun;

public class ACMHotel {
	public static void main(String[] args) {
		int layer = 30;
		int rooms = 50;
		int customer = 72;
		System.out.println(solution(layer, rooms, customer));
	}
	public static int solution(int layer, int rooms, int customer) {
		int answer = 0;
		int room = 1;
		int i =0;
		while(i<=layer) {
			if(customer>layer) {
				customer -= layer;
				room++;
			}else {
				String roomnumber = Integer.toString(customer) +"0"+Integer.toString(room);
				return Integer.parseInt(roomnumber);
			}
		}
		return answer;
	}
}
