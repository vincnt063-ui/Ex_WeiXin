package com.stx.p4.WeiXin;

import java.util.Scanner;
import java.util.Calendar;
public class XianXing {
    public static void main(String[] args) {
        System.out.println("输入车牌");
        Scanner Chepai = new Scanner(System.in);
        int a = 0;
        int b = 0;
        String A = Chepai.nextLine();
        if (A.length() == 8) {
            System.out.println("车牌" + A + "今天不限行");
        } else if (A.length() != 7) {
            System.out.println("车牌格式错误");
        } else {
            int week = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
            int today;
            if (week == Calendar.MONDAY)   {today = 1;}
            else if (week == Calendar.TUESDAY)   {today = 2;}
            else if (week == Calendar.WEDNESDAY)  {today = 3;}
            else if(week ==Calendar.THURSDAY)    {today =4;}
            else if (week == Calendar.FRIDAY)     {today = 5;}
            else today = 0;

            char c = A.charAt(A.length() - 1);
            if (c >= '0' && c <= '9') {
                a = (int)c-48;
            } else {
                char d = A.charAt(A.length() - 2);
                a = (int)d-48;
            }
            boolean xianxing = false;
            if (today == 1 && (a == 1 || a == 6)) xianxing = true;
            else if (today == 2 && (a == 2 || a == 7)) xianxing = true;
            else if (today == 3 && (a == 3 || a == 8)) xianxing = true;
            else if (today == 4 && (a == 4 || a == 9)) xianxing = true;
            else if (today == 5 && (a == 5 || a == 0)) xianxing = true;
            if (xianxing) {
                System.out.println("车牌" + A + "今天限行");
            } else {
                System.out.println("车牌" + A + "今天不限行");
            }
        }
    }

    }


