package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/12944
평균 구하기
 */
public class Solution_12944 {
    public static void main(String[] ars) {
        Solution_12944 s = new Solution_12944();
        s.solution(new int[]{1,2,3,4});
        s.solution(new int[]{5,5});
    }

    public double solution(int[] arr) {
        double answer = 0;
        for(int i : arr){
            answer += i;
        }
        System.out.println(answer/arr.length);
        return answer/arr.length;
    }
}
