/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Repository.UserRepository;
import View.Menu;
/**
 *
 * @author ROG
 */
public class Controller extends Menu<String>{
    static String[] mc = {"Create a new account", "Login system", "Exit"};
    UserRepository program;
    
    public Controller() {
        super("\nUSER MANAGEMENT", mc);
        program = new UserRepository();
    }
    @Override
    public void execute(int n) {
        switch(n) {
            case 1:
                program.createNewAccount();
                break;
            case 2:
                program.loginSystem();
                break;
            case 3:
                System.exit(0);
        } 
    }
}
