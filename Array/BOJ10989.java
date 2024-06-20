package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[10001];

        while(N-- > 0){
            nums[Integer.parseInt(br.readLine())]++;
        }

        for(int i = 1; i<10001; i++) {
            while (nums[i]-- > 0) {
                sb.append(i).append("\n");

            }
        }

        System.out.println(sb);

    }
}
