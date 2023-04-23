import java.io.*;

public class B_1094 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int cnt = 0;
        int X = Integer.parseInt(bf.readLine());
        int sausage = 64;

        while(sausage > 0) {        
            if(sausage > X) {       //소세지가 X보다 크면
                sausage /= 2;       //반으로 쪼개
            }
            else if(sausage <= X) {  //남은 소세지가 x보다 작으면 풀로 붙일거야
                X -= sausage;       //1
                cnt ++;             //몇번 붙였는지!!
            }
        }
        bw.write(cnt);
        bw.flush();
    }
}
