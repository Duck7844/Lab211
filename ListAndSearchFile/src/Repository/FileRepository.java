/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAcess.SearchFileDAO;
/**
 *
 * @author ROG
 */
public class FileRepository implements IFileRepository{

    @Override
    public void countWordInFile() {
        SearchFileDAO.Instance().countTheWordInFile();
    }

    @Override
    public void findFileNameByWord() {
        SearchFileDAO.Instance().findFileNameByWord();
    }
}
