package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120812
최빈값 구하기
 */
public class Solution_120812 {
    public static void main(String[] ars){
        Solution_120812 s = new Solution_120812();
        s.solution(new int[] {1,2,3,3,3,4});
        s.solution(new int[] {1,1,2,2,});
        s.solution(new int[] {0});
        s.solution(new int[] {1,1,2,2,3,3,3});
    }

    public int solution(int[] array){
        int answer = 0;
        int cnt = 0;
        int max = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< array.length; i++){
            if(map.containsKey(array[i])){
                map.put(array[i], map.get(array[i]) + 1);
            }else {
                map.put(array[i], 1);
            }
        }

        Iterator<Integer> keys = map.keySet().iterator();
        while (keys.hasNext()){
            int key = keys.next();
            if(map.get(key) >= max){
                max = map.get(key);
                answer = key;
            }
        }

        Iterator<Integer> keys1 = map.keySet().iterator();
        while (keys1.hasNext()){
            int key = keys1.next();
            if(map.get(key) == max){
                cnt++;
            }
            if(cnt > 1){
                answer = -1;
                System.out.println(answer);
                return answer;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
