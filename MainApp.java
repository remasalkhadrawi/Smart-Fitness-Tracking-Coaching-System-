/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FitnessSystem;

import javax.swing.SwingUtilities;
/**
 *
 * @author Lenovo
 */
public class MainApp {
    
    public static void main(String[]args){
        SwingUtilities.invokeLater(() ->{
        new LoginFrame().setVisible(true);
    
        });
    }
}
