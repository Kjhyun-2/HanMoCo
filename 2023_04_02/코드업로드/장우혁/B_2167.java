import java.util.*;
import java.io.*;

public class B_2167 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer tokens;

    public static void arrPush(int[][] arr) throws IOException {    //배열 삽입
        for (int i = 0; i < arr.length; i++) {
            tokens = new StringTokenizer(bf.readLine());    //tokens = 1 2 4
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(tokens.nextToken());   //띄어쓰기 기준으로 하나씩 삽입
            }
        }
    }
    public static int arrSum(int[][] arr, int a, int b, int x, int y) { //(a, b)부터 (x, y)까지의 합 구하기
        int sum = 0;
        for(int i = a-1; i < x; i++) {
            for(int j = b-1; j < y; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        tokens = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(tokens.nextToken());
        int b = Integer.parseInt(tokens.nextToken());
        int[][] arr = new int[a][b];
        arrPush(arr);       // 입력 완료
        int x = 0, y = 0;
        int K = Integer.parseInt(bf.readLine());          

        for(int i = 0; i < K; i++) {
            tokens = new StringTokenizer(bf.readLine());    //1 1 2 3 입력
            a = Integer.parseInt(tokens.nextToken());       //각각에 띄어쓰기 기준으로 값 넣어주기
            b = Integer.parseInt(tokens.nextToken());
            x = Integer.parseInt(tokens.nextToken());
            y = Integer.parseInt(tokens.nextToken());
            System.out.println(arrSum(arr, a, b, x, y));
        }
    }
}
