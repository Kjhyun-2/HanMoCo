import java.io.*;
import java.util.StringTokenizer;

public class A_1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int A = (a * d) + (b * c); // 분자
        int B = (b * d);

        int res = eucd(A, B);
        A = A / res;
        B = B / res;
        System.out.println(A + " " + B);

    }

    public static int eucd(int a, int b) {
        if (a < b) { //작은 수가 b가 되도록
            int tmp = a;
            a = b;
            b = tmp;
        }

        while (b != 0) {
            int r = a % b;  //나머지를 구한다.
            a = b;          //eucd(a,b) = eucd(b,r)이므로 변환
            b = r;
        }
        return a;
    }
}

//a를 b로 나눈 나머지를 c라고 했을 때
//a와 b의 최대공약수는 b와 c의 최대공약수와 같다