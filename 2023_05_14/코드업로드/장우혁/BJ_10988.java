import java.util.*;
import java.io.*;

public class BJ_10988 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String str = bf.readLine();
        int size = str.length();
        for(int i = 0; i < size/2; i++) {
            if(str.charAt(i) == str.charAt(size -1 -i)){
                System.out.println(1);
            }
        }

    }
}