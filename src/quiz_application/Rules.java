package quiz_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton startBtn, backBtn;
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel title = new JLabel("Welcome "+ name +" to Simple Minds");
        title.setBounds(50,20,700,30);
        title.setFont(new Font("Tahoma", Font.BOLD,28));
        title.setForeground(new Color(30,144,254));
        add(title);

        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma", Font.PLAIN,16));
        rules.setText(
              "<html>"+
                    "1. Programming can be frustrating, but keep trying."+ "<br><br>" +
                    "2. Keep your code simple and readable." + "<br><br>" +
                    "3. Build projects that you'll enjoy." + "<br><br>" +
                    "4. Practice, practice, practice!" + "<br><br>" +
                    "5. Technology is always evolving." + "<br><br>" +
                    "6. Its a lifelong learning commitment." + "<br><br>" +
                    "7. Good Luck! :D"+ "<br><br>" +
              "<html>"
        );
        add(rules);

        backBtn = new JButton("Back");
        backBtn.setBounds(250,500,100,30);
        backBtn.setBackground(new Color(30,144,254));
        backBtn.setForeground(Color.white);
        backBtn.addActionListener(this);
        add(backBtn);

        startBtn = new JButton("Start");
        startBtn.setBounds(400,500,100,30);
        startBtn.setBackground(new Color(30,144,254));
        startBtn.setForeground(Color.white);
        startBtn.addActionListener(this);
        add(startBtn);

        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Rules("User");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == startBtn){
            setVisible(false);
            new Quiz(name);
        }else{
            setVisible(false);
            new Login();
        }
    }
}



