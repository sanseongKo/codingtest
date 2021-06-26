package programmers;

public class Spy {
	public static void main(String[] args) {
		String[][] str = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(solution(str));
	}
	public static int solution(String[][] clothes) {
        int answer = 0;
//        HashSet<String> set = new HashSet<String>();
//        HashSet<String> set2 = new HashSet<String>();
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i< clothes.length; i++) {
//        	sb.append(clothes[i][0]);
//        	set.add(sb.toString());
//        	set2.add(clothes[i][1]);
//        	System.out.println("sb1: " + sb.toString());
//        	answer++;//1개의 옷차림 // yello + bluesungla + green_turban 
//        	for(int j = i+1; j<clothes.length; j++) {
//        	if(set2.contains(clothes[j][1])) {
//        		continue;
//        	}else if(set.contains(sb.toString())){
//        		continue;
//        	}else {
//        		sb.append(clothes[j][0]);
//        		System.out.println("sb: " +sb.toString());
//        		set.add(sb.toString());
//        		set2.add(clothes[j][1]);
//        		answer++;
//        		System.out.println("answer: "+ answer);
//        	}
//        }
//        	sb.delete(0, sb.length());
//        	set2.clear();
//        }
//        // 상의2 
//        
//        // 

       
        return answer;
    }
}









//위장 매일 다른옷 조합
//, 뒤에가 같을 경우 못씀
//Map을 쓴다?