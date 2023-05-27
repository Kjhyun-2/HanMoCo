import java.util.*;
import java.io.*;

public class BJ_1049 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer tokens;
    public static void main(String[] args) throws IOException {
        tokens = new StringTokenizer(bf.readLine());
        
        int N = Integer.parseInt(tokens.nextToken());
        int M = Integer.parseInt(tokens.nextToken());
        int Min = Integer.MAX_VALUE;
 
        int[] one = new int[M];
        int[] many = new int[M];
        for(int i=0; i<M; i++){
            tokens = new StringTokenizer(bf.readLine());
            many[i] = Integer.parseInt(tokens.nextToken());
            one[i] = Integer.parseInt(tokens.nextToken());
        }
        Arrays.sort(one);
        Arrays.sort(many);
        
        //가장 싼 6개짜리 팩 구매 vs 가장 싼 낱개 구매 vs (가장싼 6개짜리 팩 + 낱개)
        int[] u;
        Min = Math.min(((N / 6) + 1) * many[0], N * one[0]);    
        Min = Math.min(Min, ((N / 6)) * many[0] + (N % 6) * one[0]);
        
        bw.write(String.valueOf(Min));
        bw.flush();
        bw.close();
    }
}
