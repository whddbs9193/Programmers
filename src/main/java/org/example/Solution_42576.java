package org.example;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/42576
완주하지 못한 선수
 */

import java.util.*;


public class Solution_42576 {
    public static void main(String[] args) {
        Solution_42576 s = new Solution_42576();
        s.solution(new String[]{"leo", "kiki", "eden"} , new String[]{"eden", "kiki"} );
        s.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"} , new String[]{"josipa", "filipa", "marina", "nikola"} );
        s.solution(new String[]{"mislav", "stanko", "mislav", "ana","mislav","ana"} , new String[]{"stanko", "ana", "mislav","mislav","ana"} );
    }

    public String solution(String[] participant, String[] completion){
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();
        Set<String> keySey =  map.keySet();
        for(String key : participant){
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else {
                map.put(key,1);
            }
        }
        for(String key : completion){
            if(map.containsKey(key)){
                map.put(key,map.get(key)-1);
            }
        }
        for(String key : keySey){
            if(map.get(key) != 0){
                answer = key;
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }

}
