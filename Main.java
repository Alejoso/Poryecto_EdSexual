import javax.swing.JFrame;

public class Main {
  public static void main (String[] args) {

    JFrame frame = new JFrame ("Recordatorios");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add (new Interfaz());
    frame.pack();
    frame.setVisible (true);

}
}
