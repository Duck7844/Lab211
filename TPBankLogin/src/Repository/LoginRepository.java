/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAcess.LoginDAO;
import java.util.Locale;


/**
 *
 * @author ROG
 */
public class LoginRepository implements ILoginRepository{

    @Override
    public void login(Locale language) {
        LoginDAO.Instance().login(language);
    }
}
