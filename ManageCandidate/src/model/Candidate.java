/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ROG
 */
public class Candidate
{
  private String id;
  private String name;
  private int birthDay;
  private String address;
  private String phone;
  private String email;
  private int typeCandidate;
  
  public Candidate(){
      
  }

    public Candidate(String id, String name, int birthDay, String address, String phone, String email, int typeCandidate)
    {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.typeCandidate = typeCandidate;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getBirthDay()
    {
        return birthDay;
    }

    public void setBirthDay(int birthDay)
    {
        this.birthDay = birthDay;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public int getTypeCandidate()
    {
        return typeCandidate;
    }

    public void setTypeCandidate(int typeCandidate)
    {
        this.typeCandidate = typeCandidate;
    }

    @Override
    public String toString()
    {
        return "Candidate{" + "id=" + id + "| name=" + name + "| birthDay=" + birthDay + "| address=" + address + "| phone=" + phone + "| email=" + email + "| typeCandidate=" + typeCandidate + '}';
    }
  
}
