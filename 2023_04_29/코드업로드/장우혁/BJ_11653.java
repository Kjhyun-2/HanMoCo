import java.io.*;
import java.util.*;

public class BJ_11653 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(bf.readLine());
        int result = 2; //소인수분해는 2부터 시작
        while(result <= num) {
            if(num % result == 0) { //나누어 떨어지면 그 수로 나누어떨어지지 않을때까지 나눔
                bw.write(String.valueOf(result + "\n"));
                num /= result;
            }
            else {      //나누어떨어지지 않을경우
                result++;
            }
        }
        bw.flush();
    }
}
