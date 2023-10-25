/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Menu;
import Repository.LoginRepository;
/**
 *
 * @author ROG
 */
import java.util.Locale;
public class Controller extends Menu<String>{
    static String[] mc = {"Vietnamese", "English", "Exit"};
    LoginRepository program;
    Locale vietnamese = new Locale("Vi");
    Locale english = Locale.ENGLISH;
    public Controller() {
        super("\nLogin Program", mc);
        program = new LoginRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                program.login(vietnamese);
                break;
            case 2:
                program.login(english);
                break;
            case 3:
                System.exit(0);
        }
    }
}
