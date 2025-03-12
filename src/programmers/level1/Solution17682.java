package programmers.level1;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// [1차] 다트 게임 : https://school.programmers.co.kr/learn/courses/30/lessons/17682
public class Solution17682 {
    static int[] sum = new int[3];
    public static int solution(String dartResult) {
        String reg = "([0-9]{1,2}[S|T|D][*|#]{0,1})";
        Pattern p = Pattern.compile(reg+reg+reg);
        Matcher m = p.matcher(dartResult);
        m.find();
        for(int i=1; i<=m.groupCount(); i++){
            Pattern p1 = Pattern.compile("([0-9]{1,2})([S|T|D])([*|#]{0,1})");
            Matcher m1 = p1.matcher(m.group(i));
            m1.find();
            sum[i-1] = (int)Math.pow(Integer.parseInt(m1.group(1)), getpow(m1.group(2)));
            setting(i,m1.group(3));
        }
        return(sum[0]+ sum[1]+ sum[2]);
    }

    static void setting(int idx, String msg){
        if(msg.equals("*")){
            sum[idx - 1] *= 2;
            if(idx > 1 ){
                sum[idx - 2] *=2;
            }
        }
        else if(msg.equals("#")){
            sum[idx - 1] *=-1 ;
        }
    }
    static int getpow(String mag){
        if(mag.equals("S")){
            return 1;
        }
        else if(mag.equals("D")){
            return 2;
        }
        else {
            return 3;
        }

    }

    public static void main(String[] args) {
        String dartResult1 = "1S2D*3T";
        System.out.println(solution(dartResult1));
        String dartResult2 = "1D2S#10S";
        System.out.println(solution(dartResult2));
        String dartResult3 = "1D2S0T";
        System.out.println(solution(dartResult3));
        String dartResult4 = "1S*2T*3S";
        System.out.println(solution(dartResult4));
        String dartResult5 = "1D#2S*3S";
        System.out.println(solution(dartResult5));
        String dartResult6 = "1T2D3D#";
        System.out.println(solution(dartResult6));
        String dartResult7 = "1D2S3T*";
        System.out.println(solution(dartResult7));
    }
}
