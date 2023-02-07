package org.example;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120887
k의 개수
 */

public class Solution_120887 {
    public static void main(String[] ars){
        Solution_120887 s = new Solution_120887();
        s.solution(1,13,1);
        s.solution(10,50,5);
        s.solution(3,10,2);
    }

    public int solution(int i, int j, int k){
        int answer = 0;
        String temp = "";
        for(int index = i; index <= j; index++){
            temp = String.valueOf(index);
            for(int a = 0; a < temp.length(); a++){
                if(temp.charAt(a) == (char)(k + '0')) answer += 1;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
