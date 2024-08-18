package com.company;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter any year");
        int year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        sc.close();
    }

            public static boolean isLeapYear(int year){
                if (year %4==0){
                    if(year % 100 ==0) {
                        if (year % 400 == 0) {
                            return true;
                        } else {
                            return false;
                        }
                    }else {
                        return true;

                        }
                    else {
                    return false;
                }
              
            }
        }

