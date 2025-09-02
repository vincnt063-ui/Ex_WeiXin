package com.stx.p3.WeiXin;
import java.util.Scanner;
public class Beishu {
    public static void main(String[] args) {
        System.out.println("输入a b");
        Scanner A = new Scanner(System.in);
        int a = A.nextInt();
        int b = A.nextInt();
        if (a < 1 || a > 1000 || b < 1 || b > 1000) {
            System.out.println("必须满足满足 1 ≤ a ≤ b ≤ 1000");
        } else {
            int count = 0;
            for (int i = a; i <= b; i++) {
                if (i % 3 == 0) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
