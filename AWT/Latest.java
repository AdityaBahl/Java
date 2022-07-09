import java.awt.*;
import java.awt.event.*;

class Latest extends Frame implements ActionListener {
    TextField tf;

    Latest() {
        // create components
        tf = new TextField();
        tf.setBounds(100, 120, 40, 50);
        Button b = new Button("Click Me");
        b.setBounds(120, 150, 40, 50);
        // register listener
        b.addActionListener(this);
        // add components and set size,layout,visibility
        add(b);
        add(tf);
        setSize(300, 300);
        setVisible(true);
        setLayout(null);

    }

    public void ActionPerformed(ActionListener e) {
        tf.setText("Welcome");
    }

    public static void main(String args[]) {
        new Latest();
    }
}