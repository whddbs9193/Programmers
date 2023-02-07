package org.example;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/120884
치킨 쿠폰
 */
public class Solution_120884 {
    public static void main(String ars[]){
        Solution_120884 s = new Solution_120884();
        s.solution(100);
        s.solution(9);
        s.solution(1081);
        s.solution(1999);
    }

    public int solution(int chicken){
//        int answer = 0;
//        int coupon = 0;
//        while (chicken > 0){
//            answer += (chicken / 10);
//            coupon += chicken % 10;
//            if(coupon >= 10){
//                answer += 1;
//                coupon += coupon%10;
//            }
//            chicken /= 10;
//        }
//        System.out.println(answer);
//        return answer;
        int answer = chicken/9;
        if(chicken > 1 && chicken%9 == 0){
            answer--;
        }

        System.out.println(answer);
        return answer;
    }
}
