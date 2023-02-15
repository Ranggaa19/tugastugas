
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rangga
 */
public class FormLog {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setBounds(0, 0, 600, 90);
        JLabel labelUsername = new JLabel("Username");
        labelUsername.setBounds(10, 10, 80, 30);
        JLabel labelPassword = new JLabel("Password");
        labelPassword.setBounds(250, 10, 80, 30);
        JTextField txtUsername = new JTextField();
        txtUsername.setBounds(90, 13, 150, 27);
        JPasswordField txtPwd = new JPasswordField();
        txtPwd.setBounds(330, 13, 150, 27);
        JButton clear = new JButton("Login");
        clear.setBounds(500, 13, 70, 27);
        frame.add(labelUsername);
        frame.add(labelPassword);
        frame.add(txtUsername);
        frame.add(txtPwd);
        frame.add(clear);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
       
    }

}
