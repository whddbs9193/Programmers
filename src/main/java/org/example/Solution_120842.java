package org.example;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120842
2차원으로 만들기
 */

import java.util.*;

public class Solution_120842 {
    public static void main(String[] ars){
        Solution_120842 s = new Solution_120842();
        s.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8},2);
        s.solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948},3);
    }

    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int temp = 0;
        for(int i = 0; i < num_list.length / n ; i++){
            for(int j = 0; j<n;j++){
                answer[i][j] = num_list[temp];
                temp++;
            }
        }
        System.out.println(Arrays.deepToString(answer));
        return answer;
    }

}
