package org.example;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/120922
종이 자르기
 */
public class Solution_120922 {
    public static void main(String[] ars){
        Solution_120922 s = new Solution_120922();
        s.solution(2,2);
        s.solution(2,5);
        s.solution(1,1);
    }
    public int solution(int M, int N){
        int answer = 0;
        if(M*N != 1){
            answer = M*N-1;
        }
        System.out.println(answer);
        return answer;
    }
}
