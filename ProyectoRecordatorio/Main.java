import javax.swing.JFrame;

public class Main {
  public static void main (String[] args) {
    JFrame frame = new JFrame ("gui");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add (new gui());
    frame.pack();
    frame.setVisible (true);
}
}
