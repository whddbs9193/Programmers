package org.example;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120843
공 던지기
 */

public class Solution_120843 {
    public static void main(String[] ars){
        Solution_120843 s = new Solution_120843();
        s.solution(new int[]{1, 2, 3, 4},2);
        s.solution(new int[]{1, 2, 3, 4, 5, 6},5);
        s.solution(new int[]{1, 2, 3},3);
    }
    public int solution(int[] numbers, int k) {
        return numbers[(k - 1) * 2 % numbers.length];
        // k번째 사람이 던지는거니 던진걸 받는사람이 아닌 던진사람인 k번째 -1 , *2는 2번씩 k-1번 던진사람 이기떄문에
        // 던진걸 나열해서 던진사람 위치랑 비교하면 ex) 1(던진사람) * 2(공이 2만큼 이동하니까) % 4(이동한 공만큼에 서있는 사람을 나눈다)
    }
}
