/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rangga
 */
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

public class MyCode extends JFrame implements ActionListener {
    
    JButton button;
    
    public MyCode() {
        
        setSize(200, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout());
        button = new JButton("MyButton");
        
        getContentPane().add(button);
        setVisible(true);
        button.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String buttonText = clickedButton.getText();
        
        if (e.getSource() == button) {
            JOptionPane.showMessageDialog(null, "Anda Bberhasil Login !");
        }
        System.exit(0);
        this.setTitle("You clicked " + buttonText);
    }
    
    public static void main(String[] args) {
        MyCode mainProgram = new MyCode();
        mainProgram.setVisible(true);
    }
}

