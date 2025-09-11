package org.example;

public class Solution_120878 {
    public static void main(String[] ars){
        Solution_120878 s = new Solution_120878();
        s.solution(7,20);
        s.solution(11,22);
        s.solution(12,21);
        s.solution(25,30);
        s.solution(12,36);
    }
    public int solution(int a, int b){
        int answer = 2;

        for(int i = 2; i<=Math.min(a,b); i++){
            if(a%i == 0 && b%i == 0){
                if(b/i%2 == 0 || b/i%5 == 0){
                    answer = 1;
                }
            }
        }
        if(b%2 == 0 || b%5 == 0){
            answer = 1;
        }
        System.out.println(answer);
        return answer;
    }
}
