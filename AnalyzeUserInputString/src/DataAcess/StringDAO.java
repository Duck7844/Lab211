/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAcess;

import Common.Library;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author ROG
 */
public class StringDAO {
    private static StringDAO instance = null;
    Library l;

    public StringDAO() {
        l = new Library();
    }

    public static StringDAO Instance() {
        if (instance == null) {
            synchronized (StringDAO.class) {
                if (instance == null) {
                    instance = new StringDAO();
                }
            }
        }
        return instance;
    }

    public boolean checkSquareNumber(int n) {
        if (Math.sqrt(n) * Math.sqrt(n) == n) {
            return true;
        }
        return false;
    }

    public void getNumber(String inputString) {
        try {
            HashMap<String, ArrayList<Integer>> hmNumber = new LinkedHashMap<>();
            String number = inputString.replaceAll("\\D+", ",");
            if (number.charAt(0) == ',') {
                number = number.substring(1);
            }
            if (number.charAt(number.length() - 1) == ',') {
                number = number.substring(0, number.length() - 1);
            }
            String[] listNumber = number.split(",");
            int lenNumber = listNumber.length;

            ArrayList<Integer> liPerfectSquare = new ArrayList<>();
            ArrayList<Integer> liOdd = new ArrayList<>();
            ArrayList<Integer> liEven = new ArrayList<>();
            ArrayList<Integer> liAll = new ArrayList<>();
            for (int i = 0; i < lenNumber; i++) {
                int numberCheck = Integer.parseInt(listNumber[i]);
                if (numberCheck % 2 == 1) {
                    liOdd.add(numberCheck);
                }
                if (numberCheck % 2 == 0) {
                    liEven.add(numberCheck);
                }
                if (checkSquareNumber(numberCheck)) {
                    liPerfectSquare.add(numberCheck);
                }
                liAll.add(numberCheck);
            }
            hmNumber.put("Perfect Square Numbers: ", liPerfectSquare);
            hmNumber.put("Odd Numbers: ", liOdd);
            hmNumber.put("Even Numbers: ", liEven);
            hmNumber.put("All Numbers: ", liAll);

            for (Map.Entry m : hmNumber.entrySet()) {
                System.out.println(m.getKey() + " " + m.getValue());
            }
        } catch (Exception e) {
            return;
        }
    }

    public void getCharacter(String inputString) {
        try {
            HashMap<String, String> hmString = new LinkedHashMap<>();
            String uppercase = inputString.replaceAll("\\W|[0-9]|[a-z]", "");
            String lowercase = inputString.replaceAll("\\W|[0-9]|[A-Z]", "");
            String special = inputString.replaceAll("\\w", "");
            String allCharacter = inputString.replaceAll("\\d", "");
            hmString.put("Uppercase: ", inputString.replaceAll("\\W|[0-9]|[a-z]", ""));
            hmString.put("Lowercase: ", inputString.replaceAll("\\W|[0-9]|[A-Z]", ""));
            hmString.put("Special: ", inputString.replaceAll("\\w", ""));
            hmString.put("All Character: ", inputString.replaceAll("\\d", ""));
            for (Map.Entry m : hmString.entrySet()) {
                System.out.println(m.getKey() + " " + m.getValue());
            }
        } catch (Exception e) {
            return;
        }
    }

    public void analysisString() {
        while (true) {
            String inputString = l.inputString("Input String: ");
            System.out.println("Result Analysis:");
            getNumber(inputString);
            getCharacter(inputString);
            if (!l.checkInputYN("Do you want continue?(Y/N): ")) {
                System.exit(0);
            }
        }

    }
}