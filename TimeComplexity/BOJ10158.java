package TimeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ10158 {
    static int w,h,time,x,y;

//    static public void solution(int currentX, int currentY){
//        int dx = 1;
//        int dy = 1;
//        int timeX = time % (2*w);
//        int timeY = time % (2*h);
//
//        while (timeX -->0) {
//            if (currentX == w) {
//                dx = -1;
//            } else if(currentX==0) {
//                dx = 1;
//            }
//            currentX += dx;
//        }
//        while (timeY --> 0){
//            if(currentY==h){
//                dy = -1;
//            }
//            else if(currentY==0){
//                dy = 1;
//            }
//            currentY += dy;
//        }
//        System.out.println(currentX+" "+currentY);
//    }

    static public void solution(int x,int y){
        int currentX = (x+time) %(2*w);
        int currentY = (y+time) %(2*h);

        if(currentX >w)
        {
           currentX =  2*w -currentX;

        }
        if (currentY>h){
            currentY =  2*h -currentY;
        }

        System.out.println(currentX+" "+currentY);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        w = Integer.parseInt(st.nextToken());
        h =Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        x=Integer.parseInt(st.nextToken());
        y=Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        time =  Integer.parseInt(st.nextToken());

        solution(x,y);
    }
}
