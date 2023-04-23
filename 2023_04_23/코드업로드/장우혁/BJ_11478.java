import java.io.*;

public class BJ_11478 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int cnt = 0, cnt1 = 0;
        String str = bf.readLine();
        int size = str.length();
        String[] temp = new String[size];
        for(int i = 1; i < str.length() + 1; i++) { 
            for(int j = 0; j < str.length() - i+1; j++) {
                temp[j] = str.substring(j, j+i);        //문자열을 잘라내서 temp배열에 저장
                cnt1 ++;
                cnt++;                                //temp에 문자가 몇개가 들어가는지
            }
            for(int k = 0; k < cnt1 -1; k++) {          //temp배열에서 중복되는것 빼주기
                                                        //a, b, a, b, c먼저 돌고 그다음은
                for(int l = k+1; l < cnt1; l++) {       //ab, ba, ab, ac 저장돼서 돌고..
                    if(temp[k].equals(temp[l])) {       //k와 l이 같으면
                        cnt--;                          //한개 빼
                    }
                }
            }
            cnt1 = 0;
        }
        System.out.println(cnt);
    }
}
