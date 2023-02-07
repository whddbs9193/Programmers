package org.example;

import java.math.BigInteger;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120840
구슬을 나누는 경우의 수
 */
public class Solution_120840 {
    public static void main(String[] ars){
        Solution_120840 s = new Solution_120840();
        s.solution(3,2);
        s.solution(5,3);
        s.solution(30,15);
    }

    public BigInteger solution(int balls, int share) {
        BigInteger Nfactorial = new BigInteger("1");
        BigInteger Mfactorial = new BigInteger("1");

        for(int i = balls; i > 0; i--){
            if(i == balls-share)break;
            Nfactorial = Nfactorial.multiply(BigInteger.valueOf(i));
        }
        for(int i = share; i > 0; i--){
            Mfactorial = Mfactorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(Nfactorial.divide(Mfactorial));
        return (Nfactorial.divide(Mfactorial));
    }
}
