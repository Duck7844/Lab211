/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAcess;

import Common.Library;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
/**
 *
 * @author ROG
 */
public class FileDAO {
    private static FileDAO instance = null;
    Library l;

    public FileDAO() {
        l = new Library();
    }

    public static FileDAO Instance() {
        if (instance == null) {
            synchronized (FileDAO.class) {
                if (instance == null) {
                    instance = new FileDAO();
                }
            }
        }
        return instance;
    }
    
    public void readFileConfig() {
        File propertiesFile = new File("src//Common//config.properties");
        Properties prop = new Properties();
        if (propertiesFile.exists()) {
            boolean checkFileConfig = l.checkFileConfig(propertiesFile);
            if (checkFileConfig == false) {
                System.out.println("Can't find properties file");
                
            } else{
                try {
                    FileReader reader = new FileReader(propertiesFile);
                    prop.load(reader);
                    copyFolder(prop.getProperty("COPY_FOLDER"), prop.getProperty("PATH"));
                    reader.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else {
//            System.out.println("Not found");
            createFileConfig(propertiesFile, prop);
        }
    }

    public void createFileConfig(File propertiesFile, Properties prop) {
        OutputStream output = null;
        try {
            System.out.println("Input Config File:");
            String copyFolder = l.getString("Copy Folder: ");
            String dataType = l.getString("Data Type: ");
            String path = l.getString("Path: ");
            output = new FileOutputStream(propertiesFile);
            prop.setProperty("COPY_FOLDER", copyFolder);
            prop.setProperty("DATA_TYPE", dataType);
            prop.setProperty("PATH", path);
            prop.store(output, null);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("File cannot create");
            System.out.println("System shutdown");
            return;
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("File cannot create");
            System.out.println("System shutdown");
            return;
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("File cannot create");
                    System.out.println("System shutdown");
                    return;
                }
            }
        }
    }

    public void copyFolder(String copyFolder, String path) {
        File t1 = new File(copyFolder);
        File t2 = new File(path);
        
        if (l.checkInformationConfig(t1, t2)) {
            File[] listOfFiles = t1.listFiles();
            System.out.println("Copy is running\nFile Name:");
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    copyFile(copyFolder + "\\" + listOfFiles[i].getName(), path);
                    System.out.println("File name: " + listOfFiles[i].getName());
                }
            }
            System.out.println("Copy is finished");
        } else {
            System.out.println("System shutdown");
            return;
        }
    }

    public void copyFile(String file, String folder) {
        File t1 = new File(file);
        File t2 = new File(folder);
        if (t1.exists() && t1.isFile() && t2.exists() && t2.isDirectory()) {
            try {
                FileInputStream fis = new FileInputStream(t1);
                FileOutputStream fos = new FileOutputStream(folder + "/" + t1.getName());
                int b;
                while ((b = fis.read()) != -1) {
                    fos.write(b);
                }
                fis.close();
                fos.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
    }
}