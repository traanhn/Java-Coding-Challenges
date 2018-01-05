/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survey;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author traanh
 */
public class ActionEventListener implements ActionListener{
    private JTextField origin;
    private JLabel label;
    
    public ActionEventListener(JTextField origin, JLabel label){
        this.origin = origin;
        this.label = label;
        
    }
    
   

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.label.setText(this.origin.getText());
        this.origin.setText("");
    }
    
    
}



