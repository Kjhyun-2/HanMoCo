import java.io.*;
import java.util.*;

public class B_11047 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer tokens;
    public static void main(String[] args) throws IOException {
        tokens = new StringTokenizer(bf.readLine());
        int cnt = Integer.parseInt(tokens.nextToken());
        int price = Integer.parseInt(tokens.nextToken());
        int[] money = new int[cnt];
        for(int i = 0; i < money.length; i++) {     //동전의 가치를 배열에 집어넣기
            money[i] = Integer.parseInt(bf.readLine());
        }
        cnt = 0;
        for(int index = money.length-1; index >= 0; index--) {   //가장 큰 동전부터 대입해보기
            if (money[index] <= price) {                 //필요한 금액보다 동전의 금액이 커졌을경우 
                cnt += (price / money[index]);          //이 동전이 최대 몇개가 쓰일수 있는지                            
                price -= money[index] * (price / money[index]);  //남은돈 계산해주기
            }   
        }                       
        System.out.println(cnt);
    }
}
