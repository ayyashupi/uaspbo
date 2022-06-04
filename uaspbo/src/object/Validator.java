package object;


import javax.swing.JComboBox;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Virtual S4
 */
public class Validator {
    
    public boolean isEmpty(JTextField txt){
        if(txt.getText().toString().equals(null)||txt.getText().toString().equals("")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isEmpty(JComboBox cmb){
        if(cmb.getSelectedIndex()== 0){
            return true;
        }else{
            return false;
        }
    }
    
    
}
