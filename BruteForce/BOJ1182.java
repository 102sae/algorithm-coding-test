package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1182 {
    //부분 수열의 합
    static int N,S,sum;
    static int[] nums;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        nums = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i<=N; i++)
        {
            nums[i] = Integer.parseInt(st.nextToken());
        }


        rec_func(1, 0);

        if(S==0){
            //공집합 제거
            answer--;
        }
        System.out.println(answer);
    }

    static void rec_func(int k, int value){
        if(k == N+1){
           if(value == S){
               answer++;
           }
        }
        else{
            //k번째 원소를 포함 시킬지 말지
            //포함할래
            rec_func(k+1, value + nums[k]);
            //포함 안할래
            rec_func(k+1, value);
        }
    }
}
