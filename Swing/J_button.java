import javax.swing.*;

public class J_button {
    public JFrame jframe;

    public J_button() {
        jframe = new JFrame("This is jFrame Tutorial");
        // jframe.setTitle("This is a normal frame");
        JButton jbutton = new JButton("Click me");
        jbutton.setBounds(100, 40, 150, 30);
        JLabel jl = new JLabel("This is a java swing tutorial");
        jl.setBounds(100, 90, 250, 30);
        JTextField jtf = new JTextField("My name is Aditya");
        jtf.setBounds(100, 140, 150, 30);
        jframe.add(jtf);
        jframe.add(jl);
        jframe.add(jbutton);
        jframe.setLayout(null);
        jframe.setSize(400, 400);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        J_button b = new J_button();
    }
}
