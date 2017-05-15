import java.util.*;
import javax.swing.*;
import java.awt.*;
public class Test1
{
    public static void main(String[] args) {
        /*
        JFrame frame = new JFrame("Tester");
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
        JFrame frame = new JFrame();
        Container c = new (frame.getContentPane());
        c.setLayout(new CardLayout(
        frame.setSize(new Dimension(1000, 1000));
        JPanel panel = new JPanel();
        JButton button1 = new JButton("A Button");
        //button1.setBounds(150, 200, 150, 275);
        panel.add(button1);
        JLabel label1 = new JLabel();
        label1.setText("asdfasdf");
        //panel.setLocation();
        
        panel.add(label1);
        panel.addNotify();
        //label1.setLocation(0, 150);
        frame.add(panel);
        //frame.pack();
        frame.setLocationRelativeTo(null);
        //frame.setUndecorated(true);
        frame.setVisible(true);
        
    }
}
