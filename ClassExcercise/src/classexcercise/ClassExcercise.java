/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classexcercise;

import java.util.Scanner;

/**
 *
 * @author Kyriakos
 */
public class ClassExcercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = yourName();
        String gender = yourGender(name);
        int age = yourAge(name);
        ageDivision(age);
        chooseSeason(name);
        bmi(name);
        response(name, gender, age);

    }

    static void question(String message) {
        System.out.println(message);
    }

    static String yourName() {
        Scanner input = new Scanner(System.in);
        question("What is your name?");
        String yourName = input.next();
        return yourName;
    }

    static String yourGender(String name) {
        Scanner input = new Scanner(System.in);
        question(name + " ,are you  male(M) or female(F)");
        String yourGender = input.next();
        return yourGender;
    }

    static Integer yourAge(String name) {
        Scanner input = new Scanner(System.in);
        question(name + " ,what is your age?");
        int yourAge = input.nextInt();
        return yourAge;
    }

    static void ageDivision(int age) {

        int agerange;
        if ((age >= 0) && (age <= 5)) {
            agerange = 6 - age;
            question("You are too young for this app.Come back in " + agerange + " years when you will be a student.");
            question("In 2040 you will be " + (age + 20 ));
        } else if ((age >= 6) && (age <= 18)) {
            agerange = 18 - age;
            question("Keep up..." + agerange + " more years left and afterwards you will make money.");
            question("In 2040 you will be " + (age + 20 ));
        } else if ((age >= 19) && (age <= 40)) {
            agerange = age - 18;
            question("You finished school " + agerange + " years ago.");
            question("In 2040 you will be " + (age + 20 ));
        } else {
            question("In 1980 you were " + (age - 40) + " and in 2040 you will be " + (age + 20));
        }
    }

    static void chooseSeason(String name) {
        Scanner input = new Scanner(System.in);
        question("what is your favorite season," + name + "?Choose a number.");
        question("1.Winter");
        question("2.Spring");
        question("3.Summer");
        question("4.Autumn");
        int season = 5;
        while (season > 4 ){
            season = input.nextInt();
        if (season == 1) {
            question("It must be cold outside");
        } else if (season == 2) {
            question("Ohh,flowers are very beautiful these days!");
        } else if (season == 3) {
            question("Let's go swimming");
        } else if (season == 4) {
            question("The trees are full of brown leaves");
        } else {
            question("Invalid option,try again " + name);
        }
    }}

    static void bmi(String name) {
        Scanner input = new Scanner(System.in);
        question("Enter your height " + name);
        double height = input.nextDouble();
        question("Enter your weight " + name);
        int weight = input.nextInt();
        double bmi = weight / (height * height);
        if (bmi <= 18.5) {
            question("Underweight");
        } else if ((bmi >= 18.5) && (bmi < 25)) {
            question("Normal weight");
        } else if ((bmi >= 25) && (bmi < 29.9)) {
            question("Overweight");
        } else {
            question("Obesity");
        }
    }

    static int luckyDay(int age) {
        int ageInDays = age * 365;
        int sum = 0;
        while (ageInDays > 0) {
            sum = sum + ageInDays % 10;
            ageInDays = ageInDays / 10;
        }

        int luckyDay = 0;
        if ((sum == 0) || (sum % 7 == 0)) {
            luckyDay = 0;
            question("Your lucky day is Monday.");
        } else if ((sum == 1) || (sum % 7 == 1)) {
            luckyDay = 1;
            question("Your lucky day is Tuesday.");
        } else if ((sum == 2) || (sum % 7 == 2)) {
            luckyDay = 2;
            question("Your lucky day is Wednesday.");
        } else if ((sum == 3) || (sum % 7 == 3)) {
            luckyDay = 3;
            question("Your lucky day is Thursday.");
        } else if ((sum == 4) || (sum % 7 == 4)) {
            luckyDay = 4;
            question("Your lucky day is Friday.");
        } else if ((sum == 5) || (sum % 7 == 5)) {
            luckyDay = 5;
            question("Your lucky day is Saturday.");
        } else if ((sum == 6) || (sum % 7 == 6)) {
            luckyDay = 6;
            question("Your lucky day is Sunday.");
        }
        return luckyDay;
    }

    static void response(String name, String gender, int age) {
        Scanner input = new Scanner(System.in);
        int day = luckyDay(age);
        if ((day == 2) && (age >= 20) && (age <= 40)) {
            if ((age >= 20) && (age <= 25)) {
                question("Welcome " + name);
            } else if ((age > 25) && (gender.equals("M"))) {
                question("Welcome Mr." + name);
            } else if (gender.equals("F")) {
                question("Are you married?");
                String married = input.next();
                if (married.equals("yes")) {
                    question("Welcome Mrs " + name);
                } else {
                    question("Welcome Ms " + name);
                }
            }
        } else {
            question("It's not your lucky day.");
        }

    }
}
