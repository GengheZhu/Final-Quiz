
import java.util.*;
import javax.swing.*;
import java.awt.*;
public class Test extends JFrame 
{
    private JPanel panel;
    private JLabel label1;
    private JPanel panel1;
    public Test() {
        label1 = new JLabel();
        panel = new JPanel();
        panel1 = new JPanel();
        label1.setText("Question 1");
        panel1.add(label1);
        Container c = this.getContentPane();
        c.setLayout(new GridBagLayout());
        GridBagConstraints c1 = new GridBagConstraints();
        c1.gridx = 0;
        c1.gridy = 0;
        add(panel1,c1);     

        c1.gridx = 300;
        c1.gridy = 300;
        
        JButton button1 = new JButton("A Button");
        
        //button1.setBounds(150, 200, 150, 275);
        panel.add(button1, c1);
        
       
        //label1.setLocation(0, 150);
        //panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        add(panel);
        
     
        //this.setLocationRelativeTo(null);
        //this.setUndecorated(true);
        //this.pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(1000, 1000));
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Test();

        
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