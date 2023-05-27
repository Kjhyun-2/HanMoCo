import java.util.*;
import java.io.*;

public class BJ_1735 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer tokens;
    public static int GCD(int son, int mom){
        //분모 = 분모 % 분자
        //분모와 분자의 자리를 바꿔준다.
        //이때 분자가 0이 되면, 분모가 최대공약수.
        int tmp;
        while(son != 0) {
            mom = mom % son;
            tmp = mom;
            mom = son;
            son = tmp;
        }
        return mom;
    }
    public static void main(String[] args) throws IOException {
        int[] son = new int[2];
        int[] mom = new int[2];
        int Sson = 0, Smom = 0, max = 0, cnt = 2;
        for(int i = 0; i < 2; i++) {
            tokens = new StringTokenizer(bf.readLine());
            son[i] = Integer.parseInt(tokens.nextToken());
            mom[i] = Integer.parseInt(tokens.nextToken());
        }
        Sson = son[0] * mom[1] + son[1] * mom[0];
        Smom = mom[0] * mom[1];

        max = GCD(Sson, Smom);

        //시간초과
        // while(!(max == Sson || max == Smom)) {
        //     if(Sson % cnt == 0 && Smom % cnt == 0) {
        //         max = cnt;
        //     }
        //     cnt++;
        // }

        bw.write(String.valueOf((Sson / max) + " " + (Smom / max)));
        bw.flush();
        bw.close();
    }
}
