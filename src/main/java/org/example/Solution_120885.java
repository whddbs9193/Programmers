package org.example;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/120885
이진수 더하기
 */

public class Solution_120885 {
    public static void main(String[] ars){
        Solution_120885 s = new Solution_120885();
        s.solution("10","11");
        s.solution("1001","1111");

    }

    public String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1,2)+Integer.parseInt(bin2,2));
    }
}
