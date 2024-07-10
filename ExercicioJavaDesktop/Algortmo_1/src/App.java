import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
  //CRINDO COMPONENTES
  static JLabel Label_Name = new JLabel ("Nome");




  public static void main (String [] args){
    JPanel window = new JPanel (new GridBagLayout () );

    window.add(Label_Name);
    window.setVisible(true);

  }

}
