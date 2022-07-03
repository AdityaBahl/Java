import java.awt.*;

public class Basics extends Frame {
    public Basics() {
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        Basics b = new Basics();

    }
}
//////////////////////////////////////

// Alternate way:-
// public class Basics {
// public Basics() {
// Frame frame = new Frame("hello first gui");
// frame.setSize(400, 300);
// frame.setVisible(true);
// frame.addWindowListener(new WindowAdapter() {
// @Override
// public void windowClosing(WindowEvent e) {
// frame.dispose();
// }
// });
// }
//
// public static void main(String[] args) {
// new Basics();
// }
// }
//
//////////////////////////////////////
