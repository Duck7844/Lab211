/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import J1.l.P0022.controller;

/**
 *
 * @author ROG
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String title = "Manage Candidate Of Company File";
        String[] s = new String[]{"Experience", "Fresher", "Intern", "Searching", "Exit"};
        controller controller = new controller(title, s);
        controller.run();
    }
    
}
