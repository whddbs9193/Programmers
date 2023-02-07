package org.example;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120838
모스부호
 */
/*
morse = {
    '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
    '-.--':'y','--..':'z'
}
 */

import java.util.HashMap;
import java.util.Map;

public class Solution_120838 {
    public static void main(String[] ars){
        Solution_120838 s = new Solution_120838();
        s.solution(".... . .-.. .-.. ---");
        s.solution(".--. -.-- - .... --- -.");
    }

    public String solution(String letter) {
        String answer = "";
        Map<String,String>  map = new HashMap<String,String>();

        map.put(".-","a");
        map.put("-...","b");
        map.put("-.-.","c");
        map.put("-..","d");
        map.put(".","e");
        map.put("..-.","f");
        map.put("--.","g");
        map.put("....","h");
        map.put("..","i");
        map.put(".---","j");
        map.put("-.-","k");
        map.put(".-..","l");
        map.put("--","m");
        map.put("-.","n");
        map.put("---","o");
        map.put(".--.","p");
        map.put("--.-","q");
        map.put(".-.","r");
        map.put("...","s");
        map.put("-","t");
        map.put("..-","u");
        map.put("...-","v");
        map.put(".--","w");
        map.put("-..-","x");
        map.put("-.--","y");
        map.put("--..","z");

        String[] str = letter.split(" ");
        for(int i = 0; i<str.length; i++){
            answer += map.get(str[i]);
        }
        System.out.println(answer);
        return answer;
    }
}
