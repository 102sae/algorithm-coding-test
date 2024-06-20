package String;

import java.util.Scanner;

public class BOJ1919 {
//애너그램 만들기
    static int[] countAlphabet(String string){
        int[] count = new int[26];
        for(int i=0; i<string.length();i++)
        {
            count[string.charAt(i)-'a']++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int[] countA = countAlphabet(s1); //apple : [1,0,0,0,1...]
        int[] countB = countAlphabet(s2);


        int count = 0;

        for(int i = 0; i < 26; i++)
        {
            count += Math.abs(countA[i]-countB[i]);
        }

        System.out.println(count);

    }
}
