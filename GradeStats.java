/*
 * Michael Masters
 * Module 4 CTA Option 2 - Grade Calulator
 * 9/10/2023
 */

 import java.util.Scanner;
 import java.util.Arrays;

 class GradeStats {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float[] gradeBook = new float[10];
        float sumGrades = 0;

        System.out.print("Enter 10 grades: ");
        for(int i = 0; i < gradeBook.length; i++) {
            gradeBook[i]=sc.nextFloat();
        }

        for(int i = 0; i < gradeBook.length; i++) {
            sumGrades += gradeBook[i];
        }

        Arrays.sort(gradeBook);
        float maxGrade = gradeBook[9];
        float minGrade = gradeBook[0];
        float averageGrade = (sumGrades/gradeBook.length);

        System.out.printf("Max Grade is: " + "%.2f", maxGrade);
        System.out.printf("\nMinimum Grade is: " + "%.2f", minGrade);
        System.out.printf("\nAverage Grade:" + "%.2f", averageGrade);
        
        sc.close();
    }

 }
