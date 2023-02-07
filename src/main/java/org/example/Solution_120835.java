package org.example;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120835
진료 순서 정하기
 */

import java.util.*;

public class Solution_120835 {
    public static void main(String[] ars){
        Solution_120835 s = new Solution_120835();
        s.solution(new int[]{3, 76, 24});
        s.solution(new int[]{1, 2, 3, 4, 5, 6, 7});
        s.solution(new int[]{30, 10, 23, 6, 100});
    }

    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] temp = emergency.clone();
        Map<Integer, Integer> map = new HashMap<>();

        Arrays.sort(emergency);

        for(int i = 0; i<emergency.length; i++){
            map.put(emergency[emergency.length-1 - i],i+1);
        }
        for (int i = 0; i<emergency.length; i++){
            answer[i] = map.get(temp[i]);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
