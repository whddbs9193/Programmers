package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120882
등수 매기기
 */
public class Solution_120882 {
    public static void main(String[] ars){
        Solution_120882 s = new Solution_120882();
        s.solution(new int[][]{{80, 70},{90, 50},{40, 70},{50, 80}});
        s.solution(new int[][]{{80, 70},{70, 80},{30, 50},{90, 100},{100,90},{100,100},{10,30}});
        s.solution(new int[][]{{1,2},{1,1},{1,1}});
    }

    public ArrayList<Integer> solution(int[][] score){
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Float> arr = new ArrayList<>();
        Map<Float,Integer> map = new HashMap<>();
        for(int i = 0; i<score.length;i++){
            arr.add((float)(score[i][0] +score[i][1]) / 2);
        }
        Collections.sort(arr,Collections.reverseOrder());

        for (int i = 0; i<score.length;i++){
            if(!map.isEmpty() && map.containsKey(arr.get(i))){
                continue;
            }
            map.put(arr.get(i),i+1);
        }
        for(int i = 0; i<score.length;i++){
            answer.add(map.get((float)(score[i][0] +score[i][1]) / 2));
        }
        System.out.println(answer);
        return answer;
    }
}
