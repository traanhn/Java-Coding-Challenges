
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
public class MinusListener implements ActionListener {

//   
    private Calculator calculator;
    private JTextField input;
    private JTextField output; 
    private JButton reset ;

    
    public MinusListener(Calculator calculator, JTextField input, JTextField output,JButton reset){
        this.calculator = calculator; 
        this.input = input; 
        this.output = output; 
        this.reset = reset; 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        try{
            this.calculator.minus(Integer.parseInt(this.input.getText()));    
            this.output.setText(""+this.calculator.getValue());
            this.reset.setEnabled(true);
        } catch (NumberFormatException exception){
        }    
        this.input.setText(""); 
    
    
}
}

