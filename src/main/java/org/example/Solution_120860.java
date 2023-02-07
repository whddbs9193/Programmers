package org.example;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/120860
직사각형 넓이 구하기
 */
public class Solution_120860 {
    public static void main(String[] ars){
        Solution_120860 s = new Solution_120860();
        s.solution(new int[][]{{1,1},{2,1},{2,2},{1,2}});
        s.solution(new int[][]{{-1,-1},{1,1},{1,-1},{-1,1}});
    }
    public int solution(int[][] dots) {
        int Xmax = dots[0][0], Xmin=dots[0][0];
        int Ymax = dots[0][1], Ymin=dots[0][1];
        for(int i = 1; i<dots.length; i++){
            Xmax = Math.max(Xmax,dots[i][0]);
            Xmin = Math.min(Xmin,dots[i][0]);
            Ymax = Math.max(Ymax,dots[i][1]);
            Ymin = Math.min(Ymin,dots[i][1]);
        }
        System.out.println((Xmax - Xmin) * (Ymax - Ymin));
        return (Xmax - Xmin) * (Ymax - Ymin);
    }
}
