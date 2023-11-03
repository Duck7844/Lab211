/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Repository.FileRepository;
/**
 *
 * @author ROG
 */
public class FileCopy {
    FileRepository program;

    public FileCopy() {
        program = new FileRepository();
    }
    
    public void run() {
        System.out.println("\nCopy Program:");
        program.readFileConfig();
    }
    
}
