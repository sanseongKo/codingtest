package programmers;

public class DiskController {
	public static void main(String[] args) {
		int[][] jobs = {{0, 3}, {1,9}, {2,6}};
		System.out.println(solution(jobs));
	}
	public static int solution(int[][] jobs) {
        int answer = 0;
        int tmp = 0;
        int i =0;
        int now = 0;
        
        while (i< jobs.length && jobs[i][0] <= now){
           
        }

        answer = tmp;
        return answer;
    }
}
//끝 - 시작으로 요청 시간을 알수 있고
//시작을 비교해야 하고
//0~3(0) 3~9(2) 9~18(3)
