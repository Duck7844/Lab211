/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1.l.P0022;

import java.util.ArrayList;
import common.common;
import view.Menu;
import model.Candidate;

/**
 *
 * @author ROG
 */
public class controller extends Menu
{
    private static ArrayList<Candidate> arr = new ArrayList();

    public controller() {
    }

    public controller(String title, String[] s) {
        super(title, s);
    }
    
    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                common.createNewCandidate(arr, 0);
                break;
            case 2:
                common.createNewCandidate(arr, 1);
                break;
            case 3:
                common.createNewCandidate(arr, 2);
                break;
            case 4:
                common.searchCandidate(arr);
                break;
            case 5: 
                System.out.println("Exited");
                return;
            default:
                System.out.println("Choose 1-5");
        }
    } 
}

