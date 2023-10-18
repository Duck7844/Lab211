/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Repository.CalculatorRepository;
/**
 *
 * @author ROG
 */
public class Controller {
    CalculatorRepository program;

    public Controller() {
        program = new CalculatorRepository();
    }

    public void run() {
        System.out.println("\nCalculator Shape Program");
        program.inputandcalculatorShape();
    }
}
