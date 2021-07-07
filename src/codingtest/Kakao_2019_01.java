package codingtest;

import java.util.ArrayList;
import java.util.HashMap;

public class Kakao_2019_01 {
	
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		String[] result = solution(record);
		for(int i =0; i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
	
	public static String[] solution(String[] record) {
        ArrayList<String> list = new ArrayList<String>();
        HashMap<String, String> map = new HashMap<String, String>();
        for(int i =0; i<record.length; i++) {
        	String[] tmp = record[i].split(" ");
      
        	
        	if(tmp[0].equals("Enter")) {
        		list.add(tmp[1]+"/"+tmp[2]+"���� ���Խ��ϴ�.");
        		map.put(tmp[1], tmp[2]);
        		for(int j = 0; j<list.size();j++) {
        			String[] tmp2 = list.get(j).split("/");
        			if(tmp[1].equals(tmp2[0])) {
        				String[] tmp3 = tmp2[1].split("��");
        			String temp = list.get(j).replace(tmp3[0], tmp[2]);
        		
        			list.set(j, temp);
        		}
        		}
        	}else if(tmp[0].equals("Leave")) {
        		
        		list.add(tmp[1]+"/"+map.get(tmp[1])+"���� �������ϴ�.");
        	}else if(tmp[0].equals("Change")) {
        		for(int j =0; j<list.size();j++) {
        			String[] tmp2 = list.get(j).split("/");
        			if(tmp[1].equals(tmp2[0])) {
        				String[] tmp3 = tmp2[1].split("��");
        			String temp = list.get(j).replace(tmp3[0], tmp[2]);
        		
        			list.set(j, temp);
        			}
        		}
        	}
        	
        }
        String[] answer = new String[list.size()];
        for(int i = 0; i<list.size();i++) {
        	String[] alarm = list.get(i).split("/");
        	answer[i] = alarm[1];
        }
        return answer;
    }
	
	
}
//�̸� ��� �׼� ��� uid���