package org.example;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/120891
369게임
 */

public class Solution_120891 {

    public static void main(String[] ars){
        Solution_120891 s = new Solution_120891();
        s.solution(3);
        s.solution(29423);
        s.solution(1000);
    }

    public int solution(int order) {
        int answer = 0;
        while (order > 0){
            if((order % 10) == 3 || (order % 10) == 6 || (order % 10) == 9){
                answer += 1;
            }
            order /= 10;
        }
        System.out.println(answer);
        return answer;
    }
}


