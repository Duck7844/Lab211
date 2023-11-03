/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAcess.FileDAO;
/**
 *
 * @author ROG
 */
public class FileRepository implements IFileRepository{

    @Override
    public void readFileConfig() {
        FileDAO.Instance().readFileConfig();
    }
    
}
