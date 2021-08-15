package toss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Toss2 {
	List<Integer> list;
	public static void main(String[] args) {
		int[] tmp = {1,2,3,0,0};
		
	}
	public int[][] solution(int servers, boolean sticky, int[] requests) {
        int[][] answer = {};
        int k = 0;
        int[][] tmp = new int[servers][];
        
        if(sticky == false) {
        for(int i = 0; i<servers;i++) {
        	tmp[i] = solution2(servers, requests, i, sticky);
        }
        }else {
        	for(int i = 0 ; i<servers; i++) {
        		tmp[i] = solution2(servers, requests, i, sticky);
        	}
        }
        return answer;
    }
    public int[] solution2(int servers, int[] request, int server, boolean sticky){
    	list = new ArrayList<Integer>();
    	int k = 0;
    	if(sticky == false) {
    	for(int i = 0 ; i< request.length; i++) {
    		if(i/servers == server) {
    			list.add(i);
    		}
    	}
    	}else {
    		HashSet<Integer> set = new HashSet<Integer>();
    		for(int i = 0 ; i< request.length; i++) {
    			if(i/servers == server) {
    				
    			}
    		}
    	}
    	
    	int[] result = new int[list.size()];
    	return result;
    	
    }
}
//request = 1,2,2,3,4,1