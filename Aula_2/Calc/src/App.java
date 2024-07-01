import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class App extends JFrame{

    //criando componentes do form
    static JLabel lblnumero1= new JLabel("Numero 1 : ");
    static JTextField txtnumero1 = new JTextField(11);
    static JLabel lblnumero2  = new JLabel("Numero 2:");
    static JTextField txtnumero2 = new JTextField(11);
    static JButton btnmais = new JButton("+");
    static JButton btnmenos = new JButton("-");
    static JButton btnmult = new JButton("x");
    static JButton btndiv = new JButton("/");

    public static void main(String[] args) {
        App window = new App();
        window.setSize(100,100);
        window.setVisible(true);
        window.setTitle("Calc");
        window.setLayout(new FlowLayout());
    // adicionando os componentes ao formulario window

    window.getContentPane().add(lblnumero1);
    window.getContentPane().add(txtnumero1);
    window.getContentPane().add(lblnumero2);
    window.getContentPane().add(txtnumero2);
    window.getContentPane().add(btnmais);
    window.getContentPane().add(btnmenos);
    window.getContentPane().add(btnmult);
    window.getContentPane().add(btndiv);
    window.pack();
    }
}
