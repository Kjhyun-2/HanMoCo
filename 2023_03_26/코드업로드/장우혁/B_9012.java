import java.io.*;

public class B_9012 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));    //bufferedreader 객체 생성
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  //bufferedwriter 객체 생성
    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(bf.readLine());      //num에 테스트 개수 입력받기
        String str, vps = "";                           
        char x = '(', y = ')';                          //()비교해줄 x와 y 선언
        int cnt = 0;                                    //()갯수세줄 cnt선언
        for(int i = 0; i < num; i++) {                  //테스트 횟수만큼
            str = bf.readLine();                        //str에 (()(()()))같은거 받기
            cnt = 0;                                    //횟수 초기화;
            for(int j = 0; j < str.length(); j++) {     //str길이만큼
                if(x == str.charAt(j)) {                //charAt으로 str의 인덱스번호에 있는 괄호랑 x랑 비교해주기
                    cnt++;
                }
                else if(y == str.charAt(j)){            //마찬가지로 y랑 비교해주기
                    cnt--;
                }

                if(cnt < 0) {                           //)이게 먼저나오면 바로 break;
                    vps = "NO";
                    break;
                }
            }
            if(cnt == 0) {                              //괄호 개수 같으면 YES
                vps = "YES";
            }
            else if(cnt != 0) {                         //다르묜 NO(
                vps = "NO";
            }
            bw.write(vps + "\n");                       //write에 vps 저장해두고
            bw.flush();                                 //바로 flush
        }
        
    }

    
}
