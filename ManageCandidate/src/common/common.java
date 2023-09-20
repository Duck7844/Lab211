/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;
import java.util.ArrayList;
import java.util.Calendar;
import model.Candidate;
import model.Experience;
import model.Fresher;
import model.Intern;
import view.CheckInput;


/**
 *
 * @author ROG
 */
public class common {
    public static void createNewCandidate(ArrayList<Candidate> candidates,int type){
        while (true) {
            System.out.print("Enter id: ");
            String id = CheckInput.checkInputString();
            System.out.print("Enter name: ");
            String name = CheckInput.checkInputString();
            System.out.println("Enter Birth Day: ");
            int birthDay = CheckInput.checkInputLimit(1900,Calendar.getInstance().get(Calendar.YEAR));
            System.out.print("Enter address: ");
            String address = CheckInput.checkInputString();
            System.out.print("Enter phone: ");
            String phone = CheckInput.checkInputPhone();
            System.out.print("Enter email: ");
            String email = CheckInput.checkInputEmail();
            Candidate candidate = new Candidate(id, email, birthDay, address, phone, email, type);
            if (CheckInput.checkIdExist(candidates, id)) {
                switch (type) {
                    case 0:
                        createExperience(candidates, candidate);
                        break;
                    case 1:
                        createFresher(candidates, candidate);
                        break;
                    case 2:
                        createInternship(candidates, candidate);
                        break;
                }
            } else {
                return;
            }
            System.out.print("Do you want create (Y/N): ");
            if (!CheckInput.checkInputYN()) {
                return;
            }
        }
    }
    public static void createExperience(ArrayList<Candidate> candidates, Candidate candidate) {
        System.out.print("Enter year of experience: ");
        int yearExperience = CheckInput.checkInputExprience(candidate.getBirthDay());
        System.out.print("Enter professional skill: ");
        String professionalSkill = CheckInput.checkInputString();
        candidates.add(new Experience(yearExperience, professionalSkill,candidate.getId(), candidate.getName(),candidate.getBirthDay(), candidate.getAddress(),candidate.getPhone(), candidate.getEmail(), candidate.getTypeCandidate()));
        System.out.println("Create success.");
    }

    //allow user create fresher
    public static void createFresher(ArrayList<Candidate> candidates,Candidate candidate) {
        System.out.print("Enter graduation date: ");
        String graduationDate = CheckInput.checkInputString();
        System.out.print("Enter graduation rank: ");
        String graduationRank = CheckInput.checkInputGraduationRank();
        candidates.add(new Fresher(graduationDate, graduationRank, candidate.getId(),candidate.getName(),candidate.getBirthDay(), candidate.getAddress(),candidate.getPhone(), candidate.getEmail(),candidate.getTypeCandidate()));
        System.out.println("Create success.");
    }

    public static void createInternship(ArrayList<Candidate> candidates, Candidate candidate) {
        System.out.print("Enter major: ");
        String major = CheckInput.checkInputString();
        System.out.print("Enter semester: ");
        String semester = CheckInput.checkInputString();
        System.out.print("Enter university: ");
        String university = CheckInput.checkInputString();
        candidates.add(new Intern(major, semester, university, candidate.getId(),candidate.getName(), candidate.getBirthDay(), candidate.getAddress(), candidate.getPhone(), candidate.getEmail(), candidate.getTypeCandidate()));
        System.err.println("Create success.");
    }

    //allow user search candidate by name
    public static void searchCandidate(ArrayList<Candidate> candidates) {
        printListNameCandidate(candidates);
        System.out.print("Enter andidate name: ");
        String nameSearch = CheckInput.checkInputString();
        System.out.print("Enter type of candidate: ");
        int typeCandidate = CheckInput.checkInputLimit(0, 2);
        for (Candidate candidate : candidates) {
            if (candidate.getTypeCandidate() == typeCandidate && (candidate.getName().contains(nameSearch))) {
                System.out.println(candidate.toString());
            }
        }
    }

    //display list name candidate
    public static void printListNameCandidate(ArrayList<Candidate> candidates) {
        System.err.println("Enter 0 :Experience Candidate");
        for (Candidate candidate : candidates) {
            if (candidate.getTypeCandidate() == 0) {
                System.out.println(candidate.getName());
            }
        }
        System.err.println("Enter 1: Fresher Candidate");
        for (Candidate candidate : candidates) {
            if (candidate.getTypeCandidate() == 1) {
                System.out.println(candidate.getName());
            }
        }
        System.err.println("Enter 2: Internship Candidate");
        for (Candidate candidate : candidates) {
            if (candidate.getTypeCandidate() == 2) {
                System.out.println(candidate.getName());
            }
        }
    }

}
