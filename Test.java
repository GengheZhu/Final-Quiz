import java.util.*;
import javax.swing.*;
import java.awt.*;
public class Test extends JFrame 
{
    private JPanel panel;
    private JLabel label1;
    public Test() {
        
        panel = new JPanel();
        JButton button1 = new JButton("A Button");
        //button1.setBounds(150, 200, 150, 275);
        panel.add(button1);
        
        label1 = new JLabel();
        label1.setText("Question 1");
        
        panel.add(label1);
        //label1.setLocation(0, 150);
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.add(panel);
        
        //this.setLocationRelativeTo(null);
        //this.setUndecorated(true);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(1000, 1000));
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Test();
        /*
        JFrame this = new JFrame("Tester");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLayout(null);
        //JButton button1 = new JButton("A Button");
        //button1.setBounds(50, 100, 50, 75);
        //frame.add(button1);
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("Label Test");
        //label1.setText("Please Work");
        panel.add(label1);
        panel.setLocation(300, 400);
        //panel.setVisible(true);
        frame.add(panel);
        //label1.setLocation(300, 400);
        //frame.add(label1);
        frame.setVisible(true);
        */
        //JFrame frame = new JFrame();
        //frame.setSize(new Dimension(1000, 1000));
        //JPanel panel = new JPanel();
        //JButton button1 = new JButton("A Button");
        //button1.setBounds(150, 200, 150, 275);
        //panel.add(button1);
        //JLabel label1 = new JLabel();
        //label1.setText("asdfasdf");
        
        //panel.add(label1);
        //label1.setLocation(0, 150);
        //frame.add(panel);
        
        //frame.setLocationRelativeTo(null);
        //frame.setUndecorated(true);
        //frame.setVisible(true);
        
    }
}

//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;

//import javax.swing.JFrame;
//import javax.swing.JTextArea;
/*
public class Main extends JFrame {
  public Main() {
    setSize(300, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    final JTextArea textArea = new JTextArea();
    textArea.setText("Click Me!");

    textArea.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.NOBUTTON) {
          textArea.setText("No button clicked...");
        } else if (e.getButton() == MouseEvent.BUTTON1) {
          textArea.setText("Button 1 clicked...");
        } else if (e.getButton() == MouseEvent.BUTTON2) {
          textArea.setText("Button 2 clicked...");
        } else if (e.getButton() == MouseEvent.BUTTON3) {
          textArea.setText("Button 3 clicked...");
        }

        System.out.println("Number of click: " + e.getClickCount());
        System.out.println("Click position (X, Y):  " + e.getX() + ", " + e.getY());
      }
    });

    getContentPane().add(textArea);
  }

  public static void main(String[] args) {
    new Main().setVisible(true);
  }
}
*/