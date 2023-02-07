package org.example;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/120861
캐릭터의 좌표
 */

public class Solution_120861 {
    public static void main(String[] ars){
        Solution_120861 s = new Solution_120861();
        s.solution(new String[]{"left", "right", "up", "right", "right"},new int[]{11,11});
        s.solution(new String[]{"down", "down", "down", "down", "down"},new int[]{7,9});
        s.solution(new String[]{"left", "left", "left", "right"},new int[]{3,3});
    }
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int width = (int)(Math.floor(board[0]/2)) , lenght = (int)(Math.floor(board[1]/2));

        for(int i = 0 ; i<keyinput.length ; i++){
            if(keyinput[i].equals("up") && answer[1] < lenght){
                answer[1] += 1;
            }else if(keyinput[i].equals("down") && answer[1] > (lenght*-1)){
                answer[1] -= 1;
            }else if(keyinput[i].equals("left") && answer[0] > (width*-1)){
                answer[0] -= 1;
            }else if(keyinput[i].equals("right") && answer[0] < width){
                answer[0] += 1;
            }
        }
        System.out.println(answer[0]+" "+answer[1]);
        return answer;
    }
}
