package org.example;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/120875
평행
 */
public class Solution_120875 {
    public static void main(String[] ars){
        Solution_120875 s = new Solution_120875();
        s.solution(new int[][]{{1, 4},{9, 2},{3, 8},{11, 6}});
        s.solution(new int[][]{{3, 5},{4, 1},{2, 4},{5, 10}});
        s.solution(new int[][]{{1, 1},{5, 1},{1, 10},{3, 10}});
    }
    public  int solution(int[][] dots){
        int answer = 0;
        if (((double)(dots[0][0] - dots[1][0]) / (double)(dots[0][1] - dots[1][1]))
                == ((double)(dots[2][0] - dots[3][0]) / (double)(dots[2][1] - dots[3][1]))) {
            answer = 1;
        }
        if (((double)(dots[0][0] - dots[2][0]) / (double)(dots[0][1] - dots[2][1]))
                == ((double)(dots[1][0] - dots[3][0]) / (double)(dots[1][1] - dots[3][1]))) {
            answer = 1;
        }
        if (((double)(dots[0][0] - dots[3][0]) / (double)(dots[0][1] - dots[3][1]))
                == ((double)(dots[2][0] - dots[1][0]) / (double)(dots[2][1] - dots[1][1]))) {
            answer = 1;
        }
        System.out.println(answer);
        return answer;
    }
}
