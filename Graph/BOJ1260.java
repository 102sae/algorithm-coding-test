package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1260 {

    static int N,M,V;
    static ArrayList<Integer> adj[];
    static boolean[] visited;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V= Integer.parseInt(st.nextToken());

        adj = new ArrayList[N+1];
        visited = new boolean[N+1];


        for(int i =1; i<=N; i++)
        {
            adj[i] = new ArrayList<Integer>();
        }

        for(int i=1; i<=M; i++)
        {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            adj[x].add(y);
            adj[y].add(x);
        }

        for(int i = 1; i<=N; i++)
        {
            Collections.sort(adj[i]);
        }

        dfs(V);
        sb.append('\n');
        for(int i = 1; i<=N ; i++)
        {
            visited[i] = false;
        }
        bfs(V);

        System.out.println(sb);
    }

    static void dfs(int x){
        visited[x] = true;
        sb.append(x).append(" ");
       for(int y : adj[x]){
          if(visited[y]) continue;
          dfs(y);
       }
    }

    static void bfs(int x){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        visited[x] = true;

        while (!queue.isEmpty()){
            x = queue.poll();
            sb.append(x).append(" ");

            for(int y : adj[x]){
                if(visited[y]) continue;
                queue.add(y);
                visited[y] = true;
            }
        }
    }
}
