package org.example;

public class Solution_120902 {
    public static void main(String[] ars){
        Solution_120902 s = new Solution_120902();
        s.solution("3 + 4 - 5");

    }

    public int solution(String my_string) {
        int answer = 0;
        String[] my_stringarr = my_string.split(" ");
        /*첫번쨰 값을 먼저 넣고 나머지값을을 계산 한다.*/
        answer = Integer.parseInt(my_stringarr[0]);
        for(int i = 1; i< my_stringarr.length-1; i = i+2){
            if(i >= my_stringarr.length){
                break;
            }
            if(my_stringarr[i].equals("+")){
                answer += Integer.parseInt(my_stringarr[i+1]);
            }else if(my_stringarr[i].equals("-")){
                answer -= Integer.parseInt(my_stringarr[i+1]);
            }
        }
        System.out.println(answer);
        return answer;
    }
}
