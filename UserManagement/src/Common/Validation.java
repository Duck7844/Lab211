/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author ROG
 */
public class Validation {
    private final static String VALID_USERNAME = "^\\S{5}\\S*$";
    private final static String VALID_PASSWORD = "^\\S{6}\\S*$";

    public boolean checkFileExist() {
        File file = new File("src\\user.dat");
        if (!file.exists()) {
            try {
                System.out.println("File not found.");
                file.createNewFile();
                System.out.println("File created.");
                return false;
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return true;
    }

    public boolean checkInputUsername(String result) {
        if (!result.matches(VALID_USERNAME)) {
            System.out.println("You must enter least at 5 character, and no space!");
            return false;
        }
        if (!checkUsernameExist(result)) {
            System.out.println("Username is already exist!");
            return false;
        }
        return true;
    }

    public boolean checkInputUsernameLogin(String result) {
        if (!result.matches(VALID_USERNAME)) {
            System.out.println("You must enter least at 5 character, and no space!");
            return false;
        }
        return true;
    }

    public boolean checkInputPassword(String result) {
        if (result.matches(VALID_PASSWORD)) {
            return true;
        }
        System.out.println("You must enter least at 6 character, and no space!");
        return false;
    }

    public boolean checkUsernameExist(String username) {
        File file = new File("src\\user.dat");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] account = line.split(";");
                if (username.equalsIgnoreCase(account[0])) {
                    return false;
                }
            }
            bufferedReader.close();
            fileReader.close();
            return true;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return true;
    }
}
