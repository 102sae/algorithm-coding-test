package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1269_2 {

    static int N,M,V;
    static int[][] adj ;
    static boolean[] visited;

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        adj = new int[N+1][N+1];


        for(int i = 0; i<M; i++)
        {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            adj[x][y] = 1;
            adj[y][x] = 1;
        }
        process();

    }

    static void process(){
        visited =  new boolean[N+1];
        dfs(V);
        sb.append("\n");
        for(int i = 1; i<=N; i++)
        {
            visited[i] = false;
        }
        bfs(V);

        System.out.println(sb);
    }

    static void dfs(int start){
        visited[start] = true;
        sb.append(start).append(" ");
        for(int i = 1; i<=N; i++)
        {
            if(visited[i]){
                continue;
            }
            if(adj[start][i]==0){
                continue;
            }
            dfs(i);
        }
    }
    static void bfs(int x){
        Queue<Integer> queue = new LinkedList<>();

        queue.add(x);
        visited[x] = true;

        while(!queue.isEmpty()){
            x = queue.poll();
            sb.append(x).append(' ');
            for(int i=1; i<=N; i++)
            {
                if(adj[x][i] == 0 || visited[i]) continue;
                queue.add(i);
                visited[i] = true;
            }

        }
    }
}
