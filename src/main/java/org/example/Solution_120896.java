package org.example;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120896
한 번만 등장한 문자
 */

public class Solution_120896 {
    public static void main(String[] ars){
        Solution_120896 s = new Solution_120896();
        s.solution("abcabcadc");
        s.solution("abdc");
        s.solution("hello");
    }

    public String solution(String s) {
        String answer = "";
        int[] abc = new int[26];
        for(int i = 0; i<s.length(); i++){
            abc[(int)(s.charAt(i)) - 97] += 1;
        }
        for(int i = 0; i<26; i++){
            if(abc[i] == 1){
                answer += (char)('a' + i);
            }
        }
        return answer;
    }
}
