/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ROG
 */
public class Experience extends Candidate{
    private int yearExperience;
    private String professionalSkill;
    public Experience(){
        super();
    }

 
    public Experience(int yearExperience, String professionalSkill, String id, String name, int birthDay, String address, String phone, String email, int typeCandidate)
    {
        super(id, name, birthDay, address, phone, email, typeCandidate);
        this.yearExperience = yearExperience;
        this.professionalSkill = professionalSkill;
    }

    public int getYearExperience()
    {
        return yearExperience;
    }

    public void setYearExperience(int yearExperience)
    {
        this.yearExperience = yearExperience;
    }

    public String getProfessionalSkill()
    {
        return professionalSkill;
    }

    public void setProfessionalSkill(String professionalSkill)
    {
        this.professionalSkill = professionalSkill;
    }
}


