package com.bridglabz.LogicalProgramsDay6;
import java.util.Scanner;
public class LogicalProgramsDay6 {
    public static void main(String[] args) {
        fibonacciSeries();
    }
    public static void fibonacciSeries(){
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int a=0, b=1;
        int count=0;
        int number=sc.nextInt();
        for(int i=2;i<=number;i++){
            count=a+b;
            System.out.println(count+" ");
            a=b;
            b=count;
        }
    }
}
