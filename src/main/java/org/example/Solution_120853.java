package org.example;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/120853
컨트롤제트
 */
public class Solution_120853 {
    public static void main(String[] ars){
        Solution_120853 s = new Solution_120853();
        s.solution("1 2 Z 3");
        s.solution("10 20 30 40");
        s.solution("10 Z 20 Z 1");
        s.solution("10 Z 20 Z");
        s.solution("-1 -2 -3 Z");
    }
    public int solution(String s) {
        String[] arr = s.split(" ");
        int answer = Integer.parseInt(arr[0]);
        for(int i = 1; i < arr.length ; i++){
            if(arr[i].equals("Z")){
                answer -= Integer.parseInt(arr[i-1]);
                continue;
            }
            answer += Integer.parseInt(arr[i]);
        }
        System.out.println(answer);
        return answer;
    }
}
