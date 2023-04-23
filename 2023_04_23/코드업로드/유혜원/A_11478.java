import java.io.*;
import java.util.HashSet;

public class A_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine(); // 문자열 입력 받기
        HashSet<String> hash = new HashSet<>(); // 해쉬 선언
        String string = ""; // string 초기화
        for (int i = 0; i < S.length(); i++) {
            string = ""; // string 초기화
            for (int j = i; j < S.length(); j++) {
                string += S.substring(j, j + 1); // 초기화된 string에 해당 값을 더해줌 -> S의 j부터 j+1 전까지(하나씩)
                hash.add(string);
            }
        }
        System.out.println(hash.size());
    }
}

// a ab abc abcd
// b bc bcd
// c cd
// d