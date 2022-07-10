import javax.swing.*;

public class Main {
    public static void main(String args[]) {
        //buttons
        JButton jb1 = new JButton("OG");
        jb1.setBounds(10,100,100,50);
        JButton jb2 = new JButton("OG");
        jb2.setBounds(120,100,100,50);
        JButton jb3 = new JButton("OG");
        jb3.setBounds(230,100,100,50);
        JButton jb4 = new JButton("OG");
        jb4.setBounds(340,100,100,50);
        //JButton jb = new JButton("OG");
        //jb.setBounds(10,100,100,50);
        //JButton jb = new JButton("OG");
        //jb.setBounds(10,100,100,50);
        
        //JLabel jl=new JLabel("Calculator");
        JTextField jtf = new JTextField("CALCULATE!");
        jtf.setBounds(10, 20, 460, 70);
        JFrame jframe = new JFrame();
        // jframe.setBounds(100, 90, 250, 40);
        jframe.add(jtf);
        //jframe.add(jl);
        jframe.add(jb1);
        jframe.add(jb2);
        jframe.add(jb3);
        jframe.add(jb4);
        jframe.setTitle("Calculator");
        jframe.setLayout(null);
        jframe.setVisible(true);
        jframe.setSize(500, 500);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
// import java.awt.*;
// class Calculator extends JFrame {
// public static void calc() {
// setBounds(100, 90, 250, 40);
// setTitle("Calculator");
// setLayout(null);
// setVisible(true);
// setSize(500, 500);
// }
// }