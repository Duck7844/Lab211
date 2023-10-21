/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Repository.StringRepository;

/**
 *
 * @author ROG
 */
public class Controller {
    StringRepository program;

    public Controller() {
        program = new StringRepository();
    }

    public void run() {
        System.out.println("\nAnalysis String Program:");
        program.analysisString();
    }
}