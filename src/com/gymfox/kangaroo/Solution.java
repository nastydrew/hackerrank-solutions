package com.gymfox.kangaroo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    private static File output = new File(System.getenv("PWD")+"/output");
    private static final Scanner scanner = new Scanner(System.in);

    static String kangaroo(int x1, int v1, int x2, int v2) {
        String result = null;

        for (; x1 <= x2; ) {
            if ( x1 == x2 ) {
                result = "YES";
            } else {
                result = "NO";
            }
            x1 += v1;
            x2 += v2;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
