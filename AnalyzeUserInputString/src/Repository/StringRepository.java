/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAcess.StringDAO;
/**
 *
 * @author ROG
 */
public class StringRepository implements IStringRepository{

    @Override
    public void analysisString() {
        StringDAO.Instance().analysisString();
    }
    
}
