import javax.swing.*;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    public Main
    {
        // BUTTONS

        // 1st Line
        JButton reset = new JButton("O G");
        reset.setBounds(10, 100, 100, 50);
        JButton mod = new JButton("%");
        mod.setBounds(131, 100, 100, 50);
        JButton power = new JButton("^");
        power.setBounds(252, 100, 100, 50);
        JButton undrrt = new JButton("sqr root");
        undrrt.setBounds(373, 100, 100, 50);

        // 2nd Line
        JButton one = new JButton("1");
        one.setBounds(10, 160, 100, 50);
        JButton two = new JButton("2");
        two.setBounds(131, 160, 100, 50);
        JButton three = new JButton("3");
        three.setBounds(252, 160, 100, 50);
        JButton plus = new JButton("+");
        plus.setBounds(373, 160, 100, 50);

        // 3rd Line
        JButton four = new JButton("4");
        four.setBounds(10, 220, 100, 50);
        JButton five = new JButton("5");
        five.setBounds(131, 220, 100, 50);
        JButton six = new JButton("6");
        six.setBounds(252, 220, 100, 50);
        JButton minus = new JButton("-");
        minus.setBounds(373, 220, 100, 50);

        // 4th Line
        JButton seven = new JButton("7");
        seven.setBounds(10, 280, 100, 50);
        JButton eight = new JButton("8");
        eight.setBounds(131, 280, 100, 50);
        JButton nine = new JButton("9");
        nine.setBounds(252, 280, 100, 50);
        JButton divide = new JButton("/");
        divide.setBounds(373, 280, 100, 50);

        // 5th Line
        JButton zero = new JButton("0");
        zero.setBounds(10, 340, 100, 50);
        JButton equalsto = new JButton("=");
        equalsto.setBounds(131, 340, 220, 50);
        JButton multiply = new JButton("x");
        multiply.setBounds(373, 340, 100, 50);
        // JButton reset = new JButton("O G");
        // reset.setBounds(373,100,100,50);

        // JButton jb = new JButton("reset");
        // jb.setBounds(10,100,100,50);
        // JButton jb = new JButton("reset");
        // jb.setBounds(10,100,100,50);

        // JLabel jl=new JLabel("Calculator");
        JTextField jtf = new JTextField("CALCULATE!");
        jtf.setBounds(10, 20, 465, 70);
        JFrame jframe = new JFrame();
        // jframe.setBounds(100, 90, 250, 40);
        jframe.add(jtf);
        // jframe.add(jl);
        //
        jframe.add(reset);
        jframe.add(mod);
        jframe.add(power);
        jframe.add(undrrt);
        reset.addActionListener(this);
        mod.addActionListener(this);
        power.addActionListener(this);
        undrrt.addActionListener(this);
        //
        jframe.add(one);
        jframe.add(two);
        jframe.add(three);
        jframe.add(plus);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        plus.addActionListener(this);
        //
        jframe.add(four);
        jframe.add(five);
        jframe.add(six);
        jframe.add(minus);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        minus.addActionListener(this);
        //
        jframe.add(seven);
        jframe.add(eight);
        jframe.add(nine);
        jframe.add(divide);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        divide.addActionListener(this);
        //
        jframe.add(zero);
        jframe.add(equalsto);
        jframe.add(multiply);
        zero.addActionListener(this);
        equalsto.addActionListener(this);
        multiply.addActionListener(this);
        // .addActionListener(this);
        //

        jframe.setTitle("Calculator");
        jframe.setLayout(null);
        jframe.setVisible(true);
        jframe.setSize(500, 450);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override public void actionPerformed(ActionEvent e){
        if(e.getSource()==reset){

        }
        if else(e.getSource()==one){

        }
        if else(e.getSource()==two){
            
        }
        if else(e.getSource()==three){
            
        }
        if else(e.getSource()==four){
            
        }
        if else(e.getSource()==five){
            
        }
        if else(e.getSource()==six){
            
        }
        if else(e.getSource()==seven){
            
        }
        if else(e.getSource()==eight){
            
        }
        if else(e.getSource()==nine){
            
        }
        if else(e.getSource()==zero){
            
        }
        if else(e.getSource()==plus){
            
        }
        if else(e.getSource()==minus){
            
        }
        if else(e.getSource()==divide){
            
        }
        if else(e.getSource()==multiply){
            
        }
        if else(e.getSource()==equalsto){
            
        }
        if else(e.getSource()==mod){
            
        }
        if else(e.getSource()==undrrt){
            
        }
        if else(e.getSource()==power){
            
        }
    }

    public static void main(String args[]) {

    }
}
