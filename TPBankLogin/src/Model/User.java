/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ROG
 */
public class User
{
    private int AccountNumber;
    private String Password;
    private String Captcha;
        
    
    public User(int AccountNumber, String Password, String Captcha) {
        this.AccountNumber = AccountNumber;
        this.Password = Password;
        this.Captcha = Captcha;
    }
    

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getCaptcha() {
        return Captcha;
    }

    public void setCaptcha(String Captcha) {
        this.Captcha = Captcha;
    }
}
