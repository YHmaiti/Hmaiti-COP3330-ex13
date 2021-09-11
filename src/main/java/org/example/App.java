/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

// This program computes the value of an investment compounded over time.
// The program asks for the starting amount, the number of years
// to invest,the interest rate, and the number of periods per year
// to compound.

package org.example;

import java.util.*;
import java.lang.Math;

public class App {

    public static void main(String[] args) {

        // Initialize a scanner called scanner
        Scanner scanner = new Scanner(System.in);

        // prompt the user for the principal amount and the interest rate
        // and store them accordingly
        System.out.print("What is the principal amount? ");
        float principal = Float.valueOf(scanner.nextLine());
        System.out.print("What is the rate? ");
        float interestRate = Float.valueOf(scanner.nextLine());

        // check until the user enters a percentage instead of a decimal
        while (interestRate < 1) {

            System.out.print("Please enter the rate as a percentage instead:");
            interestRate = Float.valueOf(scanner.nextLine());

        }

        // convert the interest rate to a decimal from percentage
        interestRate = interestRate / 100;

        // prompt the user for the number of years and store it accordingly
        System.out.print("What is the number of years? ");
        int years = Integer.valueOf(scanner.nextLine());

        // prompt the user for the number of times the interest gets compounded
        // per year and store it accordingly
        System.out.print("What is the number of times the interest is compounded per year? ");
        int CompoundTimes = Integer.valueOf(scanner.nextLine());

        // calculate the investment based on the formula for compounded interest provided
        double investment  = principal * Math.pow((1 + interestRate / CompoundTimes),(CompoundTimes * years));

        // output to the console as described by the assignment
        // while ensuring that fractions of a cent are rounded up to the next penny.
        System.out.printf("$%.1f invested at %.1f%% for %d years compounded %d times per year is $%.2f.", principal, (interestRate*100), years, CompoundTimes, investment);

    }
}