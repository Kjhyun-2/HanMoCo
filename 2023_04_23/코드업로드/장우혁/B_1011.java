import java.io.*;
import java.util.*;

public class B_1011 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer tokens;
    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(bf.readLine());
        for (int i = 0; i < T; i++) {
            tokens = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(tokens.nextToken());
            int y = Integer.parseInt(tokens.nextToken());
            int dis = y - x;
            int max = (int) Math.sqrt(dis);
            if (max == Math.sqrt(dis)) {
                bw.write(String.valueOf(max * 2 -1) + "\n");
            } else if (max * max < dis && dis <= max * max + max) {
                bw.write(String.valueOf(max * 2) + "\n");
            } else {
                bw.write(String.valueOf(max * 2 + 1) + "\n");
            }
        }
        bw.flush();
    }
}
