package String;

import java.util.Scanner;

public class BOJ2744 {
    //대소문자 바꾸기
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] characters = str.toCharArray();

        for (char c : characters){
            if(Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            }
            else{
                sb.append(Character.toUpperCase(c));
            }
        }
        System.out.println(sb);

    }
}
