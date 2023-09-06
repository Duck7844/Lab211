/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.controller;

import lab.common.Algorithm;
import lab.common.Library;
import lab.model.Model;
import lab.viiew.Menu;

/**
 *
 * @author ROG
 */
public class Controller extends Menu
{

    static String[] mc =
    {
        "BuddleSort", "QuickSort", "Exit"
    };

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public Controller(Model model)
    {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = model.getSize_array();
        array = model.getArray();
    }

    public void execute(int n)
    {
        switch (n)
        {
            case 1:
                System.out.println("Unsorted array:");
                library.display(array);
                algorithm.buddleSort(array);
                System.out.println("\nSorted array by Buddle Sort: ");
                library.display(array);
                System.out.println("");
                break;
            case 2:
                System.out.println("Unsorted array:");
                library.display(array);
                algorithm.quickSort(array, 0, size_array - 1);
                System.out.println("\nSorted array by Quick Sort: ");
                library.display(array);
                System.out.println("");
                break;
            case 3:
                System.out.println("Exitting");
                System.exit(0);
                break;
        }
    }

}
