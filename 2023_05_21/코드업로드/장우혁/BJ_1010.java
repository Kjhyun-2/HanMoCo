import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ_1010 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer tokens;
    public static void main(String[] args) throws IOException {
		
		int[][] arr = new int[30][30];
 
		for (int i = 0; i < 30; i++) {  //n C 0 = n C n = 1
			arr[i][i] = 1;
			arr[i][0] = 1;
		}
			
		for (int i = 2; i < 30; i++) {
			for (int j = 1; j < 30; j++) {  //n+1 C r+1 = n C r + n C r+1
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
			}
		}
		int T = Integer.parseInt(bf.readLine());
        int N;
        int M;
        
		for(int i = 0; i < T; i++) {
			
			tokens = new StringTokenizer(bf.readLine());
			
			// M개중 N개를 뽑는 경우이므로 nCr 에서 n = M, r = N
			N = Integer.parseInt(tokens.nextToken());	// N = r
			M = Integer.parseInt(tokens.nextToken());	// M = n
			
            bw.write(String.valueOf(arr[M][N] + "\n"));
		}
		bw.flush();
        bw.close();
    }
}
