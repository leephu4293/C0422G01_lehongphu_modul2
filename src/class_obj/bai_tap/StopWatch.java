package class_obj.bai_tap;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    private Date starTime;
    private Date endTime;

    public StopWatch() {
        starTime = new Date();
    }

    public Date getStarTime() {
        return starTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Date start() {
        return starTime = new Date();
    }

    public Date stop() {
        return endTime = new Date();
    }

    public long getElapsedTime() {
        return endTime.getTime() - starTime.getTime();
    }

    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        System.out.println("1.Bat dau chay "+ "\n"+"2.ket thuc chay" + "\n"+ "3.hien thi tg");
        Scanner sc = new Scanner(System.in);
        int num;
        do {
             num = sc.nextInt();
            switch (num) {
                case 1:
                    time.start();
                    break;
                case 2:
                    time.stop();
                    break;
                case 3:
                    System.out.println("thoi gian chay " + time.getElapsedTime());
                    break;
            }
        } while (num!=3);
    }

}