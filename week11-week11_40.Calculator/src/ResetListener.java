
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author traanh
 */
public class ResetListener implements ActionListener {
     
    private Calculator calculator;
    private JTextField input;
    private JTextField output; 
    private JButton reset ;
    
    
    public ResetListener(Calculator calculator, JTextField input, JTextField output,JButton reset){
        this.calculator = calculator; 
        this.input = input; 
        this.output = output; 
        this.reset = reset; 
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.calculator.reset();
        this.output.setText("" + this.calculator.getValue());
        this.input.setText("");
        this.reset.setEnabled(false);
    
    }
    
}
