package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("");
        frame.setPreferredSize(new Dimension(400,300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true); 
        
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        
        JTextField textAreaTop = new JTextField("I was copied here from the JTextArea.");
        JButton copyButton = new JButton("Copy!");
        JLabel label = new JLabel();
        
        ActionEventListener listener = new ActionEventListener(textAreaTop, label); 
        copyButton.addActionListener(listener);
        
        container.add(textAreaTop);
        container.add(copyButton);
        container.add(label);
        
        
    
    }
    
    
    
}
