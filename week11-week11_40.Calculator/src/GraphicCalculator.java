
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private Calculator calculator;
    
    public GraphicCalculator(){
        this.calculator = new Calculator(); 
    }
    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(this.frame.getContentPane());

        this.frame.pack();
        this.frame.setVisible(true);
        
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        
        JTextField output = new JTextField("0");
        output.setEnabled(false);
        
        JTextField input = new JTextField("");
        
        
        container.add(output);
        container.add(input);
        container.add(createPanel(input, output),BorderLayout.SOUTH);
        
        
        
    }
    private JPanel createPanel(JTextField input, JTextField output){
        JPanel panel = new JPanel(new GridLayout(1,3));
        
        JButton plus = new JButton("+");
        panel.add(plus);

        
        
        JButton minus = new JButton("-");
        panel.add(minus);
        JButton reset = new JButton("Z");
        panel.add(reset); 
        reset.setEnabled(false);
        
        plus.addActionListener(new AddListener(this.calculator,input, output,reset));
        minus.addActionListener(new MinusListener(this.calculator,input, output, reset));
        reset.addActionListener(new ResetListener(this.calculator,input, output, reset));
        
        
        return panel; 
    }

    public JFrame getFrame() {
        return this.frame;
    }
}