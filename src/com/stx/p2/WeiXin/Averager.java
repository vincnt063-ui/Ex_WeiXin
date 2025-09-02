package com.stx.p2.WeiXin;
public class Averager {
    public static void main(String[] args) {
        int[] S = {100, 90,96, 98, 98,96};
        int min = S[0];
        int max = S[0];
        int sum = 0;
        int renshu = S.length;

        for (int s : S) {
            if (s < min) min = s;
            if (s > max) max = s;
            sum += s;
        }
        double avg = (double) (sum - min - max) / (S.length - 2);
        int lastavg = (int)Math.ceil(avg);
        System.out.printf("参评人数%d人，最低分数%d，最高分数%d，平均分%d", renshu, min, max, lastavg);
    }
}
