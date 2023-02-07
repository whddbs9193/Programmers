package org.example;

import java.util.*;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120913
잘라서 배열로 저장하기
 */
public class Solution_120913 {
    public static void main(String[] ars){
        Solution_120913 s = new Solution_120913();

        s.solution("abc1Addfggg4556b",6);
        s.solution("abcdef123",3);
    }

    public ArrayList<String> solution(String my_str, int n) {
        ArrayList<String> answer = new ArrayList<>();
        Queue<String> que = new LinkedList<String>();
        String temp = "";

        for(int i = 0; i<my_str.length(); i++){
            que.add(String.valueOf((my_str.charAt(i))));
        }
        while (!que.isEmpty()){
            for(int i = 0; i<n; i++){
                if(que.isEmpty()){
                    break;
                }
                temp += que.poll();
            }
            answer.add(temp);
            temp = "";
        }
        System.out.println(answer);
        return answer;
    }
}
