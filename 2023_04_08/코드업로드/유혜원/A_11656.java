import java.io.*;
import java.util.*;

public class A_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        String[] s = string.split("");
        String[] st = s;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++) {
                st[i] += s[j];
            }
        }
        Arrays.sort(st);
        for (int i = 0; i < string.length(); i++) {
            System.out.println(st[i]);
        }
    }
}