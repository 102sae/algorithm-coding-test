package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//성지키기
public class BOJ1236 {
    static int N,M, count = 0;
    static int[][] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new int[N][M];

        for(int i = 0; i<N;i++)
        {
            st = new StringTokenizer(br.readLine());
           String string = st.nextToken();
            for(int j = 0; j<M; j++) {
               graph[i][j] = string.charAt(j);
            }
        }
        int existRowCount = N;
        int existColCount = M;

        boolean[] existRow = new boolean[N];
        boolean[] existCol = new boolean[M];

        for(int i = 0; i<N; i++)
        {
            for(int j = 0; j<M; j++)
            {
                if(graph[i][j]=='X') {
                    existRow[i]=true;
                    existCol[j]=true;
                }
            }
        }


        for(int i =0; i<N; i++){
            if(existRow[i])
            {
                existRowCount--;
            }
        }

        for(int j =0; j<M; j++)
        {
            if(existCol[j]){
                existColCount--;
            }
        }

        count = Math.max(existRowCount,existColCount);
        System.out.println(count);

    }


}
