package com.course.tests.Day11Practice;

import org.testng.annotations.Test;

import java.util.Scanner;

public class JavaCodingPractice {
    @Test
    public void EvenNumber() {
        int num = 5;
        if (num % 2 == 0) {
            System.out.println("This is even number");
        } else {
            System.out.println("Its is odd number");

        }

    }

    @Test
    public void OddNumber() {//jeśli chę żeby użytkownik/user wpisał np liczbę
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(num + " is even number");

    }

    @Test
    public boolean PrimeNumber() {//liczby pierwsze, dzieli się przez 1 i przez samą siebie
        int num1=10;
        if(num1<2) {
            return false;
        }
            for(int i=2; i<num1;i++) {
                if (num1 % i == 0) {
                   return false;
                }
            }
                    return true;
                }
            }




