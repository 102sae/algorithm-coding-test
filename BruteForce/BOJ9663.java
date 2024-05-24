package BruteForce;

import java.io.*;
import java.util.StringTokenizer;

//N-Queen
public class BOJ9663 {

    static public void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        col = new int[N+1];

    }

    static int N;
    static int[] col;
    static int answer = 0;

    public static void main(String[] args) {
        input();
        rec_func(1);
        System.out.println(answer);
    }

    static boolean attackable(int x1, int y1, int x2, int y2){
        if(y1 == y2 || x1 == x2){
            return true;
        }
        else if(x1+y1 == x2+y2){
            return true;
        }
        else if(x1-y1 == x2-y2){
            return true;
        }
        return false;
    }

    static void rec_func(int row){
        if(row==N+1){
            answer++;
        }
        else{
            for(int c = 1; c<= N; c++)
            {
                boolean possible = true;
               for(int i = 1; i<=row-1; i++) {
                    if(attackable(row,c,i,col[i])){
                        possible = false;
                        break;
                    }
               }
               if(possible){
                   col[row] = c;
                   rec_func(row+1);
                   col[row] = 0;
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
