package sias.Bean;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
//        System.out.println(new Date(0L));// 1970-01-01 00:00:00
        Date date = new Date();
        Long  time = System.currentTimeMillis();
        date.setTime(time);
        System.out.println(time);
        System.out.println(date);
    }
}
