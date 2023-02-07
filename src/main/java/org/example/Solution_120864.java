package org.example;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120864
숨어있는 숫자의 덧샘(2)
 */

public class Solution_120864 {
    public static void main(String[] ars){
        Solution_120864 s = new Solution_120864();
        s.solution("aAb1B2cC34oOp");
        s.solution("1a2b3c4d123Z");
    }

    public int solution(String my_string) {
        int answer = 0;
        String[] num = my_string.split("[a-zA-Z]");
        for(int i = 0; i< num.length; i++){
            answer += !num[i].isEmpty() ? Integer.parseInt(num[i]): 0 ;
        }
        System.out.println(answer);
        return answer;
    }
}
