/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javatutorials.part1;

/**
 *
 * @author tenzor
 */
public class ClassSettings  {
    public String myVar;
    private static ClassSettings objSettings = new ClassSettings();
    
    private ClassSettings() {
        setSettings();
    }
    
    public void setSettings() {
        myVar = "Settings";
    }
    
    public static ClassSettings getSettings() {
        return  objSettings;
    }
}
