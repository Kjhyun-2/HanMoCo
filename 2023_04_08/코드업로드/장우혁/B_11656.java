import java.util.*;
import java.io.*;

public class B_11656 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String str = bf.readLine();
        String[] strArr = new String[str.length()]; //str과 크기가 같은 배열 생성
        
        for(int i = 0; i < str.length(); i++) {
            strArr[i] = str.substring(i);   //원하는 인덱스부터 문자열 가져오는 함수
        }
        
        Arrays.sort(strArr);
        for(int i = 0; i < strArr.length; i++) {
            bw.write(strArr[i] + "\n");
        }
        bw.flush();

    }
}
