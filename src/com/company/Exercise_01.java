package com.company;
import java.util.Scanner;
public class Exercise_01 {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
        System.out.println("enter the physics number : ");
        int physics = sc.nextInt();
        System.out.println("enter the chemistry number : ");
        int chemistry = sc.nextInt();
        System.out.println("enter the math number : ");
        int math = sc.nextInt();
        System.out.println("enter the biology number : ");
        int biology = sc.nextInt();
        System.out.println("enter the odia number : ");
        int odia = sc.nextInt();

        float percentage = ((physics +chemistry+math + biology +odia)/500.0f)*100 ;
        System.out.println("percentage : ");
        System.out.println(percentage);
    }
}
