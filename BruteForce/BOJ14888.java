package BruteForce;

import java.io.*;
import java.util.StringTokenizer;

//연산자 끼워넣기
public class BOJ14888 {

    static void input(){
        FastReader scan = new FastReader();
        N = scan.nextInt();
        nums = new int[N+1];
        operator = new int[5];
        order = new int[N+1];

        for(int i = 1; i<=N; i++)
        {
            nums[i] = scan.nextInt();
        }
        for(int i = 1; i<=4; i++){
            operator[i] = scan.nextInt();
        }

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
    }

    static int N,max, min;
    static int[] nums,operator,order;

    public static void main(String[] args) {
        input();
        rec_fuc(1);
        System.out.println(max);
        System.out.println(min);
    }

    static int calculate() {
        int value = nums[1];
        for (int i = 1; i <= N - 1; i++) {
            if (order[i] == 1) {
                value = value + nums[i + 1];
            }
            if(order[i] == 2){
                value = value - nums[i + 1];
            }
            if(order[i] == 3){
                value = value * nums[i + 1];
            }
            if(order[i] == 4){
                value = value / nums[i + 1];
            }
        }
        return value;
    }

    static void rec_fuc(int k){
        if(k==N){
            //완성된 식 계산
            int value = calculate();
            max = Math.max(value,max);
            min = Math.min(value,min);
        }
        else{
            //k번쨰 연산자 선택
            for(int i = 1; i<=4; i++)
            {
                //사용할 수 있는 연산자가 남아있는지
                if(operator[i] >= 1){
                    operator[i]--;
                    order[k] = i;
                    rec_fuc(k+1);
                    operator[i]++;
                    order[k] =0;

                }
            }
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
