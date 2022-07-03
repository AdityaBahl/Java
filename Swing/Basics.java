import javax.swing.*;

public class Basics {
    // frame can be created in method or a constructor.
    public Basics() {
        JFrame jframe = new JFrame();
        jframe.setTitle("This is a normal frame");
        jframe.setLayout(null);
        jframe.setSize(400, 400);
        jframe.setVisible(true);
    }

    public static void main(String[] args) {
        Basics b = new Basics();
    }
}
////////////////////////////////////////
// alternate way (by extending JFrame)-
// public class Basics extends JFrame {
// // frame can be created in method or a constructor.
// public Basics() {
// setTitle("This is a normal frame");
// setLayout(null);
// setSize(400, 400);
// setVisible(true);
// }
//
// public static void main(String[] args) {
// Basics b = new Basics();
// }
// }
/////////////////////////////////////////

/////////////////////////////////////////
// alternate way (in Main Method)-
// public class Basics extends JFrame {
// // frame can be created in method or a constructor.
// public static void main(String[] args) {
// JFrame jframe = new JFrame();
// jframe.setTitle("This is a normal frame");
// jframe.setLayout(null);
// jframe.setSize(400, 400);
// jframe.setVisible(true);
// }
// }
/////////////////////////////////////////