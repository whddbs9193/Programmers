package org.example;

import java.util.LinkedList;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120921
문자열 밀기
 */
public class Solution_120921 {
    public static void main(String[] ars){
        Solution_120921 s = new Solution_120921();
        s.solution("hello","ohell");
        s.solution("apple","elppa");
        s.solution("atat","tata");
        s.solution("abc","abc");
    }

    public int solution(String A, String B){
        int answer = -1;
        LinkedList<String> list = new LinkedList<>();
        for(int i = 0; i<A.length(); i++){
            list.add(String.valueOf(A.charAt(i)));
        }
        for(int i = 0; i<A.length(); i++){
            if(B.equals(getString(list))){
                answer = i;
                break;
            }
            list.addFirst(list.get(A.length()-1));
            list.removeLast();
        }
        System.out.println(answer);
        return answer;
    }

    public String getString(LinkedList<String> list){
        String temp = "";
        for(int i = 0; i<list.size(); i++){
            temp += list.get(i);
        }
        return temp;
    }
}
