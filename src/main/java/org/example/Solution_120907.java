package org.example;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/120907
OX퀴즈
 */

import java.util.Arrays;

public class Solution_120907 {
    public static void main(String[] ars){
        Solution_120907 s = new Solution_120907();
        s.solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"});
        s.solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"});
    }
    public String[] solution(String[] quiz){
        String[] answer = new String[quiz.length];
        for(int i = 0; i<quiz.length; i++){
            String[] temp = quiz[i].split(" ");
            if(temp[1].equals("+")){
                int cacu = Integer.parseInt(temp[0]) + Integer.parseInt(temp[2]);
                if(cacu == Integer.parseInt(temp[4])){
                    answer[i] = "O";
                } else if (cacu != Integer.parseInt(temp[4])) {
                    answer[i] = "X";
                }
            } else if (temp[1].equals("-")) {
                int cacu = Integer.parseInt(temp[0]) - Integer.parseInt(temp[2]);
                if(cacu == Integer.parseInt(temp[4])){
                    answer[i] = "O";
                } else if (cacu != Integer.parseInt(temp[4])) {
                    answer[i] = "X";
                }
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
