package org.example;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/120886
문자열 정렬하기
 */

import java.util.Arrays;

public class Solution_120886 {
    public static void main(String[] ars){
        Solution_120886 s = new Solution_120886();
        s.solution("olleh" , "hello");
        s.solution("allpe","apple");
    }

    public int solution(String before, String after) {
        int answer = 0;
        char[] str1 = before.toCharArray();
        Arrays.sort(str1);
        before = new String(str1);

        char[] str2 = after.toCharArray();
        Arrays.sort(str2);
        after = new String(str2);

        answer = before.equals(after) ? 1 : 0;
        System.out.println(answer);
        return answer;
    }
}
