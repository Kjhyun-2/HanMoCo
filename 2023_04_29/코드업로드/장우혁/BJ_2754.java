import java.io.*;
import java.util.*;

public class BJ_2754 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String hacjeom = bf.readLine();    //학점 입력받기
        double score = 1.0;                //학점 디폴드값 1

        switch(hacjeom.charAt(0)) { //학점의 첫번째 문자가
            case 'A':                     //A일 경우
                score *= 4;
                break;
            case 'B':                     //B일 경우
                score *= 3;
                break;
            case 'C':                     //C일 경우
                score *= 2;
                break;
            case 'D':                     //D일 경우
                break;
            case 'F':
                System.out.println(0.0);
                return;
        }

        switch(hacjeom.charAt(1)) { //학점의 두번째 문자가
            case '+' :          //A+일 경우 
                score += 0.3;   //0.3더해주기
                break;
            case '0' :          //A0일 경우
                break;          //그대로 빠져나가기
            case '-' :          //A-일 경우
                score -= 0.3;   //0.3빼주기
                break;
        }
        System.out.println(score);
    }
}
