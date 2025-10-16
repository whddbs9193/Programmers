package org.example;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/1845
포켓몬
 */

import java.util.*;


public class Solution_1845 {
    public static void main(String[] args) {
        Solution_1845 s = new Solution_1845();
        s.solution(new int[]{3,1,2,3});
        s.solution(new int[]{3,3,3,2,2,4});
        s.solution(new int[]{3,3,3,2,2,2});
    }

    public int solution(int[] nums){
        int answer = 0;
        HashMap<String,Integer> map = new HashMap<>();
        int len = nums.length / 2;
        for(int item : nums){
            map.put(item+"",item);
        }
        if(len <= map.size()){
            answer = len;
        }else {
            answer = map.size();
        }
        return answer;
    }

}

