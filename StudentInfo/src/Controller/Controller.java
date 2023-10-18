/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Student;
import Repository.StudentRepositoy;
import java.util.ArrayList;
/**
 *
 * @author ROG
 */
public class Controller {
    StudentRepositoy program;
    ArrayList<Student> lt;

    public Controller() {
        program = new StudentRepositoy();
        lt = new ArrayList<>();
    }

    public void run() {
        System.out.println("\nCollection Sort Program");
        program.display(lt);
    }
}
