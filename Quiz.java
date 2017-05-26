//import java.awt.*;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Quiz {
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
    private static String[] questions = {"q1", "q2", "q3", "q4"};
    private static String[][] answers = {{"a1", "b1", "c1", "d1"},{"a2", "b2", "c2", "d2"},{"a3", "b3", "c3", "d3"},{"a4", "b4", "c4", "d4"}};
    private static final boolean[][] answerTrue = {{true, false, false, false}, {false, true, false, false, false}, {false, false, true, false}, {false, false, false, true}};
    private static boolean ifGotRight;
    
    public static boolean addComponentsToPane(Container pane, int question) {
        
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
        JLabel label;
        JButton button1, button2, button3, button4;
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        if (shouldFill) {
        c.fill = GridBagConstraints.HORIZONTAL;
        }
     
        button1 = new JButton(answers[question][0]);
        if (shouldWeightX) {
        c.weightx = 0.5;
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 50;
        c.gridx = 1;
        c.gridy = 1;
        pane.add(button1, c);
        button1.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
            Quiz.ifGotRight = (answerTrue[question][0]);
          }
        });
     
        button2 = new JButton(answers[question][1]);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 1;
        pane.add(button2, c);
        button2.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
            Quiz.ifGotRight = (answerTrue[question][1]);
          }
        });
     
        button3 = new JButton(answers[question][2]);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 2;
        pane.add(button3, c);
        button3.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
            Quiz.ifGotRight = answerTrue[question][2];
          }
        });
        
        button4 = new JButton(answers[question][3]);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 2;
        pane.add(button4, c);
        button3.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
            // display/center the jdialog when the button is pressed
            Quiz.ifGotRight = answerTrue[question][3];
          }
        });
        
        label = new JLabel("Question #" + question + ": " + questions[question]);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 85;      
        c.weightx = 0.0;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(label, c);
     
        label = new JLabel("Lives: ");
        c.fill = GridBagConstraints.CENTER;
        c.ipadx = 50;       
        c.weighty = 1.0;   
        //c.anchor = GridBagConstraints.PAGE_END; 
        c.insets = new Insets(10,0,0,0);  
        c.gridx = 1;       
        c.gridwidth = 2;   
        c.gridy = 3;       
        pane.add(label, c);
        
        
        label = new JLabel(new ImageIcon("C:/Users/fhsplab/Desktop/Final-Quiz/sleep1.png"));
        c.fill = GridBagConstraints.CENTER;
        c.ipadx = 0;       
        c.weighty = 1.0;   
        c.anchor = GridBagConstraints.PAGE_END; 
        c.insets = new Insets(10,0,0,0);  
        c.gridx = 1;       
        c.gridwidth = 2;   
        c.gridy = 3;       
        pane.add(label, c);
        //frame.add(new JLabel(new ImageIcon("C:/Users/fhsplab/Desktop/Final-Quiz/Shrek2.png")));
        
        return ifGotRight;
    }
 

 
    private static void createAndShowGUI(int question) {
        JFrame frame = new JFrame("Impossible Question");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        addComponentsToPane(frame.getContentPane(), question);

        //frame.pack();
        frame.setSize(new Dimension(500,500));
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        int questionNum = 0;
        int lives = 2;
        while (lives > 0 && questionNum < questions.length) {
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI(questionNum);
                    if(ifGotRight) {
                        Quiz.questionNum++;
                    } else {
                        Quiz.this.lives--;
                    }
                }
            });
        }
        
    }
}