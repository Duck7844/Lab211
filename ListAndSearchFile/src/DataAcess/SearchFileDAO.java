/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAcess;

import Common.Library;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ROG
 */
public class SearchFileDAO
{
    private static SearchFileDAO instance = null;
    public String path;
    public String  word;
    Library l;
    
    public SearchFileDAO() {
        this.path = path;
        this.word = word;
        l = new Library();
    }

    public static SearchFileDAO Instance() {
        if (instance == null) {
            synchronized (SearchFileDAO.class) {
                if (instance == null) {
                    instance = new SearchFileDAO();
                }
            }
        }
        return instance;
}
    public void countTheWordInFile(){
        path = l.checkInputPathFile("Enter Path: ");
        word = l.getString("Enter Word: ");
        int count = countTheWordInFile(path,word);
        System.out.println("Count = "+count);
    }
    
    public int countTheWordInFile(String path, String word){
        FileReader r = null;
        try{
            r = new FileReader(path);
            BufferedReader b = new BufferedReader(r);
            String line = b.readLine();
            int count = 0;
             while (line != null) {
                String[] parts = line.split(" ");
                for (String w : parts) {
                    if (w.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
                line = b.readLine();
            }
            return count;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                r.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return 0;
    }

    public void findFileNameByWord() {
        path = l.getString("Enter Path: ");
        word = l.getString("Enter Word: ");
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                if (countTheWordInFile(file.getAbsolutePath(), word) != 0) {
                    System.out.println("file name: " + file.getName());
                }
            }
        }
    }
}

