package com.gymfox.grading_students;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    private static File output = new File(System.getenv("PWD")+"/output");
    private static final Scanner scan = new Scanner(System.in);
    /*
     * Complete the gradingStudents function below.
     */

    static int[] gradingStudents(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            if ( grades[i] >= 38 ) {
                int nextMultiple = 5 - ( grades[i] % 5 ) + grades[i];
                int diff = nextMultiple - grades[i];

                if ( diff < 3 ) {
                    grades[i] = nextMultiple;
                }
            }

        }

        return grades;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(output));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}
