package BruteForce;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ15650 {

    static StringBuilder sb = new StringBuilder();

    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        M =scan.nextInt();
        selected = new int[M+1];
        used = new int[N+1];
    }

    static int N,M;
    static int[] selected, used;
    public static void main(String[] args) {
        input();
        rec_func(1);
        System.out.println(sb);
    }

    static void rec_func(int k){
        if(k == M+1){
            for(int i = 1; i<=M; i++)
            {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        }
        else{
            for(int i = 1; i<=N; i++)
            {
                if(i > selected[k-1] && used[k] == 0){
                    used[k] = 1;
                    selected[k] = i;
                    rec_func(k+1);
                    used[k] = 0;
                    selected[k] = 0;

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
