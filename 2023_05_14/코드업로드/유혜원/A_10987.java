import java.io.*;
import java.util.StringTokenizer;

public class A_10987 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int top = (a * d) + (b * c);    //분자
        int bottom = b * d; //분모
        int min; //최대공약수
        
        //최대공약수 구하기
        if (top < bottom) {
            min = eucd(bottom, top);
        } else {
            min = eucd(top, bottom);
        }

        //최대공약수로 나누기
        top /= min;
        bottom /= min;

        System.out.print(top + " " + bottom);
    }
    
    public static int eucd(int bn, int sn) {
        // 큰숫자를 작은숫자로 나눈 나머지를 계산
        int r = bn % sn;
        // 나머지가 0이면 작은숫자가 최대공약수이므로 작은숫자 리턴
        if (r == 0) {
            return sn;
        } else {
            // 나머지가 0 이상이면 재귀형태로 호출
            return eucd(sn, r); // 작은숫자와 나머지
        }
    }
}