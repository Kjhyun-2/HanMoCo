import java.io.*;

public class B_2839 {   //x
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args)throws IOException {
        int num = Integer.parseInt(bf.readLine());          //배달해야하는 봉지무게
        int cnt = 0;

        while(true) {
            if (num % 5 == 0) {     //5로 나누어 떨어지는 경우
                cnt += num / 5;
                bw.write(String.valueOf(cnt));
                break;
            }
            else {                  //그 외의 경우
                num -= 3;           //3kg봉지를 하나 들엇
                cnt++;              
            }
            if(num < 0) {           //3과 5로 나누어지는게 없으면
                bw.write(String.valueOf(-1));       //-1출력
                break;
            }
        }
        bw.flush();
    }
}
