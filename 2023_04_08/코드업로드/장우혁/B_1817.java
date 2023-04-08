import java.util.*;
import java.io.*;

public class B_1817 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer tokens;
    
    public static void main(String[] args)throws IOException {
        tokens = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(tokens.nextToken());
        if(num == 0) {
            bw.write(String.valueOf(0));
        }
        else {
            int box = Integer.parseInt(tokens.nextToken());

            int sum = 0;
            int book = 0;
            int cnt = 1;
            tokens = new StringTokenizer(bf.readLine());
            for(int i = 0; i < num; i++) {
                book = Integer.parseInt(tokens.nextToken());
                sum += book;
                if (sum > box) {
                    cnt++;
                    sum = book;
                }
            }
            bw.write(String.valueOf(cnt));
        }
        bw.flush();
    }
}
