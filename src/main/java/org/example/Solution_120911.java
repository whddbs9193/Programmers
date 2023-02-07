package org.example;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/120911
문자열 정렬하기
 */

import java.util.Arrays;

public class Solution_120911 {
    public static void main(String[] ars){
        Solution_120911 s = new Solution_120911();
        s.solution("Bcad");
        s.solution("heLLo");
        s.solution("Python");
    }

    public String solution(String my_string) {
        String answer = "";
        char[] chars = my_string.toLowerCase().toCharArray();
        Arrays.sort(chars);
        answer = new String(chars);
        System.out.println(answer);
        return answer;
    }
}
