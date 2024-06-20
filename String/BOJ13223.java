package String;

import java.util.Scanner;

public class BOJ13223 {
    //소금 폭탄
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String current = sc.nextLine();
        String drop = sc.nextLine();

        String[] currentUnit = current.split(":");
        int currentHour = Integer.parseInt(currentUnit[0]);
        int currentMinute = Integer.parseInt(currentUnit[1]);
        int currentSecond = Integer.parseInt(currentUnit[2]);
        int currentSecondAmount = currentHour * 3600 + currentMinute * 60 + currentSecond;

        String[] dropUnit = drop.split(":");
        int dropHour = Integer.parseInt(dropUnit[0]);
        int dropMinute = Integer.parseInt(dropUnit[1]);
        int dropSecond = Integer.parseInt(dropUnit[2]);
        int dropSecondAmount = dropHour * 3600 + dropMinute * 60 + dropSecond;

        int needSecondAmont = dropSecondAmount - currentSecondAmount;
        if(needSecondAmont <= 0){ //0일때 24:00:00로 출력되야함
            needSecondAmont += 3600 * 24;
        }

        int needHour = needSecondAmont / 3600;
        int needMinute = (needSecondAmont % 3600) / 60;
        int needSecond = needSecondAmont % 60;

        System.out.printf("%02d:%02d:%02d",needHour,needMinute,needSecond);


    }
}
