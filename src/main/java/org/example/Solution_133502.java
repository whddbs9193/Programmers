package org.example;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/133502
햄버거 만들기
 */

public class Solution_133502 {
    public static void main(String[] ars){
        Solution_133502 s = new Solution_133502();
        int[] ingredient ={2, 1, 1, 2, 3, 1, 2, 3, 1};
        int[] ingredient2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        s.solution(ingredient);
        s.solution(ingredient2);
    }

    public int solution(int[] ingredient) {
        int answer = 0;
        StringBuilder string = new StringBuilder();
        for(int i = 0; i<ingredient.length; i++){
            string.append(ingredient[i]);
            if(string.length() > 3 && string.subSequence(string.length()-4,string.length()).equals("1231") ){
                answer +=1;
                string.delete(string.length()-4,string.length());
            }
        }
        System.out.println(answer);
        return answer;
    }
}
