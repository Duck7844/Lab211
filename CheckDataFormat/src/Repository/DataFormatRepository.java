/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAcess.CheckDataFormatDAO;
/**
 *
 * @author ROG
 */
public class DataFormatRepository implements IDataFormatRepository{

    @Override
    public void Validate() {
        CheckDataFormatDAO.Instance().Validate();
    }
    
}
