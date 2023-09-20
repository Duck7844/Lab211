/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ROG
 */
public class Fresher extends Candidate
{
    private String graduationDate;
    private String graduationRank;
    public Fresher (){
        super();
    }

    public Fresher(String graduationDate, String graduationRank, String id, String name, int birthDay, String address, String phone, String email, int typeCandidate)
    {
        super(id, name, birthDay, address, phone, email, typeCandidate);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    public String getGraduationDate()
    {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate)
    {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank()
    {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank)
    {
        this.graduationRank = graduationRank;
    }
    
}
