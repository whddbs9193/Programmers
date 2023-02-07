package org.example;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/120852
소인수분해
 */

import java.util.ArrayList;

public class Solution_120852 {
    public static void main(String[] ars){
        Solution_120852 s = new Solution_120852();
        s.solution(12);
        s.solution(17);
        s.solution(420);

    }
    public boolean check(int num, ArrayList<Integer> arr){
        for (Integer i : arr) {
            if(i == num) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        int i = 2;
        while (n > 1){
            if(n%i == 0){
                if(check(i,answer)) answer.add(i);
                n /= i;
            }else if(n%i != 0) i++;
        }
        System.out.println(answer);
        return answer;
    }
}
