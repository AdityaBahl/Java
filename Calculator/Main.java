import javax.swing.*;

public class Main {
    public static void main(String args[]) {
        JButton jb = new JButton("OG");

        JTextField jtf = new JTextField("CALCULATE!");
        jtf.setBounds(100, 140, 400, 40);
        JFrame jframe = new JFrame();
        // jframe.setBounds(100, 90, 250, 40);
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