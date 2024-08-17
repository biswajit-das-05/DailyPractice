package com.company;
import java.util.Scanner;
public class ch4_practice_set {
    public static void main(String[] args) {
        //q1
//        int age =10;
//        if (a==11){
//            System.out.println();
//        }

        //q2

        byte s1,s2,s3;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the physics mark");
        s1 = sc.nextByte();
        System.out.println("enter the chemistry mark"); 
        s2 = sc.nextByte();
        System.out.println("enter the math mark");
        s3 = sc.nextByte();
        float avg = (s1+s2+s3)/3.0f;
        System.out.println("your ovar all percentage is : " + avg);
        if (avg >=40 && s1 >= 37 && s2 >= 37 && s3 >= 37) {
            System.out.println("congratulations , you are promoted");
        }
else {
            System.out.println("sorry , you are not promoted");
        }

        //q3
        float tax = 0;
        if(tax<2.5){
            tax = tax +0;
            
        }

      }
}
