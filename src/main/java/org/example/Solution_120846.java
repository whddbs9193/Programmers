package org.example;
/*
합성수 찾기
 */
public class Solution_120846 {
    public static void main(String[] ars){
        Solution_120846 s = new Solution_120846();
        s.solution(10);
        s.solution(15);
    }

    public int solution(int n) {
        int answer = 0;
        int[] arr = {5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        for(int i = 4; i <= n; i++){
            for(int j = 0; j< arr.length; j++) {
                if(arr[j] > n) break;
                if(arr[j] == i) answer -= 1;
            }
            answer += 1;
        }
        System.out.println(answer);
        return answer;
    }
}
