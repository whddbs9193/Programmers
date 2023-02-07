package org.example;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/120863
로그인성공?
 */
public class Solution_120883 {
    public static void main(String[] ars){
        Solution_120883 s = new Solution_120883();

        s.solution(new String[]{"meosseugi", "1234"}, new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}});
        s.solution(new String[]{"programmer01", "15789"}, new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}});
        s.solution(new String[]{"rabbit04", "98761"}, new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}});
    }

    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for(int i = 0; i<db.length; i++){
            if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])){
                answer = "login";
            } else if(!id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])){
                answer = "fail";
            } else if (id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])) {
                answer = "wrong pw";
            }
        }
        System.out.println(answer);
        return answer;
    }
}
