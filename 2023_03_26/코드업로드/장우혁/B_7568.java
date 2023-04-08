import java.util.*;
import java.io.*;

public class B_7568 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer tokens;

    public static void arrPrint(int[][] arr) throws IOException{    //등수 출력
        for(int i = 0; i < arr.length; i++) {
            bw.write(String.valueOf(arr[i][2] + " "));
        }
    }
    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(bf.readLine());
        int[][] arr = new int[num][3];      //몸무게, 키, 등수

        for(int i = 0; i < arr.length; i++) {
            tokens = new StringTokenizer(bf.readLine());
            arr[i][0] = Integer.parseInt(tokens.nextToken());   //몸무게
            arr[i][1] = Integer.parseInt(tokens.nextToken());   //키
        }
        
        for(int i = 0; i < arr.length; i++) {   //모든 등수에 1 넣어주기
            arr[i][2] = 1;
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(i == j) {                    //같은사람은 비교x
                    continue;
                }
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {    //몸무게와 키가 모두 작으면
                    arr[i][2]++;                                        //등수++
                }
            }
        }
        arrPrint(arr);
        bw.flush();
    }
}
