package org.example;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/120808
분수의 덧샘
 */

public class Solution_120808 {
    public static void main(String[] ars){
        Solution_120808 s = new Solution_120808();
        s.solution(1,2,3,4);
        s.solution(9,2,1,3);
        s.solution(1,2,1,2);
    }
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;
        int cd = 1;
        for (int i = 1; i <= Math.max(numer, denom); i++) {
            if (numer % i == 0 && denom % i == 0) {
                cd = i;
            }
        }
        answer[0] = numer / cd;
        answer[1] = denom / cd;
        System.out.println(answer[0]+ " , "+answer[1]);
        return answer;
    }
}
