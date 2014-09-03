package javatutorials.part4;

import java.io.File;
import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ClassFile implements Node {
    
    String path;
    
   
    
    @Override
    public void isDirectory() {
        
    }

    @Override
    public void isFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getChildren() {
         File myFile = new File(setEnteredPath());
         ArrayList<String> directoryContents = new ArrayList<String>(Arrays.asList(myFile.list()));
         System.out.print(directoryContents);
    }    

    @Override
    public String setEnteredPath() {
        return path;
    }

    @Override
    public void getEnteredPath(String path) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
