import javax.swing.*;
import java.awt.*;

public class Main implements ActionListener{
    public static void main(String args[])
{

        //BUTTONS

        //1st Line
        JButton og = new JButton("O G");
        og.setBounds(10,100,100,50);
        JButton mod = new JButton("%");
        mod.setBounds(131,100,100,50);
        JButton power = new JButton("^");
        power.setBounds(252,100,100,50);
        JButton undrrt = new JButton("sqr root");
        undrrt.setBounds(373,100,100,50);

        //2nd Line
        JButton one = new JButton("1");
        one.setBounds(10,160,100,50);
        JButton two = new JButton("2");
        two.setBounds(131,160,100,50);
        JButton three = new JButton("3");
        three.setBounds(252,160,100,50);
        JButton plus = new JButton("+");
        plus.setBounds(373,160,100,50);

        //3rd Line
        JButton four = new JButton("4");
        four.setBounds(10,220,100,50);
        JButton five = new JButton("5");
        five.setBounds(131,220,100,50);
        JButton six = new JButton("6");
        six.setBounds(252,220,100,50);
        JButton minus = new JButton("-");
        minus.setBounds(373,220,100,50);

        //4th Line
        JButton seven = new JButton("7");
        seven.setBounds(10,280,100,50);
        JButton eight = new JButton("8");
        eight.setBounds(131,280,100,50);
        JButton nine = new JButton("9");
        nine.setBounds(252,280,100,50);
        JButton divide = new JButton("/");
        divide.setBounds(373,280,100,50);

        //5th Line
        JButton zero = new JButton("0");
        zero.setBounds(10,340,100,50);
        JButton  equalsto= new JButton("=");
        equalsto.setBounds(131,340,220,50);
        JButton multiply = new JButton("x");
        multiply.setBounds(373,340,100,50);
        //JButton og = new JButton("O G");
        //og.setBounds(373,100,100,50);

        //JButton jb = new JButton("OG");
        //jb.setBounds(10,100,100,50);
        //JButton jb = new JButton("OG");
        //jb.setBounds(10,100,100,50);
        
        //JLabel jl=new JLabel("Calculator");
        JTextField jtf = new JTextField("CALCULATE!");
        jtf.setBounds(10, 20, 465, 70);
        JFrame jframe = new JFrame();
        // jframe.setBounds(100, 90, 250, 40);
        jframe.add(jtf);
        //jframe.add(jl);
        //
        jframe.add(og);
        jframe.add(mod);
        jframe.add(power);
        jframe.add(undrrt);
        //
        jframe.add(one);
        jframe.add(two);
        jframe.add(three);
        jframe.add(plus);
        //
        jframe.add(four);
        jframe.add(five);
        jframe.add(six);
        jframe.add(minus);
        //
        jframe.add(seven);
        jframe.add(eight);
        jframe.add(nine);
        jframe.add(divide);
        //
        jframe.add(zero);
        jframe.add(equalsto);
        jframe.add(multiply);
        //jframe.add(og);
        //
        //jframe.add(e);
        //jframe.add(o);
        //jframe.add(ree);
        //jframe.add();
        jframe.setTitle("Calculator");
        jframe.setLayout(null);
        jframe.setVisible(true);
        jframe.setSize(500, 450);
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