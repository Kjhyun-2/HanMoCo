import java.util.*;
import java.io.*;

public class B_5635 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer tokens;

    public static void arrSort(String[][] arr) {    //배열 정렬
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(Float.parseFloat(arr[i][1]) > Float.parseFloat(arr[j][1])) {
                    String temp = arr[i][1];
                    arr[i][1] = arr[j][1];
                    arr[j][1] = temp;

                    temp = arr[i][0];
                    arr[i][0] = arr[j][0];
                    arr[j][0] = temp;
                }
            }
        }
    }

    public static void main(String[] args)throws IOException {
        int student = Integer.parseInt(bf.readLine());
        int y = 0, m = 0;
        float age, d = 0;
        String[][] arr = new String[student][2]; //이름과 나이만 들어갈 배열

        for(int i = 0; i < student; i++) {
            tokens = new StringTokenizer(bf.readLine());
            arr[i][0] = tokens.nextToken();
            d = Integer.parseInt(tokens.nextToken());
            m = Integer.parseInt(tokens.nextToken());
            y = Integer.parseInt(tokens.nextToken());
            
            d = (31-d)/31;      //기준을 2013.12.31로 잡고 한명당 나이를 계산해준다.
            m = 12-m;           //ex)태어난지 1년 2개월됐으면
            y = (2013-y)*12;    //age = 14개월;
            age = y+m+d;
            arr[i][1] = String.valueOf(age);
        }
        arrSort(arr);           //어린사람이 위로, 늙은사람이 아래로
        bw.write(String.valueOf(arr[0][0] + "\n" + arr[arr.length-1][0]));// 맨위 맨아래 출력
        bw.flush();
        
    }
}
