package org.danielk;

public class YearProgram {
    public static void main(String[] args) {


        int year = 2024;
        boolean leapYear;

        leapYear = (year % 4 == 0);

        if (leapYear) {
            System.out.println("It's a leap year!");
        } else {
            System.out.println("It's not a leap year!");
        }
    }
}

