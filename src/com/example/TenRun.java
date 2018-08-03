package com.example;


public class TenRun {
    public static void main(String[] args) {
        TenRun obj1 = new TenRun();
        int output[] = obj1.tenRun(new int[]{2, 10, 5, 8, 20, 25, 35, 50, 9, 11, 30, 5});
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + "  ");
        }
    }

    public int[] tenRun(int[] arg) {
        int i, j, temp = 0;
        for (i = 0; i < arg.length; i++) {
            if (arg[i] % 10 == 0) {
                temp = arg[i];
            }
            for (j = i + 1; j < arg.length; j++) {
                if (arg[j] % 10 == 0) {
                    break;
                } else {
                    System.out.println("i=" + i + "j=" + j);
                    arg[j] = temp;
                }
            }
        }
        return arg;
    }
}
