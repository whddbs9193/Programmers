package org.example;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/120894
영어가 싫어요
 */
public class Solution_120894 {
    public static void main(String[] ars){
        Solution_120894 s = new Solution_120894();

        s.solution("onetwothreefourfivesixseveneightnine");
        s.solution("onefourzerosixseven");
    }

    public long solution(String numbers) {
        long answer = 0;
        numbers = numbers.replace("zero","0")
                .replace("one","1")
                .replace("two","2")
                .replace("three","3")
                .replace("four","4")
                .replace("five","5")
                .replace("six","6")
                .replace("seven","7")
                .replace("eight","8")
                .replace("nine","9");

        answer = Long.parseLong(numbers);
        System.out.println(answer);
        return answer;
    }
}
