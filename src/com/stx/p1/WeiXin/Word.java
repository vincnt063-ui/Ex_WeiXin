package com.stx.p1.WeiXin;
import java.util.Scanner;
public class Word {
    public static void main(String[] args) {  // 输入单词
        Scanner Wd = new Scanner(System.in);
        String word = Wd.nextLine();  //获取
        int YuanyinCount = 0;
        int FuyinCount = 0;
        for (char ch : word.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {   //范围
                if (isYuan(ch)) {
                    YuanyinCount++;    //计数
                } else {
                    FuyinCount++;
                }
            }
        }
            System.out.println("元音"+YuanyinCount);
            System.out.println("辅音"+FuyinCount);

    }
        private static boolean isYuan(char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';  //啥子是元音
        }

}