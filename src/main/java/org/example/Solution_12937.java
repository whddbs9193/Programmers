package org.example;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/12937
짝수와 홀수
 */
public class Solution_12937 {
    public static void main(String[] ars){
        Solution_12937 s = new Solution_12937();
        s.solution(3);
        s.solution(4);
    }
    public String solution(int num) {
        return num%2 == 0 ? "Even" : "Odd";
    }
}
