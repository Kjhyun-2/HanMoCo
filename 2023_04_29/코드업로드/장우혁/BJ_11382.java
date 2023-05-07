import java.io.*;
import java.util.*;

public class BJ_11382 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer tokens;
    public static void main(String[] args) throws IOException {
        tokens = new StringTokenizer(bf.readLine());
        long result = 0;        //10의 12승은 int보다 큰 수기 때문에 long으로 선언해준다.
        for(int i = 0 ; i < 3; i++) {
            result += Long.parseLong(tokens.nextToken());   //세개의 값을 받으면서 result에 누적
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
