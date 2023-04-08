import java.util.*;
import java.io.*;

public class B_14494 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer tokens;
    public static void main(String[] args)throws IOException {
        tokens = new StringTokenizer(bf.readLine());
        int x = Integer.parseInt(tokens.nextToken());
        int y = Integer.parseInt(tokens.nextToken());
        long[][] dy = new long[x+1][y+1];     //dynamic배열 dy 생성
        
        for(int i = 0; i < dy.length; i++) {
            for(int j = 0; j < dy[i].length; j++) { 
                dy[i][j] = 0;               //모든 칸을 0으로 초기화
            }
        }
        dy[0][0] = 1;   //0, 0칸만 1로 초기화

        for(int i = 1; i < dy.length; i++) {
            for(int j = 1; j < dy[i].length; j++) { //핵심스킬 얍
                dy[i][j] = (dy[i-1][j] + dy[i-1][j-1] + dy[i][j-1]) % 1000000007;
            }
        }
        bw.write(String.valueOf(dy[x][y]));
        bw.flush();
    }
}
