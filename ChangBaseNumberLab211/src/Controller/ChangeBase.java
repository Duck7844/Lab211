/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Algorithm;
import Common.Library;
import view.Menu;

/**
 *
 * @author ROG
 */
    public class ChangeBase extends Menu<String>{
    static String[] mc = {"Binary", "Decimal", "Hexadecimal", "Exit"};
    Algorithm ar;
    Library l;
    private int output;
    
    public ChangeBase() {
        super("Change Base Number \nChoose the base number convert: ", mc);
        l = new Library();
        ar = new Algorithm();
        this.output = 0;
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                getOutputBase(n);
                break;
            case 2:
                getOutputBase(n);
                break;
            case 3:
                getOutputBase(n);
                break;
            case 4:
                System.exit(0);
        }
    }
    
    public void getOutputBase(int input) {
        String[] mc = new String[] {"Binary", "Decimal", "Hexadecimal", "Exit"};
        Menu menu = new Menu("Choose the base number to convert: ", mc) {
            
            @Override
            public void execute(int n) {
                switch (n) {
                    case 1:
                        output = 1;
                        changeBaseNumber(input,output);
                        break;
                    case 2:
                        output = 2;
                        changeBaseNumber(input,output);
                        break;
                    case 3:
                        output = 3;
                        changeBaseNumber(input,output);
                        break;
                    case 4:
                        System.exit(0);
                }
            }
        };
        menu.run();
    }
    
    public void changeBaseNumber(int input, int output){
        String str = l.getString("\nEnter number: ");
        String changeValue = ar.convertBase(str, input, output);
        System.out.println("\nResult after changed : " + changeValue);
    }
}

