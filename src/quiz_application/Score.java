package quiz_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    Score(String name, int score){
        setBounds(50,0,980,850);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        //Quiz Image
        ImageIcon quizIcon = new ImageIcon(ClassLoader.getSystemResource("icons/Score.jpg"));
        JLabel image = new JLabel(quizIcon);
        image.setBounds(40,200,300,445);
        add(image);
        //Heading
        JLabel heading = new JLabel("Thank You " + name +" for playing Simple Minds");
        heading.setBounds(50,60,700,50);
        heading.setFont(new Font("Tahoma", Font.PLAIN,30));
        add(heading);
        //Score
        JLabel userScore = new JLabel("Your score is " + score);
        userScore.setBounds(400,380,400,30);
        userScore.setFont(new Font("Tahoma", Font.PLAIN,26));
        add(userScore);

        JButton submitBtn = new JButton("Play Again");
        submitBtn.setBounds(420,430,120,30);
        submitBtn.setBackground(new Color(30,144,225));
        submitBtn.setForeground(Color.white);
        submitBtn.addActionListener(this);
        add(submitBtn);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Score("user", 0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Login();
    }
}
