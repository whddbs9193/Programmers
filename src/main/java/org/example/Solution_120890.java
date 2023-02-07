package org.example;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/120890
가까운 수
 */

import java.util.Arrays;

public class Solution_120890 {
    public static void main(String[] ars){
        Solution_120890 s = new Solution_120890();

        s.solution(new int[]{3, 10, 28},20);
        s.solution(new int[]{10, 11, 12},13);
        s.solution(new int[]{11, 9, 13},10);
    }

    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            if(Math.abs(array[i] - n) < Math.abs(answer - n)){
                answer = array[i];
            }
        }
        System.out.println(answer);
        return answer;
    }
}
