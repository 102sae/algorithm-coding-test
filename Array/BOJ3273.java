package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++)
        {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());
        int count = 0;

        boolean[] exist = new boolean[100001];

        for(int i =0; i<N; i++)
        {
            exist[nums[i]] = true;
        }

        for(int i = 0; i<(x-1)/2; i++)
        {
            if(i<=100000 && x-i <= 100000){
                count += (exist[i] && exist[x-i]) ? 1 : 0;
            }
        }
        System.out.println(count);
    }
}
