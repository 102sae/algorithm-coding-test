package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ10431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());


        for(int t = 0; t < N; t++)
        {
            int count = 0 ;
            st = new StringTokenizer(br.readLine());
            st.nextToken(); // 순서

            ArrayList<Integer> array = new ArrayList<>();
            array.add(Integer.parseInt(st.nextToken()));
            for(int k = 1; k < 20; k++)
            {
                int next = Integer.parseInt(st.nextToken());
                array.add(next);

                for(int i = 0; i<array.size(); i++){
                    if(array.get(i) > next){
                        count++;
                    }
                }
            }
            System.out.println(t+1+" " +count);
        }
    }
}
