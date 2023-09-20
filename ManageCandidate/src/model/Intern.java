/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ROG
 */
public class Intern extends Candidate
{
    private String major;
    private String semester;
    private String university;
    public Intern(){
        super();
    }

    public Intern(String major, String semester, String university, String id, String name, int birthDay, String address, String phone, String email, int typeCandidate)
    {
        super(id, name, birthDay, address, phone, email, typeCandidate);
        this.major = major;
        this.semester = semester;
        this.university = university;
    }

    public String getMajor()
    {
        return major;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }

    public String getSemester()
    {
        return semester;
    }

    public void setSemester(String semester)
    {
        this.semester = semester;
    }

    public String getUniversity()
    {
        return university;
    }

    public void setUniversity(String university)
    {
        this.university = university;
    }
    
}
 