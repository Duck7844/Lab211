/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import model.Candidate;
/**
 *
 * @author ROG
 */
public class CheckInput
{
    private final static Scanner in = new Scanner(System.in);
        private static final String PHONE_VALID = "^\\d{10}\\d*$";
        private static final String EMAIL_VALID = "^[A-Za-z0-9.+-_%]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$";
        public static int checkInputLimit(int min, int max){
            while (true){
                try {
                    int result = Integer.parseInt(in.nextLine().trim());
                    if (result < min || result > max){
                        throw new NumberFormatException();
                    }
                    return result;
                }
                catch (NumberFormatException e){
                    System.out.println("Please input number again");
                }
            }
        } 
        public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
    public static boolean checkInputYN() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.out.print("Enter again: ");
        }
    }
    public static String checkInputPhone() {
        while (true) {
            String result = checkInputString();
            if (result.matches(PHONE_VALID)) {
                return result;
            } else {
                System.out.print("Enter again: ");
            }
        }
    }
    public static String checkInputEmail() {
        while (true) {
            String result = checkInputString();
            if (result.matches(EMAIL_VALID)) {
                return result;
            } else {
                System.out.print("Enter again: ");
            }
        }
    }
    public static String checkInputGraduationRank() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Excellence")
                    || result.equalsIgnoreCase("Good")
                    || result.equalsIgnoreCase("Average")
                    || result.equalsIgnoreCase("Poor")) {
                return result;
            } else {
                System.out.print("Enter again: ");
            }
        }
    }
    public static boolean checkIdExist(ArrayList<Candidate> candidates, String id) {
        for (Candidate candidate : candidates) {
            if (candidate.getId().equalsIgnoreCase(id)) {
                System.err.println("Id exist.");
                return false;
            }
        }
        return true;
    }
      public static int checkInputExprience(int birthDate) {
        int yearCurrent = Calendar.getInstance().get(Calendar.YEAR);
        int age = yearCurrent - birthDate;
        while (true) {
            int yearExperience = checkInputLimit(1, 100);
            if (yearExperience > age) {
                System.err.println("Experience must be smaller than age");
            } else {
                return yearExperience;
            }
        }

    }
}
