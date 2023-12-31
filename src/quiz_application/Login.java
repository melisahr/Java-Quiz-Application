package quiz_application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    //Global variables
    JButton rulesBtn, exitBtn;
    JTextField inputName;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        //LoginImage
        ImageIcon loginIcon = new ImageIcon(ClassLoader.getSystemResource("icons/Login.jpg"));
        JLabel image = new JLabel(loginIcon);
        image.setBounds(0,0,600,500);
        add(image);

        //Tile,name, and text field
        JLabel title = new JLabel("Simple Minds");
        title.setBounds(750,60,300,45);
        title.setFont(new Font("Tahoma", Font.BOLD,40));
        title.setForeground(new Color(30,144,254));//Font color
        add(title);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Serif", Font.BOLD,18));
        name.setForeground(new Color(30,144,254));
        add(name);

        inputName = new JTextField();
        inputName.setBounds(735,200,300,25);
        inputName.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(inputName);

        //Button(rules + back) with an action listener
        rulesBtn = new JButton("Rules");
        rulesBtn.setBounds(735,270,120,25);
        rulesBtn.setBackground(new Color(30,144,254));
        rulesBtn.setForeground(Color.white);
        rulesBtn.addActionListener(this);
        add(rulesBtn);

        exitBtn = new JButton("Exit");
        exitBtn.setBounds(915,270,120,25);
        exitBtn.setBackground(new Color(30,144,254));
        exitBtn.setForeground(Color.white);
        exitBtn.addActionListener(this);
        add(exitBtn);

        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        //Instance for login class
        new Login();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == rulesBtn){
            String name = inputName.getText();
            setVisible(false);
            new Rules(name);
        } else if (e.getSource() == exitBtn){
            setVisible(false);
        }
    }
}
