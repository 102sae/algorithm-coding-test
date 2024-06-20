package String;

import java.util.Scanner;

public class BOJ1157 {
    //단어공부
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        int[] alphabet = new int[26];

        for(int i=0; i<string.length();i++)
        {
            alphabet[Character.toLowerCase(string.charAt(i))-'a']++;
        }

        int max = 0;
        int max_index = 0;
        for(int i=0; i<26;i++) {
            if(Math.max(max, alphabet[i])== alphabet[i]){
                max = Math.max(max, alphabet[i]);
                max_index = i;
            }
        }

        int count = 0;
        for(int i = 0; i<26;i++)
        {
            if(alphabet[i]==max){
                count += 1;

            }
            if(count == 2){
                System.out.println("?");
                return ;
            }
        }

        char answer = (char)(max_index+65);
        System.out.println(answer);
    }
}
