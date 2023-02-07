package org.example;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/120869
외계어 사전
 */


public class Solution_120869 {
    public static void main(String[] ars){
        Solution_120869 s = new Solution_120869();
        s.solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"});
        s.solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"});
        s.solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"});
        s.solution(new String[]{"a", "b", "c"}, new String[]{"abcd", "efg"});

    }

    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int flag = 0;
        for(int i = 0; i< dic.length; i++){
            for(int j = 0; j<spell.length; j++){
                if(dic[i].contains(spell[j])) flag += 1;
            }
            if(flag == spell.length && flag == dic[i].length()){
                answer = 1;
            }
            flag = 0;
        }
        System.out.println(answer);
        return answer;
    }
}
