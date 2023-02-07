package org.example;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/120888
중복된 문자 제거
 */

public class Solution_120888 {
    public static void main(String[] ars){
        Solution_120888 s = new Solution_120888();
        s.solution("people");
        s.solution("We are the world");
    }

    public boolean find(StringBuilder string, char my_string){
        for(int i = 0; i<string.length(); i++){
            if(string.charAt(i) == my_string){
                return false;
            }
        }
        return true;
    }
    public String solution(String my_string) {
        String answer = "";
        StringBuilder string = new StringBuilder();
        for(int i = 0; i<my_string.length(); i++){
            if(string.length() == 0){
                string.append(my_string.charAt(0));
            }else if(find(string,my_string.charAt(i))){
                string.append(my_string.charAt(i));
            }
        }
        answer = String.valueOf(string);
        System.out.println(answer);
        return answer;
    }
}
