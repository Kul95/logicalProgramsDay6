package com.bridglabz.LogicalProgramsDay6;
import java.util.Scanner;
public class LogicalProgramsDay6 {
    public static void main(String[] args) {
        fibonacciSeries();
        perfectNumber();
        primeNumber();
        reverseNumber();
        coupneCode();
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
    public static void perfectNumber(){
        int sum=0;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=1;i<number;i++){
            if(number%i==0){
                 sum=sum+i;
            }
        }
        if(number==sum) {
            System.out.println(number + ": Perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
    public static void primeNumber(){
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int count=0;
        for(int i=2;i<=number-1;i++){
            if(number%i==0){
                count=count+1;
            }
        }
        if(count>0){
            System.out.println(number+": is not a prime number.");
        }else{
            System.out.println(number+" : is a prime number.");
        }
    }
    public static void reverseNumber(){
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int rev=0;
        while(number>0){
            int rem=number%10;
            rev=rev*10+rem;
            number=number/10;
        }
        System.out.println(rev);
    }
    public static void coupneCode(){
//    Scanner sc=new Scanner(System.in);
//    String str=sc.next().toString();
        char[] ch="123456789 abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int max=4555;
        int random= (int)(Math.random()*max);
        StringBuffer sb=new StringBuffer();
        while (random>0)
        {
            sb.append(ch[random % ch.length]);
            random=random/ch.length;
        }
        String cpCode=sb.toString();
        System.out.println("Coupon Code: "+cpCode);
    }
}
