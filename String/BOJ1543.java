package String;

import java.util.Scanner;

public class BOJ1543 {
    //문서 검색
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();

        int startIndex = 0;
        int count = 0;


        while(true){
            int findIndex = doc.indexOf(word,startIndex); //찾을문자, 시작할 위치
            if(findIndex < 0){
                break;
            }
            count++;
            startIndex = findIndex + word.length();
        }
        System.out.println(count);
    }
}
