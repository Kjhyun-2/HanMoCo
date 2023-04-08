import java.io.*;
import java.util.*;


public class B_10828 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));    //bufferedreader 객체 생성
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  //bufferedwriter 객체 생성
    static StringTokenizer tokens;
    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(bf.readLine());      //bufferedreader를 이용하여 정수 입력받기.
        Stack<Integer> stack = new Stack<>();           //stack 생성   //tokens 객체 생성


        for(int i = 0; i < num; i++) {                  //num만큼 명령 수행
            String temp = bf.readLine();                //temp에 명령어 저장
            tokens = new StringTokenizer(temp);         //tokens로 출력
            
            switch(tokens.nextToken()) {

            case "push":                                        //push -> 값 넣기
                stack.push(Integer.parseInt(tokens.nextToken()));
                break;

            case "pop":
                if(stack.empty() == true) {                      //stack이 비었으면 -1 출력
                    bw.write(String.valueOf(-1 + "\n"));
                }       
                else {
                    bw.write(String.valueOf(stack.peek() + "\n"));                
                    stack.pop();                                //pop -> 값 빼기
                }
                break;

            case "size":                                        //stack의 크기 출력
                bw.write(String.valueOf(stack.size() + "\n"));
                break;

            case "empty":                                       //비었으면1, 아니면0출력
                if(stack.empty() == true) 
                    bw.write(String.valueOf(1 + "\n"));
                
                else if(stack.empty() == false)
                    bw.write(String.valueOf(0 + "\n"));
                    
                break;

            case "top":                                         //stack의 가장 상단의 값 출력
                if (stack.empty() == true)
                    bw.write(String.valueOf(-1 + "\n"));

                else if (stack.empty() == false)
                    bw.write(String.valueOf(stack.peek() + "\n"));

                break;

            }
        }
        bw.flush();



        
    }
}